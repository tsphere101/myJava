package src;

import java.lang.Math;
import javafx.scene.paint.Color;

public class ColorBand {

    public static final ColorBand BLACK = new ColorBand("BLACK", 0,Color.BLACK);
    public static final ColorBand BROWN = new ColorBand("BROWN", 1,Color.BROWN);
    public static final ColorBand RED = new ColorBand("RED", 2, Color.RED);
    public static final ColorBand ORANGE = new ColorBand("ORANGE", 3,Color.ORANGE);
    public static final ColorBand GREEN = new ColorBand("GREEN" , 4,Color.GREEN);

    private String name = "";
    private int value = 0;
    private Color color;

    public ColorBand(String name, int value, Color color)
    {
        this.name = name;
        this.value = value;
        this.color = color;
    }
    
    public Color getColor() {
        return this.color;
    }

    public String getName() {
        return this.name;
    }

    public int getDigitValue() {
        return this.value;
    }
    
    public int getMultiplierValue() {
        return (int) Math.pow(10, this.value);
    }

}