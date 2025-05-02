/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factory;

import com.mycompany.factoryABS.Castillo;
import com.mycompany.factoryABS.Ejercito;
import com.mycompany.factoryABS.FactoryIF;
import com.mycompany.factoryABS.Rey;

/**
 *
 * @author alesw31
 */
public class FactoryOrco implements FactoryIF{

    @Override
    public Rey crearRey() {
        return new ReyOrco();
    }

    @Override
    public Castillo crearCastillo() {
        return new CastilloOrco();
    }

    @Override
    public Ejercito crearEjercito() {
        return new EjercitoOrco();
    }
    
}
