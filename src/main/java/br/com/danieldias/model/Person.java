package br.com.danieldias.model;

import javax.ws.rs.BeanParam;
import javax.ws.rs.FormParam;

import org.bson.types.ObjectId;
import org.jnosql.artemis.Column;
import org.jnosql.artemis.Entity;
import org.jnosql.artemis.Id;

/**
 * @author daniel
 * github:Daniel-Dos
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
@Entity
public class Person {

    @FormParam("_id")
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

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    public Person() {
        this("", null, "", 0, "");
    }

    public Person(String name, Address address,
                  String description, int age,
                  String jugs) {
        super();
        this.name = name;
        this.address = address;
        this.description = description;
        this.age = age;
        this.jugs = jugs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ObjectId get_id() {
        return _id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJugs() {
        return jugs;
    }

    public void setJugs(String jugs) {
        this.jugs = jugs;
    }
}