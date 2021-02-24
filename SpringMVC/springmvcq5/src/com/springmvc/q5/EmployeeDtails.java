package com.springmvc.q5;


public class EmployeeDtails {
	
	private String eid;
	private String ename;
	private String edepartment;
	private String edesignation;
	private int esalary;
	private static int a=4; 

	public EmployeeDtails(String eid, String ename, String edepartment, String edesignation, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edepartment = edepartment;
		this.edesignation = edesignation;
		this.esalary = esalary;
	}
	public String getEid() {
		if(eid.equals("null")) {this.eid="E0"+(a++);}
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public String getEdepartment() {
		return edepartment;
	}
	public String getEdesignation() {
		return edesignation;
	}
	public int getEsalary() {
		return esalary;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setEdepartment(String edepartment) {
		this.edepartment = edepartment;
	}
	public void setEdesignation(String edesignation) {
		this.edesignation = edesignation;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}

}
