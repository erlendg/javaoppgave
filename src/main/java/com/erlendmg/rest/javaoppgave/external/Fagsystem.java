/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erlendmg.rest.javaoppgave.external;

import com.erlendmg.rest.javaoppgave.model.Agreement;
import com.erlendmg.rest.javaoppgave.model.Customer;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Erlend
 */
public class Fagsystem {
    
    private static Map<Long, Customer> customers = new HashMap<>();
    private static Map<Long, Agreement> agreements = new HashMap<>();
    
    public static Map<Long, Customer> getCustomers(){
        return customers;
    }
    
    public static Map<Long, Agreement> getAgreements(){
        return agreements;
    }
    
}
