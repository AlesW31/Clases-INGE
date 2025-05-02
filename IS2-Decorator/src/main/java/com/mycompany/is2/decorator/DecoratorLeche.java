/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.is2.decorator;

/**
 *
 * @author alesw31
 */
public class DecoratorLeche extends Decorator {

    public DecoratorLeche(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double costo() {
        return bebida.costo() + 1.0;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " con leche";
    }
    
}
