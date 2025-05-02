/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PE.EDU.ULIMA.factory;

/**
 *
 * @author L34220
 */
public class BulbasaurConcreteFactory implements PokemonAbstractFactoryIF {

    @Override
    public PokemonIF createPokemon() {
        return new Bulbasaur();
    }
    
}
