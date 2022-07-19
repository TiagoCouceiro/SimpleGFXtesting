package PokemonAC;

import PokemonAC.KeyboardLogic.KeyboardLogic;
import PokemonAC.Map.Map;
import PokemonAC.Map.MapOne;
import PokemonAC.Menus.Startscreen;
import PokemonAC.Player.Player;


public class Main {

    public static void main(String[] args) {

        Startscreen start = new Startscreen();

        /** GameMap
         *  Player movement testing
         */

        // Map map = new MapOne();

        /** AWSD to move player
         * Keyboard testing
         */

        // Player player = new Player(map);

        /** Set keyboard for player */

        // keyboardLogic.setPlayer(player);

        KeyboardLogic keyboardLogic = new KeyboardLogic();
        keyboardLogic.setStartscreen(start);
        keyboardLogic.init();
    }
}
