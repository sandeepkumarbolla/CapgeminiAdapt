package io.springmvc.q2;

public class SimpleIntrest {
	
	 private int Time;
     private int Rate;
     private int Amount;
     private int aa;
     private int bb;

     
     public int getAa() {
    	 aa=(Time*Rate*Amount)/100;
		return aa;
	}
	public int getBb() {
		bb=Amount+((Time*Rate*Amount)/100);
		return bb;
	}
	 public int getTime() {return Time;}
     public int getRate() {return Rate;}
     public int getAmount() {return Amount;}
     
   
	public void setTime(int time) {Time = time;}
     public void setRate(int rate) {Rate = rate;}
     public void setAmount(int amount) {Amount = amount;}

}
