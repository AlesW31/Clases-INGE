/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.ulima.adapter;

/**
 *
 * @author L34219
 */
public class termometrocels implements termometro {
    private double temperatura;

    public termometrocels(double temperatura) {
        this.temperatura = temperatura;
    }
    @Override
    public double getTemperatura() {
        return temperatura;
    }
    
}
