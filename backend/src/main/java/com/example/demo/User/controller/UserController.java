package com.example.demo.User.controller;


import com.example.demo.User.dao.UserDao;
import com.example.demo.User.entity.User;
import com.example.demo.User.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.lang.module.ResolutionException;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserDao user;

    @PostConstruct
    public void initRoleAndUser() {
        userService.initRoleAndUser();
    }

    @PostMapping({"/registerNewUser"})
    public User registerNewUser(@RequestBody User user) {
        return userService.registerNewUser(user);
    }

    @GetMapping({"/forAdmin"})
    @PreAuthorize("hasRole('Admin')")
    public String forAdmin(){
        return "This URL is only accessible to the admin";
    }

    @GetMapping({"/forUser"})
    @PreAuthorize("hasRole('User')")
    public String forUser(){
        return "This URL is only accessible to the user";
    }

    @GetMapping({"/user/{userName}"})
    @PreAuthorize("hasAnyRole('User', 'Admin')")
    public ResponseEntity <User> user(@PathVariable String userName){
        User User = user.findById(userName).orElseThrow(() -> new ResolutionException("User Not Found"));
        return ResponseEntity.ok(User);
    }

    //	// get data by id
//	@CrossOrigin(origins = "http://localhost:4200")
//	@GetMapping("/employees/{id}")
//	public ResponseEntity<itemModel> getByID(@PathVariable Long id) {
//		itemModel employee = itemRepository.findById(id).
//				orElseThrow(()-> new ResourceNotFoundException("Employee with id "+id+"does not exists"));
//		return ResponseEntity.ok(employee);
//	}
//
}
