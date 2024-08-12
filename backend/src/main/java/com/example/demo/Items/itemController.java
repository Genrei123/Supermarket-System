package com.example.demo.Items;

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

import com.example.demo.ResourceNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class itemController {

	@Autowired
	private itemRepository itemRepository;
	
	// Get data where quantity > 0
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/items")
	public List <itemModel> getAllItems() {
		// Make sure item is valid
		List<itemModel> check = itemRepository.findAll();

		List <itemModel> result = new ArrayList<itemModel>();
		for (itemModel item : check) {
			if (item.getQuantity() > 0) {
				result.add(item);
			}
		}
		return result;
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/add")
	public itemModel addItem(@RequestBody itemModel itemModel) {
		System.out.println(itemModel);
		return itemRepository.save(itemModel);
	}
	
//	//create
//	@CrossOrigin(origins = "http://localhost:4200")
//	@PostMapping("/employees")
//	public itemModel createEmployee(@RequestBody itemModel employee)
//	{
//		return itemRepository.save(employee);
//	}
	
	
//	// get data by id
//	@CrossOrigin(origins = "http://localhost:4200")
//	@GetMapping("/employees/{id}")
//	public ResponseEntity<itemModel> getByID(@PathVariable Long id) {
//		itemModel employee = itemRepository.findById(id).
//				orElseThrow(()-> new ResourceNotFoundException("Employee with id "+id+"does not exists"));
//		return ResponseEntity.ok(employee);
//	}
//
	
//	//update data
//	@CrossOrigin(origins = "http://localhost:4200")
//	@PutMapping ("/employees/{id}")
//	public ResponseEntity<itemModel> updateEmployeeByID(@PathVariable Long id, @RequestBody itemModel employeeDetails){
//		itemModel employee = itemRepository.findById(id).
//				orElseThrow(()-> new ResourceNotFoundException("Employee with id "+id+"does not exists"));
//
//
//		employee.setFname(employeeDetails.getFname());
//		employee.setLname(employeeDetails.getLname());
//		employee.setEmail(employeeDetails.getEmail());
//		employee.setDepartment(employeeDetails.getDepartment());
//		employee.setDesignation(employeeDetails.getDesignation());
//		employee.setJoiningDate(employeeDetails.getJoiningDate());
//		employee.setSalary(employeeDetails.getSalary());
//
//		itemModel updatedEmployee= itemRepository.save(employee);
//
//		return ResponseEntity.ok(updatedEmployee);
//}
//
//
//
//	@CrossOrigin(origins = "http://localhost:4200")
//	@DeleteMapping("/employees/{id}")
//	public ResponseEntity <Map<String, Boolean> >deleteEmployee(@PathVariable Long id){
//
//
//		itemModel employee = itemRepository.findById(id).
//				orElseThrow(()-> new ResourceNotFoundException("Employee with id "+id+"does not exists"));
//
//		itemRepository.delete(employee);
//
//		Map<String, Boolean>  response = new HashMap<>();
//		response.put("Deleted", Boolean.TRUE);
//		return ResponseEntity.ok(response);
//
//}










}