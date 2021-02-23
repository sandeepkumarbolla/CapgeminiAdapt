package io.SpringCore.Question1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
     private int customerId;
     private String customerName;
     private int customerNumber;
     @Autowired
     private Address customerAddress;
	public int getCustomerId() {
		System.out.println("Customer Id is "+customerId);
		return 0;
	}
	public void setCutomerId(int customerId) {
		this.customerId = customerId;
			
	}
	public String getCustomerName() {
	      System.out.println("Customer name is "+customerName);	
	 return null;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerNumber() {
		 System.out.println("Customer number is "+customerNumber);
		return 0;
	}
	public void setCustmerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
//	 public Address getAddress() {
//		 System.out.println(country);
//		return customerAddress;
//		 
//	 }
     
}
