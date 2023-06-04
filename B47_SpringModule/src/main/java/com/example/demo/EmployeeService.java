package com.example.demo;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;
	
	public List<Employee> listAll(){
	return repo.findAll();

}
	
	public Employee get(Integer id) {
		return repo.findById(id).get();
	}
	
	//creating
	public void save(Employee emp) {
		repo.save(emp);
	}
	
	 public void delete(Integer id) {
		  repo.deleteById(id);
	 }
	
	
	
	
	
	
}
 