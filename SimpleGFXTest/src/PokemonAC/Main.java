package PokemonAC;

import PokemonAC.KeyboardLogic.KeyboardLogic;
import PokemonAC.Map.Map;
import PokemonAC.Map.MapOne;
import PokemonAC.Menus.Startscreen;
import PokemonAC.Player.Player;


public class Main {

    public static void main(String[] args) {

        Map map = new MapOne();
        // Startscreen start = new Startscreen();

        Player player = new Player(map);


        KeyboardLogic keyboardLogic = new KeyboardLogic();
        keyboardLogic.setPlayer(player);
        // keyboardLogic.setStartscreen(start);
        keyboardLogic.init();


    }
}
