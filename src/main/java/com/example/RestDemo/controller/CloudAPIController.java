package com.example.RestDemo.controller;

import com.example.RestDemo.model.CloudVendor;
import com.example.RestDemo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIController
{
    CloudVendorService cloudVendorService;
    public CloudAPIController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }


    @GetMapping("{vendorId}")
   public CloudVendor getVendorDetails(@PathVariable("vendorId") String vendorId){

       return cloudVendorService.getCloudVendor(vendorId);
   }
    @GetMapping()
    public List<CloudVendor> getAllVendorDetails(){

        return cloudVendorService.getAllCloudVendorDetails();
    }
   @PostMapping
    public String  postVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        return"Create success";
   }
   @PutMapping
    public String updateVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Update Success";
   }
   @DeleteMapping("{vendorId}")
   public String deleteVendorDetails(@PathVariable("vendorId") String vendorId){
       cloudVendorService.deleteCloudVendor(vendorId);
       return "delete successfully";

   }
}
