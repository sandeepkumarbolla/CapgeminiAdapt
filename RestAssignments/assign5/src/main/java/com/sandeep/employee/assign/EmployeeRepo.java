package com.sandeep.employee.assign;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepo extends MongoRepository<Employee, Integer> {

}

