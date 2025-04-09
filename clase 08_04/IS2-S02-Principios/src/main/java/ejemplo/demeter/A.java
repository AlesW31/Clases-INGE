/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.demeter;

/**
 *
 * @author alesw31
 */
public class A {
    private B b;

    public A(B b) {
        this.b = b;
    }

    public B getB() {
        return b;
    }
    
}
