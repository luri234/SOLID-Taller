/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ds;

/**
 *
 * @author hp
 */
public class DigitalProduct extends Product {

    public DigitalProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateIVA() {
        double iva_calculado = 0;
        //logica para calcular el iva en productos digitales
        return iva_calculado;
    }
    
}
