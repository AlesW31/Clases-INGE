/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.ulima.edu.is2.restaurante;

/**
 *
 * @author L34220
 */
public class DecoratorAji extends DecoratorPe {

    public DecoratorAji(CocinaIF cocina) {
        super(cocina);
    }

    @Override
    public void cocinar() {
        cocina.cocinar();
        System.out.println("Echando ajisito");
    }

 
}
