/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.ulima.bridge;

/**
 *
 * @author L34219
 */
public class test {
    public static void main(String[] args) {
        vehiculo auto = new automovil(new motorgas());
        auto.manejar();
        
        vehiculo camion = new camion(new motorelectrico());
        camion.manejar();
    }
}
