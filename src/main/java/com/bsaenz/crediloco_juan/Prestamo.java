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
public class Prestamo {
    private BigDecimal monto;
    private int plazoEnMeses;
    private int cantidadCuotas;
    private BigDecimal tasa;
    private List<DocumentoDigital> documentos;

    public Prestamo() {
    }

    public Prestamo(BigDecimal monto, int plazoEnMeses, int cantidadCuotas, BigDecimal tasa, List<DocumentoDigital> documentos) {
        this.monto = monto;
        this.plazoEnMeses = plazoEnMeses;
        this.cantidadCuotas = cantidadCuotas;
        this.tasa = tasa;
        this.documentos = documentos;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public int getPlazoEnMeses() {
        return plazoEnMeses;
    }

    public void setPlazoEnMeses(int plazoEnMeses) {
        this.plazoEnMeses = plazoEnMeses;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public BigDecimal getTasa() {
        return tasa;
    }

    public void setTasa(BigDecimal tasa) {
        this.tasa = tasa;
    }

    public List<DocumentoDigital> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<DocumentoDigital> documentos) {
        this.documentos = documentos;
    }

    public boolean cancelarCuotas(int cantidad) {
        if ( cantidadCuotas - cantidad >= 0 ) {
            setCantidadCuotas(cantidadCuotas - cantidad);
            return true;
        } else {
            return false;
        }
    }

    public void cancelarPrestamo() {
        this.cantidadCuotas = 0;
    }
}
