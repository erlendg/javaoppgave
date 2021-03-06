/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erlendmg.rest.javaoppgave.service;

import com.erlendmg.rest.javaoppgave.external.Fagsystem;
import com.erlendmg.rest.javaoppgave.model.Agreement;
import com.erlendmg.rest.javaoppgave.model.Customer;
import com.erlendmg.rest.javaoppgave.model.NewAgreement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Erlend
 */
public class FagsystemService {
    
    private Map<Long, Agreement> agreements = Fagsystem.getAgreements();
    private Map<Long, Customer> customers = Fagsystem.getCustomers();
    
    public Agreement createAgreement(Agreement agreement) {
        agreement.setId(agreements.size()+1);
        agreements.put(agreement.getId(), agreement);
        return agreement;
    
    }
    
    public Agreement createAgreement(NewAgreement newAgreement, long customernumber){
        Agreement agreement = new Agreement(newAgreement, agreements.size()+1, customernumber, "Processing");
        agreements.put(agreement.getId(), agreement);
        return agreement;
    }
    
    public Customer createCustomer(Customer customer) {
        customer.setCustomerNumber(customers.size()+1);
        customers.put(customer.getCustomerNumber(), customer);
        return customer;
    
    }
    
    public Customer createCustomer(NewAgreement newAgreement){
        Customer customer = new Customer(newAgreement, customers.size()+1);
        customers.put(customer.getCustomerNumber(), customer);
        return customer;
    }

    public List<Customer> getCustomers() {
        return new ArrayList<Customer>(customers.values());
    }
    
    public List<Agreement> getAgreements(){
        return new ArrayList<Agreement>(agreements.values());
    }
    
    
}
