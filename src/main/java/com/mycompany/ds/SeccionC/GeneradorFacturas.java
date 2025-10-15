package com.mycompany.ds.SeccionC;

public class GeneradorFacturas {
    public void generarFactura(Pago pago) {
        System.out.println("Generando factura por $" + pago.getMonto());
    }
}
