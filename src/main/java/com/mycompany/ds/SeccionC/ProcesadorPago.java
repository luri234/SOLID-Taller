package com.mycompany.ds.SeccionC;

public class ProcesadorPago {
    public void realizarCobro(Pago pago) {
        System.out.println("Realizando cobro de $" + pago.getMonto());
    }
}
