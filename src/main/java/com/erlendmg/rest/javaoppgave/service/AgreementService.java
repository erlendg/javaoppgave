/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erlendmg.rest.javaoppgave.service;

import com.erlendmg.rest.javaoppgave.external.Fagsystem;
import com.erlendmg.rest.javaoppgave.model.Agreement;
import java.util.Map;

/**
 *
 * @author Erlend
 */
public class AgreementService {
    
    private FagsystemService fagsystemService = new FagsystemService();
    
    public AgreementService(){
        
    }
    //Opprett Avtale
    //metode for å opprette ny forsikringsavtale
    public Agreement createAgreement(Agreement agreement){
        agreement = fagsystemService.createAgreement(agreement);
        
        
        return null;
    }
    
}
