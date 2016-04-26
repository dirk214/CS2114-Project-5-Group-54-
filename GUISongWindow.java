package prj5;

import CS2114.WindowSide;
import java.awt.Color;
import CS2114.Button;
import CS2114.Shape;
import CS2114.TextShape;
import CS2114.Window;

/**
 * 
 * @author Group54
 * @version 2016.04.11
 */
public class GUISongWindow {
    // Fields:

    LinkedList<GUIGlyph> GUIGlyphs;
    int firstSongPos = 0;
    int lastSongPos = 0;
    
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
    
    String sort;

    /**
     * 
     */
    Key mainKey;

    /**
     * 
     */
    public GUISongWindow(SongList list) {
        // Window Instantiation.
        mainWindow = new Window("Project 5");

        // SongList Instantiation.
        ourList = list;
        
        sort = new String("");

        GUIGlyphs = new LinkedList<GUIGlyph>();
        
        mainKey = new Key(650, 100);

        // Button Instantiation.
        previous = new Button(" Previous");
        next = new Button("Next ");
        sortByName = new Button("Sort By Artist Name");
        sortByGenre = new Button("Sort By Genre");
        sortBySongTitle = new Button("Sort by Song Title");
        sortByReleaseYear = new Button("Sort by Release Year");
        representHobby = new Button("Represent Hobby");
        representMajor = new Button("Represent Major");
        representRegion = new Button("Represent Region");
        quit = new Button("Quit");

        // Button ToDo when pushed.

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

        // Button Addition.

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
        
        checkButtons();

    }

    // Button Pushed Methods.

    /**
     * 
     */
    public void clickedPrevious(Button prevButton) {
        if (sort.equals("hobby"))
        {
            System.out.println("First Old: " + firstSongPos);
            firstSongPos = firstSongPos - 9;
            System.out.println("First New: " + firstSongPos);
            System.out.println("Last Old: " + (lastSongPos));
            lastSongPos = firstSongPos;
            removeGUIGlyphs();
            for (int i = firstSongPos; i < firstSongPos + 9; i++) {
                if (lastSongPos < ourList.getList().size()) {
                    int[][] hobbyArray = ourList.getList().get(lastSongPos).hobbyArray;
                    String title = ourList.getList().get(lastSongPos).getSongTitle();
                    String author = ourList.getList().get(lastSongPos).getArtistName();
                    GUIGlyph hobbyGUIGlyph = new GUIGlyph(100 + 200 * ((lastSongPos) % 3),
                            100 + 100 * (((lastSongPos) % 9) / 3), hobbyArray, mainWindow, title,
                            author);
                    
                    GUIGlyphs.add(hobbyGUIGlyph);
                    lastSongPos++;
                }
            }
            lastSongPos--;
            System.out.println("Last new: " + lastSongPos);
        }
        
        else if (sort.equals("major"))
        {
            firstSongPos = firstSongPos - 9;
            lastSongPos = firstSongPos;
            removeGUIGlyphs();
            for (int i = firstSongPos; i < firstSongPos + 9; i++) {
                if (lastSongPos < ourList.getList().size()) {
                    int[][] majorArray = ourList.getList().get(lastSongPos).majorArray;
                    String title = ourList.getList().get(lastSongPos).getSongTitle();
                    String author = ourList.getList().get(lastSongPos).getArtistName();
                    GUIGlyph majorGUIGlyph = new GUIGlyph(100 + 200 * ((lastSongPos) % 3),
                            100 + 100 * (((lastSongPos) % 9) / 3), majorArray, mainWindow, title,
                            author);
                    
                    GUIGlyphs.add(majorGUIGlyph);
                    lastSongPos++;
                }
            }
        }
        
        else if (sort.equals("region"))
        {
            firstSongPos = firstSongPos - 9;
            lastSongPos = firstSongPos;
            removeGUIGlyphs();
            for (int i = firstSongPos; i < firstSongPos + 9; i++) {
                if (lastSongPos < ourList.getList().size()) {
                    int[][] regionArray = ourList.getList().get(lastSongPos).regionArray;
                    String title = ourList.getList().get(lastSongPos).getSongTitle();
                    String author = ourList.getList().get(lastSongPos).getArtistName();
                    GUIGlyph regionGUIGlyph = new GUIGlyph(100 + 200 * ((lastSongPos) % 3),
                            100 + 100 * (((lastSongPos) % 9) / 3), regionArray, mainWindow, title,
                            author);
                    
                    GUIGlyphs.add(regionGUIGlyph);
                    lastSongPos++;
                }
            }
        }
    }

