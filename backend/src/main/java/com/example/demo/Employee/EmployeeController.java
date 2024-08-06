package com.example.demo.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import exception.ResourceNotFoundException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	//get all data
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/employees")
	public List <EmployeeModel> getAllEmployees(){
		return employeeRepository.findAll();
	}  
	
	
	
	//create 
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/employees")
	public EmployeeModel createEmployee(@RequestBody EmployeeModel employeeModel)
	{
		return employeeRepository.save(employeeModel);
	}
	
	
	// get data by id 
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/employees/{id}")
	public ResponseEntity<EmployeeModel> getByID(@PathVariable Long id) {
		EmployeeModel employeeModel = employeeRepository.findById(id).
				orElseThrow(()-> new ResourceNotFoundException("Employee with id "+id+"does not exists"));
		return ResponseEntity.ok(employeeModel);
	}
	
	
	//update data 
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping ("/employees/{id}")
	public ResponseEntity<EmployeeModel> updateEmployeeByID(@PathVariable Long id, @RequestBody EmployeeModel employeeModelDetails){
		EmployeeModel employeeModel = employeeRepository.findById(id).
				orElseThrow(()-> new ResourceNotFoundException("Employee with id "+id+"does not exists"));
		
		
		employeeModel.setFname(employeeModelDetails.getFname());
		employeeModel.setLname(employeeModelDetails.getLname());
		employeeModel.setEmail(employeeModelDetails.getEmail());
		employeeModel.setDepartment(employeeModelDetails.getDepartment());
		employeeModel.setDesignation(employeeModelDetails.getDesignation());
		employeeModel.setJoiningDate(employeeModelDetails.getJoiningDate());
		employeeModel.setSalary(employeeModelDetails.getSalary());
		
		EmployeeModel updatedEmployeeModel =employeeRepository.save(employeeModel);
		
		return ResponseEntity.ok(updatedEmployeeModel);
}
	
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/employees/{id}")
	public ResponseEntity <Map<String, Boolean> >deleteEmployee(@PathVariable Long id){
		
		
		EmployeeModel employeeModel = employeeRepository.findById(id).
				orElseThrow(()-> new ResourceNotFoundException("Employee with id "+id+"does not exists"));
		
		employeeRepository.delete(employeeModel);
		
		Map<String, Boolean>  response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	
}
	
	
	
	
	
	
	
	
	
	
}