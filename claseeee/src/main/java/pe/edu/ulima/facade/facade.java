/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.ulima.facade;

/**
 *
 * @author L34219
 */
public class facade {
    public void desestresarme(){
        biblioteca b = new biblioteca();
        b.verificarlibros();
        ctacte c = new ctacte();
        c.verificardeuda();
        matricular m = new matricular();
        m.matricula();
    }
}
