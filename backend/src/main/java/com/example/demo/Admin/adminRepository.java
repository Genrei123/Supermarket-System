package com.example.demo.Admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface adminRepository extends JpaRepository<adminModel, Long> {

}
