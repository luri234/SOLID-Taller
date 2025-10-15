/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ds;

import java.util.List;

/**
 *
 * @author hp
 */
public class ShoppingCart {
    private List<Product> products;
    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(Product product){
        products.remove(product);
    }
    public double calculateTotalPrice(){
        double total =0;
        //logica para calcular el precio total
        return total;
    }
    public List<Product> getProducts() {
        return products;
    }   
}





