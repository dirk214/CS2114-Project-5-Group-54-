package prj5;

import CS2114.Button;
import CS2114.Shape;
import CS2114.TextShape;
import java.awt.Color;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Glyph extends Shape //implements ActionListener
{
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
    
    private TextShape songArtist;
    
    private TextShape songYear;
    
    private TextShape songGenre;
    
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
    
    //private Song song;
    
    private SongWindow window;
    
    //private SongList songList;
    
    public Glyph(int xCord, int yCord)
    {
        super(xCord, yCord);
        
        /**
        songList = new Songlist(songs);
        song = new Song();
        window = new SongWindow(songList);
        Button sortByGenre = window.sortByGenre;
        sortByGenre.addActionLister(window);
        */
        
        blackBar = new Shape(xCord, yCord - 60, 20, 120, Color.BLACK);
        
        /**
        purpleBarHeard = new Shape(xCord/2 - 20 , yCord - 60, purpleLengthHeard, 30, Color.PINK);
        blueBarHeard = new Shape(xCord/2 - 20, yCord - 30, blueLengthHeard, 30, Color.BLUE);
        yellowBarHeard = new Shape(xCord/2 - 20, yCord , yellowLengthHeard, 30, Color.YELLOW);
        greenBarHeard = new Shape(xCord/2 - 20, yCord + 30, greenLengthHeard, 30, Color.GREEN);
        
        purpleBarLiked = new Shape(xCord + 20, yCord - 60, purpleLengthLiked, 30, Color.PINK);
        blueBarLiked = new Shape(xCord + 20, yCord - 30, blueLengthLiked, 30, Color.BLUE);
        yellowBarLiked = new Shape(xCord + 20, yCord , yellowLengthLiked, 30, Color.YELLOW);
        greenBarLiked = new Shape(xCord + 20, yCord + 30, greenLengthLiked, 30, Color.GREEN);
        */
        purpleBarHeard = new Shape(xCord/2 - 20 , yCord - 60, 120, 30, Color.PINK);
        blueBarHeard = new Shape(xCord/2 - 20, yCord - 30, 120, 30, Color.BLUE);
        yellowBarHeard = new Shape(xCord/2 - 20, yCord , 120, 30, Color.YELLOW);
        greenBarHeard = new Shape(xCord/2 - 20, yCord + 30, 120, 30, Color.GREEN);
        
        purpleBarLiked = new Shape(xCord + 20, yCord - 60, 120, 30, Color.PINK);
        blueBarLiked = new Shape(xCord + 20, yCord - 30, 120, 30, Color.BLUE);
        yellowBarLiked = new Shape(xCord + 20, yCord , 120, 30, Color.YELLOW);
        greenBarLiked = new Shape(xCord + 20, yCord + 30, 120, 30, Color.GREEN);
       
        //songTitle = new TextShape(xCord - (song.getSongTitle().length() * 4), yCord - 85, song.getSongTitle());
        //songArtist = new TextShape(xCord - (song.getArtistName().length() * 4), yCord - 85, song.getArtistName());
        //songYear = new TextShape(xCord - (song.getDate().length() * 4), yCord -85, song.getDate());
        //songGenre = new TextShape(xCord - (song.getGenre().length() * 4), yCord -85, song.getGenre());        
    }
    
    public int getX()
    {
        return xCord;
    }
    
    public int getY()
    {
        return yCord;
    }
    
    /**
    @Override
    public void actionPerformed(ActionEvent buttonClick) 
    {
        
    }

    public void updateLengthOfBars()
    {
        purpleLengthHeard = input[0][0];
        blueLengthHeard = input[0][1];
        yellowLengthHeard = input[0][2];
        greenLengthHeard = input[0][3];
        purpleLengthLiked = input[1][0];
        blueLengthLiked = input[1][1];
        yellowLengthLiked = input[1][2];
        greenLengthLiked = input[1][3];
    }
    */
}
