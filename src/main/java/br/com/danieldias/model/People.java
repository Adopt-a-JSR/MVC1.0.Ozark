package br.com.danieldias.model;

import javax.ws.rs.FormParam;

import org.bson.types.ObjectId;

/**
 * @author daniel
 * github:Daniel-Dos
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
public class People {

	@FormParam("_id")
	private ObjectId _id;
	
	@FormParam("name")
	private String name;
	
	@FormParam("age")
	private int age;

	@FormParam("address")
	private Address address;
	
	@FormParam("jugs")
	private String jugs;
	
	@FormParam("description")
	private String description;

	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}

	public People() {
	}
	
	public People(String name, Address address,
			String description,int age,
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