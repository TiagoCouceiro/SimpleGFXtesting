package PokemonAC.Menus;


import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Startscreen {


    private Picture background;
    private Picture playerChar;
    private Picture title;
    private Picture pressStart;
    private Picture bush;
    public boolean startGame;


    public Startscreen() {
        background = new Picture(10, 10, "startscreen/background.jpeg");
        background.draw();
        background.grow(600, 300);
        background.translate(600, 300);
        title = new Picture(250, 200, "startscreen/logokaalimah.png");
        title.draw();
        title.grow(130, 85);
        playerChar = new Picture(795, 775, "startscreen/idle.png");
        playerChar.draw();
        bush = new Picture(1000, 670, "startscreen/bush.png");
        bush.draw();
        bush.grow(50, 60);
        pressStart = new Picture(1065, 780, "startscreen/startgame.png");
        pressStart.draw();
        pressStart.grow(80, 20);
        thread1.start();

    }

    Thread thread1 = new Thread() {


        @Override
        public void run() {
            idleCharAnimation();

        }
    };
    Thread thread2 = new Thread() {
        @Override
        public void run() {
            startCharAnimation();
        }
    };
    Thread thread3 = new Thread() {
        @Override
        public void run() {
            pressStartAnimation();
        }
    };

    public void setStartGame(boolean startGame) {
        this.startGame = startGame;
    }

    public void stopThread() {
        thread1.stop();
    }

    public void stopThread2() {
        thread2.stop();
    }

    public void startThread2() {
        thread2.start();
    }

    public void startThread3() {
        thread3.start();
    }

    public void idleCharAnimation() {
        while (!startGame) {
            try {
                thread1.sleep(5000);
                playerChar.load("startscreen/idle2.png");
                thread1.sleep(200);
                playerChar.load("startscreen/idle3.png");
                thread1.sleep(200);
                playerChar.load("startscreen/idle2.png");
                thread1.sleep(200);
                playerChar.load("startscreen/idle.png");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void startCharAnimation() {
        startCharAnimation1();
        startCharAnimation2();
        startCharAnimation3();
    }

    public void startCharAnimation1() {
        try {
            playerChar.load("startscreen/idleback.png");
            playerChar.translate(2, -5);
            thread2.sleep(100);
            playerChar.load("mainchar/backmovement/move1back.png");
            playerChar.translate(2, -5);
            thread2.sleep(100);
            playerChar.load("mainchar/backmovement/move2back.png");
            playerChar.translate(2, -5);
            thread2.sleep(100);
            playerChar.load("mainchar/backmovement/move3back.png");
            playerChar.translate(2, -5);
            thread2.sleep(100);
            playerChar.load("mainchar/backmovement/move4back.png");
            playerChar.translate(2, -5);
            thread2.sleep(100);
            playerChar.load("mainchar/backmovement/move5back.png");
            playerChar.translate(2, -5);
            thread2.sleep(100);
            playerChar.load("mainchar/backmovement/move6back.png");
            playerChar.translate(2, -5);
            thread2.sleep(100);
            playerChar.load("mainchar/backmovement/move7back.png");
            playerChar.translate(2, -5);
            thread2.sleep(100);
            playerChar.load("mainchar/backmovement/move8back.png");
            playerChar.translate(2, -5);
            thread2.sleep(100);
            playerChar.load("mainchar/backmovement/move9back.png");
            playerChar.translate(2, -5);
            thread2.sleep(100);
            playerChar.load("mainchar/backmovement/move10back.png");
            playerChar.translate(2, -5);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void startCharAnimation2() {
        try {
            playerChar.load("startscreen/idleback.png");
            playerChar.translate(2, -5);
            thread2.sleep(100);
            playerChar.load("mainchar/backmovement/move1back.png");
            playerChar.translate(2, -5);
            thread2.sleep(100);
            playerChar.load("mainchar/backmovement/move2back.png");
            playerChar.translate(2, -5);
            thread2.sleep(100);
            playerChar.load("mainchar/backmovement/move3back.png");
            playerChar.translate(2, -5);
            thread2.sleep(100);
            playerChar.load("mainchar/backmovement/move4back.png");
            playerChar.translate(2, -5);
            thread2.sleep(100);
            playerChar.load("mainchar/backmovement/move5back.png");
            playerChar.translate(2, -5);
            thread2.sleep(100);
            playerChar.load("mainchar/backmovement/move6back.png");
            playerChar.translate(2, -5);
            thread2.sleep(100);
            playerChar.load("mainchar/backmovement/move7back.png");
            playerChar.translate(2, -5);
            thread2.sleep(100);
            playerChar.load("mainchar/backmovement/move8back.png");
            playerChar.translate(2, -5);
            thread2.sleep(100);
            playerChar.load("mainchar/backmovement/move9back.png");
            playerChar.translate(2, -5);
            thread2.sleep(100);
            playerChar.load("mainchar/backmovement/move10back.png");
            playerChar.translate(2, -5);
            thread2.sleep(100);
            playerChar.load("mainchar/backmovement/move1back.png");
            playerChar.translate(2, -5);
            thread2.sleep(100);
            playerChar.load("mainchar/backmovement/move2back.png");
            playerChar.translate(2, -5);
            thread2.sleep(100);
            playerChar.load("mainchar/backmovement/move3back.png");
            playerChar.translate(2, -5);
            thread2.sleep(100);
            playerChar.load("mainchar/backmovement/move4back.png");
            playerChar.translate(2, -5);
            thread2.sleep(100);
            playerChar.load("mainchar/backmovement/move5back.png");
            playerChar.translate(2, -5);
            thread2.sleep(100);
            playerChar.load("mainchar/backmovement/move6back.png");
            playerChar.translate(2, -5);


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void startCharAnimation3() {
        try {
            playerChar.load("mainchar/rightmovement/move1right.png");
            playerChar.translate(6, 0);
            thread2.sleep(100);
            playerChar.load("mainchar/rightmovement/move2right.png");
            playerChar.translate(6, 0);
            thread2.sleep(100);
            playerChar.load("mainchar/rightmovement/move3right.png");
            playerChar.translate(6, 0);
            thread2.sleep(100);
            playerChar.load("mainchar/rightmovement/move4right.png");
            playerChar.translate(6, 0);
            thread2.sleep(100);
            playerChar.load("mainchar/rightmovement/move5right.png");
            playerChar.translate(6, 0);
            thread2.sleep(100);
            playerChar.load("mainchar/rightmovement/move6right.png");
            playerChar.translate(6, 0);
            thread2.sleep(100);
            playerChar.load("mainchar/rightmovement/move7right.png");
            playerChar.translate(6, 0);
            thread2.sleep(100);
            playerChar.load("mainchar/rightmovement/move8right.png");
            playerChar.translate(6, 0);
            thread2.sleep(100);
            playerChar.load("mainchar/rightmovement/move9right.png");
            playerChar.translate(6, 0);
            thread2.sleep(100);
            playerChar.load("mainchar/rightmovement/move10right.png");
            playerChar.translate(6, 0);
            thread2.sleep(100);
            playerChar.load("mainchar/rightmovement/move1right.png");
            playerChar.translate(6, 0);
            thread2.sleep(100);
            playerChar.load("mainchar/rightmovement/move2right.png");
            playerChar.translate(6, 0);
            thread2.sleep(100);
            playerChar.load("mainchar/rightmovement/move3right.png");
            playerChar.translate(6, 0);
            thread2.sleep(100);
            playerChar.load("mainchar/rightmovement/move4right.png");
            playerChar.translate(6, 0);
            thread2.sleep(100);
            playerChar.load("mainchar/rightmovement/move5right.png");
            playerChar.translate(6, 0);
            thread2.sleep(100);
            playerChar.load("mainchar/rightmovement/move6right.png");
            playerChar.translate(6, 0);
            thread2.sleep(100);
            playerChar.load("mainchar/rightmovement/move7right.png");
            playerChar.translate(6, 0);
            thread2.sleep(100);
            playerChar.load("mainchar/rightmovement/move8right.png");
            playerChar.translate(6, 0);
            thread2.sleep(100);
            playerChar.load("mainchar/rightmovement/move9right.png");
            playerChar.translate(6, 0);
            thread2.sleep(100);
            playerChar.load("mainchar/rightmovement/move10right.png");
            playerChar.translate(6, 0);
            thread2.sleep(100);
            playerChar.load("mainchar/rightmovement/move1right.png");
            playerChar.translate(6, 0);
            thread2.sleep(100);
            playerChar.load("mainchar/rightmovement/move2right.png");
            playerChar.translate(6, 0);
            stopThread2();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void pressStartAnimation() {
        try {
            pressStart.grow(-60, -30);
            thread3.sleep(100);
            pressStart.grow(60, 30);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


