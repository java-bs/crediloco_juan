/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsaenz.crediloco_juan;

/**
 *
 * @author fajardo
 */
public class Domicilio {
    private String calle;
    private int numero;
    private String piso;
    private String provincia;
    
    public Domicilio(){
        
    }
    public Domicilio(String calle, int numero, String piso, String provincia){
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.provincia = provincia;
    }
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
