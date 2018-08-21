/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erlendmg.rest.javaoppgave.model;

import java.util.Date;
import java.util.Map;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Erlend
 */
@XmlRootElement
public class Customer {
    
    private long customerNumber;
    private String firstName;
    private String lastName;
    private String email;
    private int phone;
    private int mobile;
    private Date created;
    
    private Map<Long, Agreement> agreements;

    public Customer() {
    }

    public Customer(long customerNumber, String firstName, String lastName, String email, int phone, int mobile) {
        this.customerNumber = customerNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.mobile = mobile;
        this.created = new Date();
    }

    public Customer(NewAgreement newAgreement, long customerNumber){
        this.customerNumber = customerNumber;
        this.firstName = newAgreement.getFirstName();
        this.lastName = newAgreement.getLastName();
        this.email = newAgreement.getEmail();
        this.phone = newAgreement.getPhone();
        this.mobile = newAgreement.getMobile();
        this.created = new Date();
    }
    
    public long getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(long customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Map<Long, Agreement> getAvtaler() {
        return agreements;
    }

    public void setAvtaler(Map<Long, Agreement> avtaler) {
        this.agreements = avtaler;
    }
    
    public void addAgreement(Agreement agreement){
        agreements.put(agreement.getId(), agreement);
    }
  
}
