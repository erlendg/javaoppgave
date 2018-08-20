/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erlendmg.rest.javaoppgave.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Erlend
 */
@XmlRootElement
public class Agreement {
    
    private long id;
    private long customernumber;
    private String status;
    private String details;

    public Agreement() {
    }

    public Agreement(long id, long customernumber, String status, String details) {
        this.id = id;
        this.customernumber = customernumber;
        this.status = status;
        this.details = details;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCustomernumber() {
        return customernumber;
    }

    public void setCustomernumber(long customernumber) {
        this.customernumber = customernumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    
    
}
