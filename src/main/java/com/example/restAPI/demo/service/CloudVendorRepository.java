package com.example.restAPI.demo.service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restAPI.demo.domain.CloudVendor;
@Repository
public interface CloudVendorRepository extends JpaRepository<CloudVendor,String>{
	
}
