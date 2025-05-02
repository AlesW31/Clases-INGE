/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PE.EDU.ULIMA.factory;

/**
 *
 * @author L34220
 */
public class Fabrica {
    public static PokemonAbstractFactoryIF getFactory(String tipo){
        switch(tipo){
            case "P":
                return new PikachuConcreteFactory();
            case "C":
                return new CharmanderCreateFactory();
            default:
                return new BulbasaurConcreteFactory();
        }
    }
}
