/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.demeter;

/**
 *
 * @author alesw31
 */
public class Test {
    public static void main(String[] args){
        C c = new C("Hola Mundo");
        B b = new B(c);
        A a = new A(b);
    }
    System.out.println(a.getB().getC().getNombre());
}
