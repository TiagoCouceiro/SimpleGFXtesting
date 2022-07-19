package PokemonAC.Map;

import PokemonAC.Player.Player;
import PokemonAC.Player.PlayerPosition;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class MapOne extends Map{

    private Player player;
    private Picture backGround1;

    public MapOne(Player player, PlayerPosition playerPosition) {
        super();
        backGround1 = new Picture(PADDING,PADDING,"map/background1.jpeg");
        backGround1.draw();
        backGround1.grow(600, 300);
        backGround1.translate(600,300);

    }
}
