/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PE.EDU.ULIMA.factory;

/**
 *
 * @author L34220
 */
public class Test {
    public static void main(String[] args) {
        PokemonAbstractFactoryIF f = new PikachuConcreteFactory();
        PokemonIF poke = f.createPokemon();
        poke.ataque();
        
        PokemonAbstractFactoryIF f2 = Fabrica.getFactory("P");
        PokemonIF poke2 = f2.createPokemon();
        poke2.ataque();
        
        PokemonAbstractFactoryIF f3 = Fabrica.getFactory("B");
        PokemonIF poke3 = f3.createPokemon();
        poke3.ataque();
    }
}