    /**
     * 
     */
    public void clickedNext(Button nextButton) {
        if (sort.equals("hobby"))
        {
            firstSongPos = lastSongPos + 1;
            lastSongPos = firstSongPos;
            removeGUIGlyphs();
            for (int i = firstSongPos; i < firstSongPos + 9; i++) {
                if (lastSongPos < ourList.getList().size()) {
                    int[][] hobbyArray = ourList.getList().get(lastSongPos).hobbyArray;
                    String title = ourList.getList().get(lastSongPos).getSongTitle();
                    String author = ourList.getList().get(lastSongPos).getArtistName();
                    GUIGlyph hobbyGUIGlyph = new GUIGlyph(100 + 200 * ((lastSongPos) % 3),
                            100 + 100 * (((lastSongPos) % 9) / 3), hobbyArray, mainWindow, title,
                            author);
                    
                    GUIGlyphs.add(hobbyGUIGlyph);
                    lastSongPos++;
                }
            }
            lastSongPos--;
        }
        
        else if (sort.equals("major"))
        {
            firstSongPos = lastSongPos + 1;
            lastSongPos = firstSongPos;
            removeGUIGlyphs();
            for (int i = firstSongPos; i < firstSongPos + 9; i++) {
                if (lastSongPos < ourList.getList().size()) {
                    int[][] majorArray = ourList.getList().get(lastSongPos).majorArray;
                    String title = ourList.getList().get(lastSongPos).getSongTitle();
                    String author = ourList.getList().get(lastSongPos).getArtistName();
                    GUIGlyph majorGUIGlyph = new GUIGlyph(100 + 200 * ((lastSongPos) % 3),
                            100 + 100 * (((lastSongPos) % 9) / 3), majorArray, mainWindow, title,
                            author);
                    
                    GUIGlyphs.add(majorGUIGlyph);
                    lastSongPos++;
                }
            }
            lastSongPos--;
        }
        
        else if (sort.equals("region"))
        {
            firstSongPos = lastSongPos + 1;
            lastSongPos = firstSongPos;
            removeGUIGlyphs();
            for (int i = firstSongPos; i < firstSongPos + 9; i++) {
                if (lastSongPos < ourList.getList().size()) {
                    int[][] regionArray = ourList.getList().get(lastSongPos).regionArray;
                    String title = ourList.getList().get(lastSongPos).getSongTitle();
                    String author = ourList.getList().get(lastSongPos).getArtistName();
                    GUIGlyph regionGUIGlyph = new GUIGlyph(100 + 200 * ((lastSongPos) % 3),
                            100 + 100 * (((lastSongPos) % 9) / 3), regionArray, mainWindow, title,
                            author);
                    
                    GUIGlyphs.add(regionGUIGlyph);
                    lastSongPos++;
                }
            }
            lastSongPos--;
        }
    }

    /**
     * 
     */
    public void clickedSortByName(Button nameButton) 
    {
        ourList.sortByArtistName();
        createFirstGUIGlyphs();
        for (int i = 8; i >= 0; i--)
        {
            if (listPos - i < ourList.getList().size() && listPos - i < GUIGlyphs.size())
            {
            String Name = ourList.getList().get(listPos - i).getArtistName();
            String title = ourList.getList().get(listPos - i).getSongTitle();
            GUIGlyphs.get(listPos - i).setBottomText(Name);
            GUIGlyphs.get(listPos - i).setTitle(title);
            //GUIGlyphs.get(listPos - i).updateLengthOfBars();
            }
        }
    }

    /**
     * 
     */
    public void clickedSortByGenre(Button genreButton) {
        ourList.sortByGenre();
        createFirstGUIGlyphs();
        for (int i = 8; i >= 0; i--)
        {
            if (listPos - i < ourList.getList().size() && listPos - i < GUIGlyphs.size())
            {
            String genre = ourList.getList().get(listPos - i).getGenre();
            String title = ourList.getList().get(listPos - i).getSongTitle();
            GUIGlyphs.get(listPos - i).setBottomText(genre);
            GUIGlyphs.get(listPos - i).setTitle(title);
            //GUIGlyphs.get(listPos - i).updateLengthOfBars();
            }
        }
    }

