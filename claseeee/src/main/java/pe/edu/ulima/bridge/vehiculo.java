/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.ulima.bridge;

/**
 *
 * @author L34219
 */
public abstract class vehiculo {
    protected motor motor;

    public vehiculo(motor motor) {
        this.motor = motor;
    }
    
    public abstract void manejar();
}
