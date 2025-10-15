package com.mycompany.ds.SeccionC;

public class NotificacionSMS implements Notificacion {
    @Override
    public void notificar(Pago pago) {
        System.out.println("Enviando notificación por SMS");
    }
}
