package com.mycompany.ds.SeccionC;

public class ServicioCompra {
    private ProcesadorPago procesadorPago;
    private CalculadoraImpuestos calculadoraImpuestos;
    private GeneradorFacturas generadorFacturas;

    public ServicioCompra() {
        this.procesadorPago = new ProcesadorPago();
        this.calculadoraImpuestos = new CalculadoraImpuestos();
        this.generadorFacturas = new GeneradorFacturas();
    }

    public void procesarCompra(Pago pago) {
        procesadorPago.realizarCobro(pago);
        calculadoraImpuestos.calcularImpuestos(pago);
        generadorFacturas.generarFactura(pago);
    }
}
