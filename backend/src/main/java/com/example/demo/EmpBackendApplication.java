package com.example.demo;

import com.example.demo.Receipt.ReceiptMaker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.FileNotFoundException;
import java.io.IOException;

@SpringBootApplication
@CrossOrigin(origins = "http://localhost:4200")
public class EmpBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpBackendApplication.class, args);
	}

}
