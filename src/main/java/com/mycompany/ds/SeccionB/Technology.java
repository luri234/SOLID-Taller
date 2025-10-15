/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ds;

/**
 *
 * @author hp
 */
public class Technology extends PhysicalProduct{

    public Technology(double weight, String name, double price) {
        super(weight, name, price);
    }

    @Override
    public double calculateIVA() {
        return price*0.15;
    }
    
}
