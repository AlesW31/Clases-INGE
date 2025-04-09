/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.demeter;

/**
 *
 * @author alesw31
 */
public class B {
    private C c;

    public B(C c) {
        this.c = c;
    }

    public C getC() {
        return c;
    }
    
    
}
