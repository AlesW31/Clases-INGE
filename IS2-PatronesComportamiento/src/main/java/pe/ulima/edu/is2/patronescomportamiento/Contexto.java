/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.ulima.edu.is2.patronescomportamiento;

/**
 *
 * @author L34220
 */
public class Contexto {
    private EstrategiaIF estrategia;

    public Contexto(EstrategiaIF estrategia) {
        this.estrategia = estrategia;
    }
    public void efectuarPago(float monto){
        estrategia.pagar(monto);
    }

    public void setEstrategia(EstrategiaIF estrategia) {
        this.estrategia = estrategia;
    }
}
