/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.ulima.edu.is2.patronescomportamiento;

/**
 *
 * @author L34220
 */
public class Test {
    public static void main(String[] args) {
        Contexto ctx = new Contexto(new PagoYape());
        ctx.efectuarPago(100);
        
        ctx.setEstrategia(new PagoBitCoin());
        ctx.efectuarPago(500);
    }
}
