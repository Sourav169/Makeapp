package com.example.admin.fieldmarshall;

public class UserId {
    String customerId;
    String customerName;
    String customerAddress;
    String streetAddress;
    String districtAddress;
    String cityAddress;
    String emailAddress;
    String pinAddress;
    String designationId;
    String phNo;
    String customerGenre;
    String customerBusiness;

    public UserId() {


    }

    public UserId(String customerId, String customerName, String customerAddress, String streetAddress, String districtAddress, String cityAddress, String emailAddress, String pinAddress, String designationId, String phNo, String customerGenre, String customerBusiness) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.streetAddress = streetAddress;
        this.districtAddress = districtAddress;
        this.cityAddress = cityAddress;
        this.emailAddress = emailAddress;
        this.pinAddress = pinAddress;
        this.designationId = designationId;
        this.phNo = phNo;
        this.customerGenre = customerGenre;
        this.customerBusiness = customerBusiness;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getDistrictAddress() {
        return districtAddress;
    }

    public String getCityAddress() {
        return cityAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPinAddress() {
        return pinAddress;
    }

    public String getDesignationId() {
        return designationId;
    }

    public String getPhNo() {
        return phNo;
    }

    public String getCustomerGenre() {
        return customerGenre;
    }

    public String getCustomerBusiness() {
        return customerBusiness;
    }
}