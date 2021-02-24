package com.springmvc.q6;

import java.util.HashMap;

public class Zipi {

	private String a = new Employee().getCity();
	private int b = new Employee().getZip();

	public String getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public HashMap<String, Integer> gett() {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("O", 25);
		hm.put("M", 25);
		hm.put("K", 25);
		return hm;
	}

}
