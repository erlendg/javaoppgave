/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erlendmg.rest.javaoppgave.service;

import com.erlendmg.rest.javaoppgave.external.Fagsystem;
import com.erlendmg.rest.javaoppgave.model.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Erlend
 */
public class CustomerService {
    
    FagsystemService fagsystemService = new FagsystemService();
    
    public CustomerService(){
        
    }
    
    public List<Customer> getAllCustomers(){
        return new ArrayList<Customer>(fagsystemService.getCustomers());
    }
}
