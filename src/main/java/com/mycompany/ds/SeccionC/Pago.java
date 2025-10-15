package com.mycompany.ds.SeccionC;

public class Pago implements MedioPago{
    private double monto;

    public Pago(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    @Override
    public void realizarCobro(double monto) {
        System.out.println("Cobro genérico por $" + monto);
    }


}
