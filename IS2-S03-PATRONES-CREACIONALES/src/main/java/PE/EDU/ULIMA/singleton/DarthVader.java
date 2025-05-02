/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PE.EDU.ULIMA.singleton;

/**
 *
 * @author L34220
 */
public class DarthVader {

    private String nombre;
    private String color;
    private static DarthVader instance = null;
    
    private DarthVader(){
        
    }

    private DarthVader(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    
    public static DarthVader getInstance(String nombre, String color){
        if (instance == null) {
            instance = new DarthVader(nombre, color);
            
        }
        return instance;
    }

    @Override
    public String toString() {
        return "DarthVader{" + "nombre=" + nombre + ", color=" + color + '}';
    }
    
}
