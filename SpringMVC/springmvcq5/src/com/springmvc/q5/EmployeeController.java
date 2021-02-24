package com.springmvc.q5;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@RequestMapping(value = "/mani/{act}/{id}", method = RequestMethod.GET)
	public ModelAndView getValues(@PathVariable Map<String, String> p) {
		ModelAndView mv = new ModelAndView("login");

		
	    String act = p.get("act"); String id = p.get("id");
		 
		String a = "";

		if (act.equals("delete")) {
			a = "DELETE FROM employee WHERE employee_id='" + id + "'";
			mv.addObject("mani", "Employee Table After Deletion");
		}
		if (act.equals("findall")) {
			a = "SELECT * FROM employee";
			mv.addObject("mani", " Employee Table");
		}

		ArrayList<EmployeeDtails> ll = Connectdb.getDetails(a);
		
		if(id.equals("p")) {
			return new ModelAndView(new exel(),"list",ll);
		}
		if(id.equals("x")) {
			return new ModelAndView(new Pdf(),"list",ll);
		}

		mv.addObject("list", ll);
		return mv;
	}

	@RequestMapping(value = "/ma/{act}/{id}", method = RequestMethod.GET)
	public ModelAndView getVal(@PathVariable Map<String, String> p) {
		ModelAndView mv = new ModelAndView("addandedit");

		String act = p.get("act");
		String id = p.get("id");
		
		if(act.equals("search")) {mv.addObject("bingo", "Search with any one attribute");}
		else {mv.addObject("bingo", act);}
		mv.addObject("id", id);

		return mv;
	}

	@RequestMapping(value = "/mani2/{act}/{id}", method = RequestMethod.POST)
	public ModelAndView getValues(@PathVariable Map<String, String> p, @ModelAttribute("user") EmployeeDtails u) {
		ModelAndView mv = new ModelAndView("login");

		String act = p.get("act");
		String id = p.get("id");

		String a = "";
		if (act.equals("search")) {
			if(!u.getEid().equals("null")) {a = "SELECT * FROM employee WHERE employee_id='" + u.getEid() + "'";}
			if(!u.getEname().equals("null")) {a = "SELECT * FROM employee WHERE employee_id='" + u.getEname() + "'";}
			if(!u.getEdepartment().equals("null")) {a = "SELECT * FROM employee WHERE employee_id='" + u.getEdepartment() + "'";}
			if(!u.getEdesignation().equals("null")) {a = "SELECT * FROM employee WHERE employee_id='" + u.getEdesignation() + "'";}
			if(u.getEsalary()!=0) {a = "SELECT * FROM employee WHERE employee_id='" + u.getEsalary() + "'";}
			
			mv.addObject("mani", "Table After Search");
		}
		
		
		if (act.equals("add")) {
			a = "INSERT INTO Registration(employee_id, employee_name, employee_department, employee_designation, employee_salary) "
					+ "VALUES ('" + u.getEid() + "', '" + u.getEname() + "', '" + u.getEdepartment() + "', '"
					+ u.getEdesignation() + "', '" + u.getEsalary() + "')";
			mv.addObject("mani", "New Employee Table");
		}
		
		
		if (act.equals("edit")) {
			a = "UPDATE employee SET employee_id= '" + u.getEid() + "',employee_name = '" + u.getEname()
					+ "',employee_department = '" + u.getEdepartment() + "' ,employee_designation = '"
					+ u.getEdesignation() + "' ,employee_salary = '" + u.getEsalary() + "' WHERE employee_id='" + id
					+ "'";
			mv.addObject("mani", "Updated Employee Table");
		}

		ArrayList<EmployeeDtails> ll = Connectdb.getDetails(a);

		mv.addObject("list", ll);
		return mv;
	}

}
