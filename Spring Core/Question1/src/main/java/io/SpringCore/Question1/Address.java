package io.SpringCore.Question1;
import org.springframework.stereotype.Component;
@Component
public class Address {
       private String country;
       private String city;
       private String state;
       private int zip;
       private String street;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void getAddress() {
		System.out.println("Country is "+country+" \nState is "+state+" \nStreet is "+street+" \nZipcode is "+zip);
	}
}
