/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erlendmg.rest.javaoppgave.service;

import com.erlendmg.rest.javaoppgave.model.Agreement;
import com.erlendmg.rest.javaoppgave.model.Customer;

/**
 *
 * @author Erlend
 */
public class BrevtjenesteService {

    public BrevtjenesteService() {
    }
    
    public String sendAgreement(Agreement agreement, Customer customer){
        if(agreement != null && customer != null){
            return "sendt";
        } else {
            return "feil";
        }
        
    }
    
   
}
