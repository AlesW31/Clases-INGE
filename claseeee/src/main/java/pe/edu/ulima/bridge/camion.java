/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.ulima.bridge;

/**
 *
 * @author L34219
 */
public class camion extends vehiculo {

    public camion(motor motor) {
        super(motor);
    }
    
    @Override
    public void manejar(){
        System.out.println("camion");
        motor.start();
        System.out.println("camion en movimiento");
    }

    
}
