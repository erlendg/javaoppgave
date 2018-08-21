/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erlendmg.rest.javaoppgave.service;

import com.erlendmg.rest.javaoppgave.external.Brevtjeneste;
import com.erlendmg.rest.javaoppgave.model.Agreement;
import com.erlendmg.rest.javaoppgave.model.Customer;

/**
 *
 * @author Erlend
 */
public class BrevtjenesteService {
    
    private Brevtjeneste brevtjeneste = new Brevtjeneste();
    
    public BrevtjenesteService() {
    }
    
    public String sendAgreement(Agreement agreement, Customer customer){
        System.out.println("BrevtjenesteService: sendAgreement");
        return brevtjeneste.queueMail(agreement, customer);
        
    }
    
   
}
