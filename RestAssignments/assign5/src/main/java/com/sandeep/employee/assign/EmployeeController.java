package com.sandeep.employee.assign;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepo repository;
	@PostMapping("/addEmployess")
	public String saveBook(@RequestBody Employee employee) {
		repository.save(employee);
		
		return "Added book with id : " + employee.getId();
	}

	@GetMapping("/findAllEmployees")
	public List<Employee> getBooks() {
		return repository.findAll();
	}

	@GetMapping("/findAllEmployees/{id}")
	public Optional<Employee> getBook(@PathVariable int id) {
		return repository.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) {
		repository.deleteById(id);
		return "book deleted with id : " + id;
	}

}




