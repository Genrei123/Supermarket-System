package com.example.demo.Admin;

import java.util.List;

import exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/")
public class adminController {
	
	
	@Autowired
	private adminRepository repo;


	
	//get all
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/admin")
	public List <adminModel> getAllAdmins(){
		return repo.findAll();
	}

	//get admin by id
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/admin/{id}")
	public ResponseEntity<adminModel> getSpecificAdmin(@PathVariable Long id) {
		adminModel admin = repo.findById(id).
				orElseThrow(() -> new ResourceNotFoundException("Employee with id" + id + " does not exists"));
		return ResponseEntity.ok(admin);
	}

//	//Get admin with matching username and password
//	@CrossOrigin(origins = "http://localhost:4200")
//	@PostMapping("/admin")
//	public adminModel login(@RequestBody adminModel admin) {
//		return repo.save(admin);
//	}





}
