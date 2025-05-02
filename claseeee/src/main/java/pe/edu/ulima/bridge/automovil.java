/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.ulima.bridge;

/**
 *
 * @author L34219
 */
public class automovil extends vehiculo{

    public automovil(motor motor) {
        super(motor);
    }
    @Override
    public void manejar(){
        System.out.println("automovil");
        motor.start();
        System.out.println("auto en movimiento");
    }

    
    
}
