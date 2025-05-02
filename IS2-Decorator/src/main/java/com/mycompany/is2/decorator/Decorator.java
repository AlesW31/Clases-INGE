/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.is2.decorator;

/**
 *
 * @author alesw31
 */
public abstract class Decorator extends Bebida{
    protected Bebida bebida;

    public Decorator(Bebida bebida) {
        this.bebida = bebida;
    }
    
}
