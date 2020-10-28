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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author qwerty
 */
@Entity
@NamedQueries({
    @NamedQuery(name="People.All", query="SELECT p FROM People p"),
    @NamedQuery(name="People.ExistCPF", query="SELECT count(*) FROM People p WHERE p.CFP = :cpf"),
    @NamedQuery(name="People.ExistRegistrationNumber", query="SELECT count(*) FROM People p WHERE p.registrationNumber = :number"),
})
public class People extends ObjetoBase {

    private String name;
    private String CFP;
    private String RG;
    private String adress;
    private String city;
    private String phone;
    private String email;
    private String registrationNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCFP() {
        return CFP;
    }

    public void setCFP(String CFP) {
        this.CFP = CFP;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toStringVetor() {
        Gson g = new Gson();
        return g.toJson(this);
    }

    @Override
    public ObjetoBase toObjeto(String dados) {
        Gson g = new Gson();
        People people = g.fromJson(dados, this.getClass());

        setId(people.getId());
        setAdress(people.getAdress());
        setCFP(people.getCFP());
        setCity(people.getCity());
        setEmail(people.getEmail());
        setName(people.getName());
        setPhone(people.getPhone());
        setRG(people.getRG());
        setRegistrationNumber(people.getRegistrationNumber());

        return this;
    }

    @Override
    public Boolean exportTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
