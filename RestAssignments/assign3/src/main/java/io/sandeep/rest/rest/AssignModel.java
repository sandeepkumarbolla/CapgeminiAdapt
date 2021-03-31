package io.sandeep.rest.rest;

public class AssignModel {
	private String state;
	private String city;
	private String country;
	private String pin;
	
	
	
	
	public AssignModel() {
		
	}
	public AssignModel(String state, String city, String country, String pin) {
		
		this.state = state;
		this.city = city;
		this.country = country;
		this.pin = pin;
	}
	public String getState() {
		return state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public void setState(String state) {
		this.state = state;
	}

}
