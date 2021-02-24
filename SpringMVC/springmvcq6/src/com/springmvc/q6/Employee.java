package com.springmvc.q6;

import javax.validation.constraints.*;

public class Employee {
@NotNull
@Pattern(regexp = "^[a-zA-Z0-9]\s*")
@Size(min=8,max=20, message="size of name must be in between 8-20")
private String username;
@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\s)(?=.*[@$!%*#?&])[A-Za-z\s@$!%*#?&]{8,20}$")
@NotNull
private String password;
@NotNull 
@Email
private String email;
@Phone
private int contact;
@NotNull 
private String city;
@Size(min=6,max=6, message="size of name must be 6 digits")
@Va
private int zip;
public String getUsername() {
	return username;
}
public String getPassword() {
	return password;
}
public String getEmail() {
	return email;
}
public int getContact() {
	return contact;
}
public String getCity() {
	return city;
}
public int getZip() {
	return zip;
}
public void setUsername(String username) {
	this.username = username;
}
public void setPassword(String password) {
	this.password = password;
}
public void setEmail(String email) {
	this.email = email;
}
public void setContact(int contact) {
	this.contact = contact;
}
public void setCity(String city) {
	this.city = city;
}
public void setZip(int zip) {
	this.zip = zip;
}


}
