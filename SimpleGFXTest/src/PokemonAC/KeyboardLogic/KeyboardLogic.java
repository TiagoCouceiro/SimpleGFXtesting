package PokemonAC.KeyboardLogic;


import PokemonAC.Menus.Startscreen;
import PokemonAC.Player.Player;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;


import static org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent.*;

public class KeyboardLogic implements KeyboardHandler, Runnable {

    Keyboard keyboard = new Keyboard(this);

    Player player;
    Startscreen startscreen;

    public void init() {

        KeyboardEvent up = new KeyboardEvent();
        KeyboardEvent down = new KeyboardEvent();
        KeyboardEvent left = new KeyboardEvent();
        KeyboardEvent right = new KeyboardEvent();
        KeyboardEvent use = new KeyboardEvent();

        up.setKey(KEY_W);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);


        down.setKey(KEY_S);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);


        left.setKey(KEY_A);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);


        right.setKey(KEY_D);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        use.setKey(KEY_SPACE);
        use.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(up);
        keyboard.addEventListener(down);
        keyboard.addEventListener(right);
        keyboard.addEventListener(left);
        keyboard.addEventListener(use);

    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setStartscreen(Startscreen startscreen) {
        this.startscreen = startscreen;
    }



    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if (player != null) {
            switch (keyboardEvent.getKey()) {
                case KEY_W:
                    player.moveup();
                    break;
                case KEY_S:
                    player.movedown();
                    break;
                case KEY_A:
                    player.moveleft();
                    break;
                case KEY_D:
                    player.moveright();
                    break;
            }
        } else {
            switch (keyboardEvent.getKey()){
                case KEY_SPACE:
                    startscreen.setStartGame(true);
                    startscreen.stopThread();
                    startscreen.startThread2();
                    startscreen.startThread3();
                    break;
            }

        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    @Override
    public void run() {

    }
}
