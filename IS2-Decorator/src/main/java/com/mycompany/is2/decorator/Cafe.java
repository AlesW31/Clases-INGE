/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.is2.decorator;

/**
 *
 * @author alesw31
 */
public class Cafe extends Bebida {

    @Override
    public double costo() {
        return 2.0;
    }

    @Override
    public String getDescripcion() {
        return "Café";
    }
    
}
