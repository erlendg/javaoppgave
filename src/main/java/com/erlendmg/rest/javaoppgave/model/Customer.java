/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erlendmg.rest.javaoppgave.model;

import java.util.Date;
import java.util.Map;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Erlend
 */
@XmlRootElement
public class Customer {
    
    private long kundenummer;
    private String fornavn;
    private String etternavn;
    private String epost;
    private int tlf;
    private int mobil;
    private Date opprettet;
    
    //private Map<Long, Avtale> avtaler;

    public Customer() {
    }

    public Customer(long kundenummer, String fornavn, String etternavn, String epost, int tlf, int mobil) {
        this.kundenummer = kundenummer;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.epost = epost;
        this.tlf = tlf;
        this.mobil = mobil;
        this.opprettet = new Date();
    }

    public long getKundenummer() {
        return kundenummer;
    }

    public void setKundenummer(long kundenummer) {
        this.kundenummer = kundenummer;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public int getMobil() {
        return mobil;
    }

    public void setMobil(int mobil) {
        this.mobil = mobil;
    }

    public Date getOpprettet() {
        return opprettet;
    }

    public void setOpprettet(Date opprettet) {
        this.opprettet = opprettet;
    }
    
    
    
    
    
   
}
