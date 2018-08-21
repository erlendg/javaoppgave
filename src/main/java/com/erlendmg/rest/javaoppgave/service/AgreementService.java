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
import java.util.Map;

/**
 *
 * @author Erlend
 */
public class AgreementService {
    
    private FagsystemService fagsystemService = new FagsystemService();
    private CustomerService customerService = new CustomerService();
    private BrevtjenesteService brevtjenesteService = new BrevtjenesteService();
    
    public AgreementService(){
        
    }
    //Opprett Avtale
    //metode for å opprette ny forsikringsavtale
    public Agreement createNewAgreement(NewAgreement newAgreement){
        //Create new customer:
        Customer customer = customerService.createNewCustomer(newAgreement);
        //create agreement:
        Agreement agreement = createAgreement(newAgreement, customer.getCustomerNumber());
        
        //assign agreement to customer:
        customer.addAgreement(agreement);
        //Notify mailing-service:
        String status = brevtjenesteService.sendAgreement(agreement, customer);
        //Update status:
        agreement.setStatus(status);
        //return agreement-id and status:
        
        return agreement;
    }
    
    public Agreement createAgreement(Agreement agreement){
        return fagsystemService.createAgreement(agreement);
    }
    
    public Agreement createAgreement(NewAgreement newAgreement, long customerNumber){
        return fagsystemService.createAgreement(newAgreement, customerNumber);
    }
    
}
