/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.ulima.adapter;

/**
 *
 * @author L34219
 */
public class test {
    public static void main(String[] args) {
        termometrofaren tf = new termometrofaren(50);
        System.out.println("la temperatura en grados f " + tf.getTemperatura());
        
        termometro t = new adaptador(tf);
        System.out.println("la temperatura en grados c" + t.getTemperatura());
    
    }
    
    
}
