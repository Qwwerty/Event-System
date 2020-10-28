/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import com.google.gson.Gson;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author qwerty
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "User.Find", query = "SELECT u.username, u.password, u.type FROM User u WHERE u.username = :password")
    ,
    @NamedQuery(name = "User.All", query = "SELECT u FROM User u")
})

public class User extends ObjetoBase {

    private String username;
    private String name;
    private String type;
    private String password;

    @Override
    public ObjetoBase toObjeto(String u) {
        Gson g = new Gson();
        try {
            User user = g.fromJson(u, User.class);

            MessageDigest md = null;
            md = MessageDigest.getInstance("MD5");

            md.update(user.getPassword().getBytes());
            byte[] hashMd5 = md.digest();

            String encrypt = this.stringHexa(hashMd5);

            //Password encrypt
            setId(user.getId());
            setName(user.getName());
            setPassword(encrypt);
            setType(user.getType());
            setUsername(user.getUsername());
            return this;

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }

        return this;
    }

    public String toStringVetor() {
        Gson g = new Gson();
        return g.toJson(this);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", name=" + name + ", type=" + type + ", password=" + password + '}';
    }

    private String stringHexa(byte[] bytes) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            int parteAlta = ((bytes[i] >> 4) & 0xf) << 4;
            int parteBaixa = bytes[i] & 0xf;
            if (parteAlta == 0) {
                s.append('0');
            }
            s.append(Integer.toHexString(parteAlta | parteBaixa));
        }
        return s.toString();
    }

    @Override
    public Boolean exportTable() {

        return false;
    }

}
