/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.ulima.adapter;

/**
 *
 * @author L34219
 */
public class adaptador implements termometro {
   private termometrofaren tf;

    public adaptador(termometrofaren tf) {
        this.tf = tf;
    }
    @Override
    public double getTemperatura(){
    return(tf.getTemperatura()-32)*(5/9);
    }
   
   
}
