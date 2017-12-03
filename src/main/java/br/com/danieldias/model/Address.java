package br.com.danieldias.model;

import org.jnosql.artemis.Column;
import org.jnosql.artemis.Embeddable;

import javax.ws.rs.FormParam;
import java.util.Objects;

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

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return Objects.equals(country, address.country) &&
                Objects.equals(state, address.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, state);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("country='").append(country).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append('}');
        return sb.toString();
    }
}