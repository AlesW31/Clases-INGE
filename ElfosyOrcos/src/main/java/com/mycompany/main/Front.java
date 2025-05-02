/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import com.mycompany.factoryABS.*;

/**
 *
 * @author alesw31
 */
public class Front {
    public Rey rey;
    public Castillo castillo;
    public Ejercito ejercito;

    public Front(FactoryIF fabrica) {
        rey=fabrica.crearRey();
        castillo=fabrica.crearCastillo();
        ejercito=fabrica.crearEjercito();
    }
    
    public void mostrarDescripcion(){
        System.out.println(rey.getDescripcion());
        System.out.println(castillo.getDescripcion());
        System.out.println(ejercito.getDescripcion());
    }
}
