/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsaenz.crediloco_juan;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author fajardo
 */
public class Cliente {
    private String cuentaBancaria; 
    private String dni;
    private String nombreApellido; 
    private Domicilio domicilo;
    private BigDecimal ingresos;
    private DocumentoDigital dniDigitalizado;
    private List<Prestamo> prestamos;
    
    public Cliente(){
        
    }
    
    public Cliente(String cuentaBancaria, String dni, String nombreApellido, Domicilio domicilo, BigDecimal ingresos, DocumentoDigital dniDigitalizado,List<Prestamo> prestamos ){
        this.cuentaBancaria = cuentaBancaria;
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.domicilo = domicilo;
        this.ingresos = ingresos;
        this.dniDigitalizado = dniDigitalizado;
        this.prestamos = prestamos;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public Domicilio getDomicilo() {
        return domicilo;
    }

    public void setDomicilo(Domicilio domicilo) {
        this.domicilo = domicilo;
    }

    public BigDecimal getIngresos() {
        return ingresos;
    }

    public void setIngresos(BigDecimal ingresos) {
        this.ingresos = ingresos;
    }

    public DocumentoDigital getDniDigitalizado() {
        return dniDigitalizado;
    }

    public void setDniDigitalizado(DocumentoDigital dniDigitalizado) {
        this.dniDigitalizado = dniDigitalizado;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    
    public void cambiarDomicilio(Domicilio nuevoDomicilio){
        setDomicilo(nuevoDomicilio);
    }
    
    public void actualizarIngresos(DocumentoDigital recibo, BigDecimal monto){
       this.ingresos = monto;
    }
}
