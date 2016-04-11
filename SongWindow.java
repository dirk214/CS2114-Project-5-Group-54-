package prj5;

import CS2114.WindowSide;
import java.awt.Color;
import CS2114.Button;
import CS2114.CircleShape;
import CS2114.Shape;
import CS2114.TextShape;
import CS2114.Window;

/**
 * 
 * @author Group54
 * @version 2016.04.11
 */
public class SongWindow
{
    //Fields:
    
    /**
     * 
     */
    Window mainWindow;
    
    /**
     * 
     */
    Button previous;
    
    /**
     * 
     */
    Button next;
    
    /**
     * 
     */
    Button sortByName;
    
    /**
     * 
     */
    Button sortByGenre;
    
    /**
     * 
     */
    Button sortBySongTitle;
    
    /**
     * 
     */
    Button sortByReleaseYear;
    
    /**
     * 
     */
    Button representHobby;
    
    /**
     * 
     */
    Button representMajor;
    
    /**
     * 
     */
    Button representRegion;
    
    /**
     * 
     */
    Button quit;
    
    /**
     * 
     */
    SongList ourList;
    
    /**
     * 
     */
    public SongWindow(SongList list)
    {
        // Window Instantiation.
        mainWindow = new Window("Project 5");
        
        // SongList Instantiation.
        ourList = list;
        
        //Button Instantiation.
        previous = new Button("⬅ Previous");
        next = new Button("Next ➡");
        sortByName = new Button("Sort By Artist Name");
        sortByGenre = new Button("Sort By Genre");
        sortBySongTitle = new Button("Sort by Song Title");
        sortByReleaseYear = new Button("Sort by Release Year");
        representHobby = new Button("Represent Hobby");
        representMajor = new Button("Represent Major");
        representRegion = new Button("Represent Region");
        quit = new Button("Quit");
        
        //Button ToDo when pushed.
        
        previous.onClick(this, "clickedPrevious");
        next.onClick(this, "clickedNext");
        sortByName.onClick(this, "clickedSortByName");
        sortByGenre.onClick(this, "clickedSortByGenre");
        sortBySongTitle.onClick(this, "clickedSortBySongTitle");
        sortByReleaseYear.onClick(this, "clickedSortByReleaseYear");
        representHobby.onClick(this, "clickedRepresentHobby");
        representMajor.onClick(this, "clickedRepresentMajor");
        representRegion.onClick(this, "clickedRepresentRegion");
        quit.onClick(this, "clickedQuit");
        
        //Button Addition.
        
        mainWindow.addButton(previous, WindowSide.NORTH);
        mainWindow.addButton(sortByName, WindowSide.NORTH);
        mainWindow.addButton(sortBySongTitle, WindowSide.NORTH);
        mainWindow.addButton(sortByReleaseYear, WindowSide.NORTH);
        mainWindow.addButton(sortByGenre, WindowSide.NORTH);
        mainWindow.addButton(next, WindowSide.NORTH);
        
        mainWindow.addButton(representHobby, WindowSide.SOUTH);
        mainWindow.addButton(representMajor, WindowSide.SOUTH);
        mainWindow.addButton(representRegion, WindowSide.SOUTH);
        mainWindow.addButton(quit, WindowSide.SOUTH);
    }
    
    //Button Pushed Methods.
    
    /**
     * 
     */
    public void clickedPrevious()
    {
        
    }
    
    /**
     * 
     */
    public void clickedNext()
    {
        
    }
    
    /**
     * 
     */
    public void clickedSortByName()
    {
        
    }
    
    /**
     * 
     */
    public void clickedSortByGenre()
    {
        
    }
    
    /**
     * 
     */
    public void clickedSortBySongTitle()
    {
        
    }
    
    /**
     * 
     */
    public void clickedSortByReleaesYear()
    {
        
    }
    
    /**
     * 
     */
    public void clickedRepresentHobby()
    {
        
    }
    
    /**
     * 
     */
    public void clickedRepresentMajor()
    {
        
    }
    
    /**
     * 
     */
    public void clickedRepresentRegion()
    {
        
    }
    
    /**
     * 
     */
    public void clickedQuit()
    {
        
    }
}
