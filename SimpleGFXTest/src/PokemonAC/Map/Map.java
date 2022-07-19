package PokemonAC.Map;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Map {

    private Rectangle box;

    int PADDING = 10;
    int height = 900;
    int width = 1700;


    public Map(){
        box = new Rectangle(PADDING,PADDING,width, height);
        box.draw();
        box.setColor(Color.WHITE);
    }

    public int getPADDING() {
        return PADDING;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }



}
