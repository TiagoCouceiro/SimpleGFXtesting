package PokemonAC.Player;

import PokemonAC.Map.Map;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player {

    private Picture player;
    private Map map;

    private int imageDelay = 0;

    private int moveVar = 0;

    private int posX = 20;
    private int posY = 20;

    public Player(Map map) {
        player = new Picture(posX, posY, "mainchar/frontmovement/idlefront.png");
        player.draw();
        this.map = map;
    }

    public int checkImageDelay() {
        if (imageDelay > 4) {
            imageDelay = 0;
        }
        return imageDelay;
    }

    public int checkMove() {
        if (moveVar > 9) {
            moveVar = 0;
        }
        return moveVar;
    }

    public void checkUpImage() {
        checkImageDelay();
        checkMove();
        if (imageDelay == 4) {
            moveVar++;
            if (moveVar == 0) {
                player.load("mainchar/backmovement/move1back.png");
            } else if (moveVar == 1) {
                player.load("mainchar/backmovement/move2back.png");
            } else if (moveVar == 2) {
                player.load("mainchar/backmovement/move3back.png");
            } else if (moveVar == 3) {
                player.load("mainchar/backmovement/move4back.png");
            } else if (moveVar == 4) {
                player.load("mainchar/backmovement/move5back.png");
            } else if (moveVar == 5) {
                player.load("mainchar/backmovement/move6back.png");
            } else if (moveVar == 6) {
                player.load("mainchar/backmovement/move7back.png");
            } else if (moveVar == 7) {
                player.load("mainchar/backmovement/move8back.png");
            } else if (moveVar == 8) {
                player.load("mainchar/backmovement/move9back.png");
            } else {
                player.load("mainchar/backmovement/move10back.png");
            }
        }
    }

    public void checkDownImage() {
        checkImageDelay();
        checkMove();
        if (imageDelay == 4) {
            moveVar++;
            if (moveVar == 0) {
                player.load("mainchar/frontmovement/move1front.png");
            } else if (moveVar == 1) {
                player.load("mainchar/frontmovement/move2front.png");
            } else if (moveVar == 2) {
                player.load("mainchar/frontmovement/move3front.png");
            } else if (moveVar == 3) {
                player.load("mainchar/frontmovement/move4front.png");
            } else if (moveVar == 4) {
                player.load("mainchar/frontmovement/move5front.png");
            } else if (moveVar == 5) {
                player.load("mainchar/frontmovement/move6front.png");
            } else if (moveVar == 6) {
                player.load("mainchar/frontmovement/move7front.png");
            } else if (moveVar == 7) {
                player.load("mainchar/frontmovement/move8front.png");
            } else if (moveVar == 8) {
                player.load("mainchar/frontmovement/move9front.png");
            } else {
                player.load("mainchar/frontmovement/move10front.png");
            }
        }
    }

    public void checkLeftImage() {
        checkImageDelay();
        checkMove();
        if (imageDelay == 4) {
            moveVar++;
            if (moveVar == 0) {
                player.load("mainchar/leftmovement/move1left.png");
            } else if (moveVar == 1) {
                player.load("mainchar/leftmovement/move2left.png");
            } else if (moveVar == 2) {
                player.load("mainchar/leftmovement/move3left.png");
            } else if (moveVar == 3) {
                player.load("mainchar/leftmovement/move4left.png");
            } else if (moveVar == 4) {
                player.load("mainchar/leftmovement/move5left.png");
            } else if (moveVar == 5) {
                player.load("mainchar/leftmovement/move6left.png");
            } else if (moveVar == 6) {
                player.load("mainchar/leftmovement/move7left.png");
            } else if (moveVar == 7) {
                player.load("mainchar/leftmovement/move8left.png");
            } else if (moveVar == 8) {
                player.load("mainchar/leftmovement/move9left.png");
            } else {
                player.load("mainchar/leftmovement/move10left.png");
            }
        }
    }

    public void checkRightImage() {
        checkImageDelay();
        checkMove();
        if (imageDelay == 4) {
            moveVar++;
            if (moveVar == 0) {
                player.load("mainchar/rightmovement/move1right.png");
            } else if (moveVar == 1) {
                player.load("mainchar/rightmovement/move2right.png");
            } else if (moveVar == 2) {
                player.load("mainchar/rightmovement/move3right.png");
            } else if (moveVar == 3) {
                player.load("mainchar/rightmovement/move4right.png");
            } else if (moveVar == 4) {
                player.load("mainchar/rightmovement/move5right.png");
            } else if (moveVar == 5) {
                player.load("mainchar/rightmovement/move6right.png");
            } else if (moveVar == 6) {
                player.load("mainchar/rightmovement/move7right.png");
            } else if (moveVar == 7) {
                player.load("mainchar/rightmovement/move8right.png");
            } else if (moveVar == 8) {
                player.load("mainchar/rightmovement/move9right.png");
            } else {
                player.load("mainchar/rightmovement/move10right.png");
            }
        }
    }

    public void moveup() {
        if (player.getY() != map.getPADDING()) {
            checkUpImage();
            player.translate(0, -2);
            imageDelay++;
        }
    }

    public void movedown() {
        if (player.getY() + player.getHeight() < map.getHeight() + map.getPADDING()) {
            checkDownImage();
            player.translate(0, 2);
            imageDelay++;
        }
    }

    public void moveleft() {
        if (player.getX() + map.getPADDING() > map.getPADDING()) {
            checkLeftImage();
            player.translate(-2, 0);
            imageDelay++;
        }
    }

    public void moveright() {
        if (player.getX() + player.getWidth() < map.getWidth()) {
            checkRightImage();
            player.translate(2, 0);
            imageDelay++;
        }
    }
}
