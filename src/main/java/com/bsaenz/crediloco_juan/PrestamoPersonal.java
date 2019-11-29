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
public class PrestamoPersonal extends Prestamo{
    private String situacionVeraz;
    
    public PrestamoPersonal(){
        super();
    }
    
    public PrestamoPersonal(BigDecimal monto, int plazoEnMeses, int cantidadCuotas, BigDecimal tasa, List<DocumentoDigital> documentos, String situacionVeraz){
        super(monto,plazoEnMeses,cantidadCuotas,tasa,documentos);
        this.situacionVeraz = situacionVeraz;
    }

    public String getSituacionVeraz() {
        return situacionVeraz;
    }

    public void setSituacionVeraz(String situacionVeraz) {
        this.situacionVeraz = situacionVeraz;
    }
    
}
