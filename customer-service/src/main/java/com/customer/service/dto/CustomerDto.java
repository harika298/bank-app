package com.customer.service.dto;

public class CustomerDto {

    public int custId;
    public String name;
    public String address;
    public String phone;
    public String email;

    public CustomerDto() {
    }

    public CustomerDto(int custId, String name, String address, String phone, String email) {
        this.custId = custId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "custId=" + custId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