    /**
     * 
     */
    public void clickedSortBySongTitle(Button titleButton) {
        ourList.sortBySongTitle();
        createFirstGUIGlyphs();
        for (int i = 8; i >= 0; i--)
        {
            if (listPos - i < ourList.getList().size() && listPos - i < GUIGlyphs.size())
            {
            String title = ourList.getList().get(listPos - i).getSongTitle();
            GUIGlyphs.get(listPos - i).setBottomText(title);
            GUIGlyphs.get(listPos - i).setTitle(title);
            //GUIGlyphs.get(listPos - i).updateLengthOfBars();
            }
        }
    }

    /**
     * 
     */
    public void clickedSortByReleaseYear(Button yearButton) 
    {
        ourList.sortByReleaseYear();
        for (int i = 8; i >= 0; i--)
        {
            if (listPos - i < ourList.getList().size() && listPos - i < GUIGlyphs.size())
            {
            String year = ourList.getList().get(listPos - i).getDate();
            String title = ourList.getList().get(listPos - i).getSongTitle();
            GUIGlyphs.get(listPos - i).setBottomText(year);
            GUIGlyphs.get(listPos - i).setTitle(title);
            //GUIGlyphs.get(listPos - i).updateLengthOfBars();
            }
        }
    }

    /**
     * 
     */
    public void clickedRepresentHobby(Button hobbyButton) {
        sort = "hobby";
        removeGUIGlyphs();
        mainKey.updateKey("Hobby Legend", "Read", "Art", "Sports", "Music");
        for (int i = firstSongPos; i <= firstSongPos + 8; i++) {
            if (lastSongPos < ourList.getList().size()) {
                int[][] hobbyArray = ourList.getList().get(lastSongPos).hobbyArray;
                String title = ourList.getList().get(lastSongPos).getSongTitle();
                String author = ourList.getList().get(lastSongPos).getArtistName();
                GUIGlyph hobbyGUIGlyph = new GUIGlyph(100 + 200 * ((lastSongPos) % 3),
                        100 + 100 * (((lastSongPos) % 9) / 3), hobbyArray, mainWindow, title,
                        author);
                
                GUIGlyphs.add(hobbyGUIGlyph);
                lastSongPos++;
            }
        }
        lastSongPos--;
        checkButtons();
    }

    /**
     * 
     */
    public void clickedRepresentMajor(Button majorButton) {
        sort = "major";
        removeGUIGlyphs();
        createFirstGUIGlyphs();
        mainKey.updateKey("Major Legend", "Comp Sci", "Other Eng", "Math/CMDA", "Other");
        for (int i = firstSongPos; i < firstSongPos + 9; i++) {
            if (lastSongPos < ourList.getList().size()) {
                int[][] majorArray = ourList.getList().get(lastSongPos).majorArray;
                String title = ourList.getList().get(lastSongPos).getSongTitle();
                String author = ourList.getList().get(lastSongPos).getArtistName();
                GUIGlyph majorGUIGlyph = new GUIGlyph(100 + 200 * ((lastSongPos) % 3),
                        100 + 100 * (((lastSongPos) % 9) / 3), majorArray, mainWindow, title,
                        author);
                
                GUIGlyphs.add(majorGUIGlyph);
                lastSongPos++;
            }
        }
        checkButtons();
    }

    /**
     * 
     */
    public void clickedRepresentRegion(Button regionButton) {
        sort = "region";
        removeGUIGlyphs();
        createFirstGUIGlyphs();
        mainKey.updateKey("Region Legend", "Northeast US", "Southeast US", "the rest of US", "Outside the US");
        for (int i = firstSongPos; i < firstSongPos + 9; i++) {
            if (lastSongPos < ourList.getList().size()) {
                int[][] regionArray = ourList.getList().get(lastSongPos).regionArray;
                String title = ourList.getList().get(lastSongPos).getSongTitle();
                String author = ourList.getList().get(lastSongPos).getArtistName();
                GUIGlyph regionGUIGlyph = new GUIGlyph(100 + 200 * ((lastSongPos) % 3),
                        100 + 100 * (((lastSongPos) % 9) / 3), regionArray, mainWindow, title,
                        author);
                
                GUIGlyphs.add(regionGUIGlyph);
                lastSongPos++;
            }
        }
        checkButtons();
    }

