/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import com.mycompany.factory.*;
import com.mycompany.factoryABS.*;

/**
 *
 * @author alesw31
 */
public class Test {
    public static void main(String[] args) {
        FactoryIF f1 = new FactoryElfo();
        Front elfo1 = new Front(f1);
        elfo1.mostrarDescripcion();
        
        FactoryIF f2= new FactoryOrco();
        Front orco1 = new Front(f2);
        orco1.mostrarDescripcion();
    
    }
}
