/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PE.EDU.ULIMA.singleton;

/**
 *
 * @author L34220
 */
public class Test {
    public static void main(String[] args) {
    DarthVader d1 = DarthVader.getInstance("AnaKin Skywoker", "Rojito");
    DarthVader d2 = DarthVader.getInstance("Luke Skywoker", "Azul");   
    
        System.out.println(d1);
        System.out.println(d2);
    }
  
}
