package com.example.demo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	//Retrieval of whole data
	@GetMapping("/employees")
	public List<Employee> list(){
		return service.listAll();
	}
//Retrieving by id
	@GetMapping("/employees/{id}")
	public ResponseEntity <Employee> get(@PathVariable Integer id){
		try {
			Employee emp=service.get(id);
			return new  ResponseEntity<Employee> (emp,HttpStatus.OK );
		} catch (Exception e) {
			return new  ResponseEntity<Employee> (HttpStatus.NOT_FOUND);
			
		}
		
	
	} 
	//create
	@PostMapping("/employees")
	public void add(@RequestBody Employee emp) {
		service.save(emp);
	}
	
	//update
	@PutMapping("/employees{id}")
	public ResponseEntity<?> update(@RequestBody Employee emp,@PathVariable Integer id){
	
	try {
		Employee existEmp= service.get(id);
		service.save(emp);
		return new ResponseEntity <> (HttpStatus.OK);
	} catch (Exception e) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	
	}
	//Delete
	@DeleteMapping("/employees/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
}
    