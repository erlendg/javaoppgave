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
public class Brevtjeneste {
    
     public Brevtjeneste(){
         
     }
     
     public String queueMail(Agreement agreement, Customer customer){
         if(agreement != null && customer != null){
            return "sendt";
        } else {
            return "feil";
        }
     }
    
}
