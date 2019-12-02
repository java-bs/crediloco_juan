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
public class PrestamoPrendario extends Prestamo{
    private String garantia;
    
    public PrestamoPrendario(){
    }
    
    public PrestamoPrendario(BigDecimal monto, int plazoEnMeses, int cantidadCuotas, BigDecimal tasa, List<DocumentoDigital> documentos, String situacionVeraz){
        super(monto,plazoEnMeses,cantidadCuotas,tasa,documentos);
        this.garantia = garantia;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }
}
