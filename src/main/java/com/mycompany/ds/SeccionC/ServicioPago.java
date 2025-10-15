package com.mycompany.ds.SeccionC;

public class ServicioPago {
    private Notificacion notificacion;

    public ServicioPago(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    public void procesarPago(Pago pago) {
        
        notificacion.notificar(pago);
    }
}
