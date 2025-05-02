/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.ulima.bridge;

/**
 *
 * @author L34219
 */
public class motorelectrico implements motor{
    @Override
    public void start() {
        System.out.println("motor electrico encendido");}

    @Override
    public void stop() {
        System.out.println("motor electrico apagado"); }
}
