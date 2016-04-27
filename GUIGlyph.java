package prj5;

import CS2114.Shape;
import CS2114.TextShape;
import CS2114.Window;

import java.awt.Color;

public class GUIGlyph {
    LinkedList<Shape> glyphList;

    private Shape blackBar;

    private Shape purpleBarHeard;

    private Shape blueBarHeard;

    private Shape yellowBarHeard;

    private Shape greenBarHeard;

    private Shape purpleBarLiked;

    private Shape blueBarLiked;

    private Shape yellowBarLiked;

    private Shape greenBarLiked;

    private TextShape songTitle;

    private TextShape bottomText;

    private int xCord;

    private int yCord;

    private int[][] input;

    private int purpleLengthHeard;

    private int blueLengthHeard;

    private int yellowLengthHeard;

    private int greenLengthHeard;

    private int purpleLengthLiked;

    private int blueLengthLiked;

    private int yellowLengthLiked;

    private int greenLengthLiked;

    public GUIGlyph(int xCord, int yCord, int[][] input, Window window,
            String title, String btmType, String btmText) {
        glyphList = new LinkedList<Shape>();

        this.xCord = xCord;
        this.yCord = yCord;
        this.input = input;
        updateLengthOfBars(input);

        blackBar = new Shape(xCord, yCord - 60, 10, 40, Color.BLACK);
        window.addShape(blackBar);
        glyphList.add(blackBar);

        purpleBarHeard = new Shape(xCord - purpleLengthHeard, yCord - 60,
                purpleLengthHeard, 10, Color.PINK);
        window.addShape(purpleBarHeard);
        glyphList.add(purpleBarHeard);
        blueBarHeard = new Shape(xCord - blueLengthHeard, yCord - 50,
                blueLengthHeard, 10, Color.BLUE);
        window.addShape(blueBarHeard);
        glyphList.add(blueBarHeard);
        yellowBarHeard = new Shape(xCord - yellowLengthHeard, yCord - 40,
                yellowLengthHeard, 10, Color.YELLOW);
        window.addShape(yellowBarHeard);
        glyphList.add(yellowBarHeard);
        greenBarHeard = new Shape(xCord - greenLengthHeard, yCord - 30,
                greenLengthHeard, 10, Color.GREEN);
        window.addShape(greenBarHeard);
        glyphList.add(greenBarHeard);

        purpleBarLiked = new Shape(xCord + 10, yCord - 60, purpleLengthLiked,
                10, Color.PINK);
        window.addShape(purpleBarLiked);
        glyphList.add(purpleBarLiked);
        blueBarLiked = new Shape(xCord + 10, yCord - 50, blueLengthLiked, 10,
                Color.BLUE);
        window.addShape(blueBarLiked);
        glyphList.add(blueBarLiked);
        yellowBarLiked = new Shape(xCord + 10, yCord - 40, yellowLengthLiked,
                10, Color.YELLOW);
        window.addShape(yellowBarLiked);
        glyphList.add(yellowBarLiked);
        greenBarLiked = new Shape(xCord + 10, yCord - 30, greenLengthLiked, 10,
                Color.GREEN);
        window.addShape(greenBarLiked);
        glyphList.add(greenBarLiked);

        songTitle = new TextShape(xCord - 30 - 2 * title.length(), yCord - 100,
                title);
        window.addShape(songTitle);
        glyphList.add(songTitle);
        addBottomText(btmType, btmText, window);

    }

    public int getX() {
        return xCord;
    }

    public int getY() {
        return yCord;
    }

    public int[][] getInput() {
        return input;
    }

    public void updateLengthOfBars(int[][] input) {
        //input = this.getInput();
        purpleLengthHeard = input[0][0];
        blueLengthHeard = input[0][1];
        yellowLengthHeard = input[0][2];
        greenLengthHeard = input[0][3];
        purpleLengthLiked = input[1][0];
        blueLengthLiked = input[1][1];
        yellowLengthLiked = input[1][2];
        greenLengthLiked = input[1][3]; 
    }

    public LinkedList<Shape> getGUIGlyphList() {
        return glyphList;
    }
    
    public void setBottomText(String text)
    {
        bottomText.setText(text);
    }
    
    public void setTitle(String text)
    {
        songTitle.setText(text);
    }
    
    public void swapBars(int[][] input, Window window)
    {
        updateLengthOfBars(input);
        glyphList.remove(purpleBarHeard);
        window.removeShape(purpleBarHeard);
        glyphList.remove(blueBarHeard);
        window.removeShape(blueBarHeard);
        glyphList.remove(yellowBarHeard);
        window.removeShape(yellowBarHeard);
        glyphList.remove(greenBarHeard);
        window.removeShape(greenBarHeard);
        
        glyphList.remove(purpleBarLiked);
        window.removeShape(purpleBarLiked);
        glyphList.remove(blueBarLiked);
        window.removeShape(blueBarLiked);
        glyphList.remove(yellowBarLiked);
        window.removeShape(yellowBarLiked);
        glyphList.remove(greenBarLiked);
        window.removeShape(greenBarLiked);
        
        purpleBarHeard = new Shape(xCord - purpleLengthHeard, yCord - 60,
                purpleLengthHeard, 10, Color.PINK);
        window.addShape(purpleBarHeard);
        glyphList.add(purpleBarHeard);
        
        blueBarHeard = new Shape(xCord - blueLengthHeard, yCord - 50,
                blueLengthHeard, 10, Color.BLUE);
        window.addShape(blueBarHeard);
        glyphList.add(blueBarHeard);
        
        yellowBarHeard = new Shape(xCord - yellowLengthHeard, yCord - 40,
                yellowLengthHeard, 10, Color.YELLOW);
        window.addShape(yellowBarHeard);
        glyphList.add(yellowBarHeard);
        
        greenBarHeard = new Shape(xCord - greenLengthHeard, yCord - 30,
                greenLengthHeard, 10, Color.GREEN);
        window.addShape(greenBarHeard);
        glyphList.add(greenBarHeard);

        purpleBarLiked = new Shape(xCord + 10, yCord - 60, purpleLengthLiked,
                10, Color.PINK);
        window.addShape(purpleBarLiked);
        glyphList.add(purpleBarLiked);
        
        blueBarLiked = new Shape(xCord + 10, yCord - 50, blueLengthLiked, 10,
                Color.BLUE);
        window.addShape(blueBarLiked);
        glyphList.add(blueBarLiked);
        
        yellowBarLiked = new Shape(xCord + 10, yCord - 40, yellowLengthLiked,
                10, Color.YELLOW);
        window.addShape(yellowBarLiked);
        glyphList.add(yellowBarLiked);
        
        greenBarLiked = new Shape(xCord + 10, yCord - 30, greenLengthLiked, 10,
                Color.GREEN);
        window.addShape(greenBarLiked);
        glyphList.add(greenBarLiked);
    }
    
    private void addBottomText(String btm, String text, Window window)
    {
        if (btm.equals("artist"))
        {
        bottomText = new TextShape(xCord - 20 - 2 * text.length(), yCord - 85,
                "by " + text);
        window.addShape(bottomText);
        glyphList.add(bottomText);
        }
        
        else if (btm.equals("genre"))
        {
            bottomText = new TextShape(xCord - 20 - 2 * text.length(), yCord - 85, "genre: " + text);
            window.addShape(bottomText);
            glyphList.add(bottomText);
        }
        
        else if (btm.equals("year"))
        {
            bottomText = new TextShape(xCord - 20 - 2 * text.length(), yCord - 85, "year: " + text);
            window.addShape(bottomText);
            glyphList.add(bottomText);
        }
    }
}
