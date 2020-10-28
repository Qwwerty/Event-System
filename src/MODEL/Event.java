/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import com.google.gson.Gson;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author qwerty
 */
@Entity
@NamedQueries({
    @NamedQuery(name="Event.All", query="SELECT e FROM Event e"),
})
public class Event extends ObjetoBase {

    private String name;
    private String description;
    private int capacity;
    private String realizationAdress;
    private String timeStart;
    private String timeFinish;

    public Event() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRealizationAdress(String realizationAdress) {
        this.realizationAdress = realizationAdress;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public void setTimeFinish(String timeFinish) {
        this.timeFinish = timeFinish;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getRealizationAdress() {
        return realizationAdress;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public String getTimeFinish() {
        return timeFinish;
    }

    @Override
    public String toStringVetor() {
        Gson g = new Gson();
        return g.toJson(this);
    }

    @Override
    public ObjetoBase toObjeto(String e) {
        Gson g = new Gson();
        Event event = g.fromJson(e, this.getClass());

        setId(event.getId());
        setName(event.getName());
        setDescription(event.getDescription());
        setCapacity(event.getCapacity());
        setRealizationAdress(event.getRealizationAdress());
        setTimeStart(event.getTimeStart());
        setTimeFinish(event.getTimeFinish());

        return this;
    }

    @Override
    public Boolean exportTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
