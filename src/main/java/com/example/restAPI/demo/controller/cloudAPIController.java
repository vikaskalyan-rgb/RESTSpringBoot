package com.example.restAPI.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restAPI.demo.domain.CloudVendor;
import com.example.restAPI.demo.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class cloudAPIController {
	@Autowired
	CloudVendorService cloudVendorService;
	
	@GetMapping("/getData")
	public CloudVendor getCloudVendorDetails(@Param("vendorId")String vendorId) {
		return cloudVendorService.getCloudVendor(vendorId);		
	}
	
	@GetMapping("/getAllData")
	public List<CloudVendor> getAllVendorDetails() {
		return cloudVendorService.getAllCloudVendors();	
	}
	
	@PostMapping("/createData")
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		return cloudVendorService.createCloudVendor(cloudVendor);
	}
	
	@PutMapping("/updateData")
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		return cloudVendorService.updateCloudVendor(cloudVendor);
	}
	
	@DeleteMapping("/deleteData/{vendorId}")
	public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId)
	{
		return cloudVendorService.deleteCloudVendor(vendorId);
	}
	
	
	

}
