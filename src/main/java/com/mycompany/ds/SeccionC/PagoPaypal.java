package com.mycompany.ds.SeccionC;

public class PagoPaypal implements MedioPago {
    private boolean loggedIn;

    public PagoPaypal(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    @Override
    public void realizarCobro(double monto) throws Exception {
        if (!loggedIn) {
            throw new Exception("Usuario no autenticado en PayPal");
        }
        System.out.println("Cobro realizado por PayPal: $" + monto);
    }
}

