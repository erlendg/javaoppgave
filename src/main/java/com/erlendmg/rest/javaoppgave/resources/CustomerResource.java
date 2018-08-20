/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erlendmg.rest.javaoppgave.resources;

import com.erlendmg.rest.javaoppgave.model.Customer;
import com.erlendmg.rest.javaoppgave.service.CustomerService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Erlend
 */
@Path("/customers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {
    
    private CustomerService customerService = new CustomerService();
    
    @GET
    public List<Customer> getCustomers(){
        return customerService.getAllCustomers();
    }
    
}
