/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.ulima.edu.is2.restaurante;

/**
 *
 * @author L34220
 */
public class Contexto {
    public static Contexto instance;
    public CocinaIF cocina;

    public Contexto(CocinaIF cocina) {
        this.cocina = cocina;
    }
    
    public void efectuarCocina(){
        cocina.cocinar();
    }
    public CocinaIF getCocina(){
        return cocina;
    }
    
    public void setCocina(CocinaIF cocina){
        this.cocina=cocina;
    }
    
    public static Contexto getInstance(CocinaIF cocina){
        if (instance == null) {
           instance = new Contexto(cocina);
           System.out.println("Soy un singleton");
        }
        return instance;
    }
}
