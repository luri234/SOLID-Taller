package com.mycompany.ds.SeccionC;

public class NotificacionEmail implements Notificacion {
    @Override
    public void notificar(Pago pago) {
        System.out.println("Enviando notificación por Email");
    }
}

