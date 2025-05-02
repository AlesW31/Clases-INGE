/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.is2.decorator;

/**
 *
 * @author alesw31
 */
public class Tea extends Bebida{

    @Override
    public double costo() {
        return 1.5;
    }
    

    @Override
    public String getDescripcion() {
        return "Té";
    }
    
}
