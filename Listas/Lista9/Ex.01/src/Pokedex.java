import java.util.HashMap;
import java.util.Map;

public class Pokedex {
    private Map<String, Pokemon> pokemons = new HashMap<>();
    public adicionarPokemon(Pokemon pokemon){
        pokemons.put(pokemon);
    }

}
