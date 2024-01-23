package logica;

public class PokemonEjercicioIntegrador {

    public static void main(String[] args) {
        
        Squirtle squirtle = new Squirtle ();
        Charmander charmander = new Charmander ();
        Bulbasaur bulbasaur = new Bulbasaur ();
        Pikachu pikachu = new Pikachu ();
        
        squirtle.atacarPlacaje();
        squirtle.atacarBurbuja();
        charmander.atacarPlacaje();
        charmander.atacarLanzallamas();
        bulbasaur.atacarPlacaje();
        bulbasaur.atacarLatigoCepa();
        pikachu.atacarPlacaje();
        pikachu.atacarImpactrueno();
        
    }
}
