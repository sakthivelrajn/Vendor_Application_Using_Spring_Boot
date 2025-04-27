package com.example.RestDemo.service.impl;

import com.example.RestDemo.exception.CloudVendorNotFoundException;
import com.example.RestDemo.model.CloudVendor;
import com.example.RestDemo.repository.CloudVendorRepository;
import com.example.RestDemo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudVendorServiceImpl implements CloudVendorService {
    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    CloudVendorRepository cloudVendorRepository;
    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "creation Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Update Success";
    }

    @Override
    public String deleteCloudVendor(String vendorId) {
        cloudVendorRepository.deleteById(vendorId);
        return "delete success";
    }

    @Override
    public CloudVendor getCloudVendor(String vendorId) {
        if(cloudVendorRepository.findById(vendorId).isEmpty()){
            throw new CloudVendorNotFoundException("Request file not found in Data Base");
        }


        return  cloudVendorRepository.findById(vendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendorDetails() {
        return cloudVendorRepository.findAll();
    }
}
