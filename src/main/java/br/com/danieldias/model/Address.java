package br.com.danieldias.model;

import javax.ws.rs.FormParam;

/**
 * @author daniel
 * github:Daniel-Dos
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
public class Address {

    	@FormParam("country")
	private String country;

    	@FormParam("state")
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