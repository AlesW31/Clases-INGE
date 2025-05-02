/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.ulima.edu.is2.restaurante;

/**
 *
 * @author L34220
 */
public class Test {
    public static void main(String[] args) {
        Contexto csx = Contexto.getInstance(new PolloDulce());
        
        csx.setCocina(new DecoratorAji(csx.getCocina()));
        csx.efectuarCocina();
        
        Contexto csx2 = Contexto.getInstance(new PolloSalado());
        csx2.efectuarCocina();
        System.out.println(csx ==csx2);
    }
}
