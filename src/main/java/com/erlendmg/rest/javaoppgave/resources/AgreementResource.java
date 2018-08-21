/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erlendmg.rest.javaoppgave.resources;

import com.erlendmg.rest.javaoppgave.model.Agreement;
import com.erlendmg.rest.javaoppgave.model.NewAgreement;
import com.erlendmg.rest.javaoppgave.service.AgreementService;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Erlend
 */
@Path("/agreements")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AgreementResource {
    
    private AgreementService agreementService = new AgreementService();
    
    @POST
    public Agreement createNewAgreement(NewAgreement newAgreement){
        System.out.println("@POST createNewAgreement");
        Agreement agreement = agreementService.createNewAgreement(newAgreement);
        return agreement;
    }
    
    @GET
    public List<Agreement> getAllAgreements(){
        
        return agreementService.getAllAgreements();
    }
}