    /**
     * 
     */
    public void clickedQuit(Button quitButton) {
        System.exit(0);
    }

    private void removeGUIGlyphs()
    {
        int amtGUIGlyphs = GUIGlyphs.size();
        
        for (int i = 0; i < amtGUIGlyphs; i++)
        {
            int GUIGlyphComponents = GUIGlyphs.get(0).getGUIGlyphList().size();
            for (int k = 0; k < GUIGlyphComponents; k++)
            {
                mainWindow.removeShape(GUIGlyphs.get(0).getGUIGlyphList().get(0));
                GUIGlyphs.get(0).getGUIGlyphList().remove(0);
            }
            
            GUIGlyphs.remove(0);
        }
        
        
    }
    
    /**
     * Incomplete
     */
    private void checkButtons()
    {
        if (lastSongPos == ourList.getList().size() - 1)
        {
            next.disable();
        }
        
        else
        {
            next.enable();
        }
        
        if (lastSongPos == 0)
        {
            previous.disable();
        }
        
        else
        {
            previous.enable();
        }
    }
    
    /**
     * Ignore for now
     */
    private void createFirstGUIGlyphs()
    {
        if (lastSongPos == 0)
        {
            lastSongPos = 8;
        }
    }

    /**
     * @author Group54
     * @version 2016.04.11
     */
    private class Key extends Shape {

        /**
         * 
         */
        TextShape keyTitle;

        /**
         * 
         */
        TextShape purpleText;

        /**
         * 
         */
        TextShape blueText;

        /**
         * 
         */
        TextShape yellowText;

        /**
         * 
         */
        TextShape greenText;

        /**
         * 
         */
        TextShape songText;

        /**
         * 
         */
        TextShape heardText;

        /**
         * 
         */
        TextShape likedText;

        /**
         * 
         */
        Shape blackBar;

        /**
         * 
         */
        int xValue;

        /**
         * 
         */
        int yValue;

        /**
         * 
         * @param x
         * @param y
         */
        public Key(int x, int y) {
            super(x, y);
            xValue = x;
            yValue = y;

            // Fields instantiation.
            keyTitle = new TextShape(xValue - 15, yValue, "", Color.BLACK);
            purpleText = new TextShape(xValue, yValue + 25, "", Color.MAGENTA);
            blueText = new TextShape(xValue, yValue + 40, "", Color.BLUE);
            yellowText = new TextShape(xValue, yValue + 55, "", Color.YELLOW);
            greenText = new TextShape(xValue, yValue + 70, "", Color.GREEN);
            songText = new TextShape(xValue - 15, yValue + 90, "Song Title", Color.BLACK);
            heardText = new TextShape(xValue - 29, yValue + 135, "Heard", Color.BLACK);
            likedText = new TextShape(xValue + 23, yValue + 135, "Likes", Color.BLACK);
            blackBar = new Shape(xValue + 13, yValue + 105, 10, 75, Color.BLACK);

            // Fields addition.

            mainWindow.addShape(keyTitle);
            mainWindow.addShape(purpleText);
            mainWindow.addShape(greenText);
            mainWindow.addShape(blueText);
            mainWindow.addShape(yellowText);
            mainWindow.addShape(songText);
            mainWindow.addShape(heardText);
            mainWindow.addShape(likedText);
            mainWindow.addShape(blackBar);
        }

        /**
         * 
         */
        public int getX() {
            return xValue;
        }

        /**
         * 
         */
        public int getY() {
            return yValue;
        }

        /**
         * Is called by the button onClickMethods and redo's the key.
         */
        public void updateKey(String newTitle, String newGreen,
                String newPurple, String newYellow, String newBlue) {
            keyTitle.setText(newTitle);
            greenText.setText(newGreen);
            yellowText.setText(newYellow);
            blueText.setText(newBlue);
            purpleText.setText(newPurple);
        }

    }
}
