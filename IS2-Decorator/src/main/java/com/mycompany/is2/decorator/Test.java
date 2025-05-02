/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.is2.decorator;

/**
 *
 * @author alesw31
 */
public class Test {
    public static void main(String[] args) {
        //Crear bebida
        Bebida b1 = new Cafe();
        //Agregarle vainas
        b1 = new DecoratorAzucar(b1);
        System.out.println(b1.getDescripcion() + " S/." + b1.costo());
    }
}
