package br.com.danieldias.model;

import org.jnosql.artemis.Column;
import org.jnosql.artemis.Embeddable;

import javax.ws.rs.FormParam;

/**
 * @author daniel
 * github:Daniel-Dos
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
@Embeddable
public class Address {

    @FormParam("country")
    @Column
    private String country;

    @FormParam("state")
    @Column
    private String state;

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Address() {
        this("", "");
    }

    public Address(String state, String country) {
        super();
        this.country = country;
        this.state = state;
    }
}