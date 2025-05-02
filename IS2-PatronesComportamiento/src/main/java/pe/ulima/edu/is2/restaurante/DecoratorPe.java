/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.ulima.edu.is2.restaurante;

/**
 *
 * @author L34220
 */
public abstract class DecoratorPe implements CocinaIF {
    protected CocinaIF cocina;

    public DecoratorPe(CocinaIF cocina) {
        this.cocina = cocina;
    }
    

}
