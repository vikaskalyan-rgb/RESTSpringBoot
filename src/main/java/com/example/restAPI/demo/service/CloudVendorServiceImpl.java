package com.example.restAPI.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restAPI.demo.domain.CloudVendor;
import com.example.restAPI.demo.exception.CloudVendorNotFoundException;
@Service
public class CloudVendorServiceImpl implements CloudVendorService {
	@Autowired
	CloudVendorRepository cloudVendorRepository;

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Successfully cloudVendor Created!";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "VendorDetails Updated";
	}

	@Override
	public String deleteCloudVendor(String vendorId) {
		cloudVendorRepository.deleteById(vendorId);
		return "Successfully Vendor Details Deleted";
	}

	@Override
	public CloudVendor getCloudVendor(String vendorId) {
		Optional<CloudVendor> cloudVendor = cloudVendorRepository.findById(vendorId);
		if(cloudVendor.isEmpty())
            throw new CloudVendorNotFoundException("Requested Cloud Vendor does not exist");
		return cloudVendor.get();
	}

	@Override
	public List<CloudVendor> getAllCloudVendors() {
		return cloudVendorRepository.findAll();
	}

}