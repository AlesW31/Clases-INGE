/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.ulima.edu.is2.patronescomportamiento;

/**
 *
 * @author L34220
 */
public class PagoYape implements EstrategiaIF{

    @Override
    public void pagar(float monto) {
        System.out.println("Conectando a BCP");
        System.out.println("Pagando " + monto + " con YAPE");
    }
    
}
