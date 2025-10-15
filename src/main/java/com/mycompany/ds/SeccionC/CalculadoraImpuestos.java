package com.mycompany.ds.SeccionC;
public class CalculadoraImpuestos {
    public double calcularImpuestos(Pago pago) {
        double impuesto = pago.getMonto() * 0.12; // ejemplo: 12%
        System.out.println("Impuesto calculado: $" + impuesto);
        return impuesto;
    }
}
