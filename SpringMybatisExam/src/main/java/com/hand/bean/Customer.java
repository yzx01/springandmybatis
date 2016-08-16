package com.hand.bean;

import java.util.Date;

public class Customer {

    private Integer customerid;
    private Integer storeid;
    private String firstname;
    private String lastname;
    private String email;
    private Integer addressid;
    private Integer active;
    private Date createdate;
    private String lastupdate;

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(String lastupdate) {
        this.lastupdate = lastupdate;
    }

    public Integer getStoreid() {
        return storeid;
    }

    public void setStoreid(Integer storeid) {
        this.storeid = storeid;
    }

    public Customer() {
    }

    public Customer(Integer storeid, String firstname, String lastname, String email, Integer addressid, Date createdate) {
        this.storeid = storeid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.addressid = addressid;
        this.createdate = createdate;
        this.email = email;
    }

    public Customer(String first_name, String last_name) {
        this.firstname = first_name;
        this.lastname = last_name;
    }
}
