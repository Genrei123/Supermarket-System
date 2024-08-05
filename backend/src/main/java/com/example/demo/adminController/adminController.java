package com.example.demo.adminController;

import java.util.List;

import com.example.demo.exception.ResourceNotFoundException;
import org.apache.coyote.Response;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.adminModel.adminModel;
import com.example.demo.adminRepository.adminRepository;


@RestController
@RequestMapping("/api/v1/")
public class adminController {
	
	
	@Autowired
	private adminRepository repo;
	private AuthenticationManager authenticationManager;

	//login
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/admin")
	public ResponseEntity<String> login(@RequestBody loginRequest loginRequest) {
		Authentication authentication = aunthenticationManager.authenticate;
	}

	
	//get all
	/*
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/admin")
	public List <adminModel> getAllAdmins(){
		return repo.findAll();
	}*/

	//get admin by id
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/admin/{id}")
	public ResponseEntity<adminModel> getSpecificAdmin(@PathVariable Long id) {
		adminModel admin = repo.findById(id).
				orElseThrow(() -> new ResourceNotFoundException("Employee with id" + id + " does not exists"));
		return ResponseEntity.ok(admin);
	}

	//Get admin with matching username and password
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/admin")
	public adminModel login(@RequestBody adminModel admin) {
		return repo.save(admin);
	}





}
