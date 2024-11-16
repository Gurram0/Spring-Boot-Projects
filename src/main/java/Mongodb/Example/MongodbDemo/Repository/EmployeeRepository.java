package Mongodb.Example.MongodbDemo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import Mongodb.Example.MongodbDemo.Model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee,Long> {
	
}