package br.com.danieldias.model;

import javax.ws.rs.BeanParam;
import javax.ws.rs.FormParam;

import org.bson.types.ObjectId;
import org.jnosql.artemis.Column;
import org.jnosql.artemis.Entity;
import org.jnosql.artemis.Id;

import java.util.Objects;

/**
 * @author daniel
 * github:Daniel-Dos
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
@Entity
public class Person {

    @FormParam("id")
    @Id
    private String id;

    @FormParam("name")
    @Column
    private String name;

    @FormParam("age")
    @Column
    private int age;

    @BeanParam
    @Column
    private Address address;

    @FormParam("jugs")
    @Column
    private String jugs;

    @FormParam("description")
    @Column
    private String description;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public String getJugs() {
        return jugs;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", address=").append(address);
        sb.append(", jugs='").append(jugs).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}