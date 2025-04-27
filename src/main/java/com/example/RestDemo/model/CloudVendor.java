package com.example.RestDemo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cloud_vendor")
public class CloudVendor
{
    @Id
    private String vendorID;
    private String VendorName;
    private String VendorAddress;
    private String VendorPhone;

    public CloudVendor() {
    }

    public CloudVendor(String vendorID, String vendorName, String vendorAddress, String vendorPhone) {
        this.vendorID = vendorID;
        this.VendorName = vendorName;
        this.VendorAddress = vendorAddress;
        this.VendorPhone = vendorPhone;
    }


    public String getVendorName() {
        return VendorName;
    }

    public void setVendorName(String vendorName) {
        VendorName = vendorName;
    }

    public String getVendorID() {
        return vendorID;
    }

    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }

    public String getVendorAddress() {
        return VendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        VendorAddress = vendorAddress;
    }

    public String getVendorPhone() {
        return VendorPhone;
    }

    public void setVendorPhone(String vendorPhone) {
        VendorPhone = vendorPhone;
    }
}
