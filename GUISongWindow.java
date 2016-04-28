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
    
    String bottomText;

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
        bottomText = new String("artist");

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
        if (sort.equals("hobby")) {
            firstSongPos = firstSongPos - 9;
            lastSongPos = firstSongPos;
            removeGUIGlyphs();
            for (int i = firstSongPos; i < firstSongPos + 9; i++) {
                if (lastSongPos < ourList.getList().size()) {
                    int[][] hobbyArray = createPercentArray(i);
                    String title = ourList.getList().get(lastSongPos)
                            .getSongTitle();
                    String btmTxt = btmTxt();
                    GUIGlyph hobbyGUIGlyph = new GUIGlyph(
                            100 + 200 * ((lastSongPos) % 3),
                            100 + 100 * (((lastSongPos) % 9) / 3), hobbyArray,
                            mainWindow, title, bottomText, btmTxt);

                    GUIGlyphs.add(hobbyGUIGlyph);
                    lastSongPos++;
                }
            }
            lastSongPos--;
        }

        else if (sort.equals("major")) {
            firstSongPos = firstSongPos - 9;
            lastSongPos = firstSongPos;
            removeGUIGlyphs();
            for (int i = firstSongPos; i < firstSongPos + 9; i++) {
                if (lastSongPos < ourList.getList().size()) {
                    int[][] majorArray = createPercentArray(i);
                    String title = ourList.getList().get(lastSongPos)
                            .getSongTitle();
                    String btmTxt = btmTxt();
                    GUIGlyph majorGUIGlyph = new GUIGlyph(
                            100 + 200 * ((lastSongPos) % 3),
                            100 + 100 * (((lastSongPos) % 9) / 3), majorArray,
                            mainWindow, title, bottomText, btmTxt);

                    GUIGlyphs.add(majorGUIGlyph);
                    lastSongPos++;
                }
            }
            lastSongPos--;
        }

        else if (sort.equals("region")) {
            firstSongPos = firstSongPos - 9;
            lastSongPos = firstSongPos;
            removeGUIGlyphs();
            for (int i = firstSongPos; i < firstSongPos + 9; i++) {
                if (lastSongPos < ourList.getList().size()) {
                    int[][] regionArray = createPercentArray(i);
                    String title = ourList.getList().get(lastSongPos)
                            .getSongTitle();
                    String btmTxt = btmTxt();
                    GUIGlyph regionGUIGlyph = new GUIGlyph(
                            100 + 200 * ((lastSongPos) % 3),
                            100 + 100 * (((lastSongPos) % 9) / 3), regionArray,
                            mainWindow, title, bottomText, btmTxt);

                    GUIGlyphs.add(regionGUIGlyph);
                    lastSongPos++;
                }
            }
            lastSongPos--;
        }
        checkButtons();
    }

    /**
     * 
     */
    public void clickedNext(Button nextButton) {
        if (sort.equals("hobby")) {
            firstSongPos = lastSongPos + 1;
            lastSongPos = firstSongPos;
            removeGUIGlyphs();
            for (int i = firstSongPos; i < firstSongPos + 9; i++) {
                if (lastSongPos < ourList.getList().size()) {
                    int[][] hobbyArray = createPercentArray(i);
                    String title = ourList.getList().get(lastSongPos)
                            .getSongTitle();
                    String btmTxt = btmTxt();
                    GUIGlyph hobbyGUIGlyph = new GUIGlyph(
                            100 + 200 * ((lastSongPos) % 3),
                            100 + 100 * (((lastSongPos) % 9) / 3), hobbyArray,
                            mainWindow, title, bottomText, btmTxt);

                    GUIGlyphs.add(hobbyGUIGlyph);
                    lastSongPos++;
                }
            }
            lastSongPos--;
        }

        else if (sort.equals("major")) {
            firstSongPos = lastSongPos + 1;
            lastSongPos = firstSongPos;
            removeGUIGlyphs();
            for (int i = firstSongPos; i < firstSongPos + 9; i++) {
                if (lastSongPos < ourList.getList().size()) {
                    int[][] majorArray = createPercentArray(i);
                    String title = ourList.getList().get(lastSongPos)
                            .getSongTitle();
                    String btmTxt = btmTxt();
                    GUIGlyph majorGUIGlyph = new GUIGlyph(
                            100 + 200 * ((lastSongPos) % 3),
                            100 + 100 * (((lastSongPos) % 9) / 3), majorArray,
                            mainWindow, title, bottomText, btmTxt);

                    GUIGlyphs.add(majorGUIGlyph);
                    lastSongPos++;
                }
            }
            lastSongPos--;
        }

        else if (sort.equals("region")) {
            firstSongPos = lastSongPos + 1;
            lastSongPos = firstSongPos;
            removeGUIGlyphs();
            for (int i = firstSongPos; i < firstSongPos + 9; i++) {
                if (lastSongPos < ourList.getList().size()) {
                    int[][] regionArray = createPercentArray(i);
                    String title = ourList.getList().get(lastSongPos)
                            .getSongTitle();
                    String btmTxt = btmTxt();
                    GUIGlyph regionGUIGlyph = new GUIGlyph(
                            100 + 200 * ((lastSongPos) % 3),
                            100 + 100 * (((lastSongPos) % 9) / 3), regionArray,
                            mainWindow, title, bottomText, btmTxt);

                    GUIGlyphs.add(regionGUIGlyph);
                    lastSongPos++;
                }
            }
            lastSongPos--;
        }
        checkButtons();
    }

    /**
     * 
     */
    public void clickedSortByName(Button nameButton) {
        ourList.sortByArtistName();
        for (int i = firstSongPos; i <= firstSongPos + 8; i++) {
            if (i < ourList.getList().size()) {
                String name = ourList.getList().get(i).getArtistName();
                String title = ourList.getList().get(i).getSongTitle();
                GUIGlyphs.get(i % 9).setBottomText("by " + name);
                GUIGlyphs.get(i % 9).setTitle(title);
                int[][] newArray = createPercentArray(i);
                
                GUIGlyphs.get(i % 9).swapBars(newArray, mainWindow);
            }
        }
        checkButtons();
    }

    /**
     * 
     */
    public void clickedSortByGenre(Button genreButton) {
        ourList.sortByGenre();
        bottomText = "genre";
        for (int i = firstSongPos; i <= firstSongPos + 8; i++) {
            if (i < ourList.getList().size()) {
                String genre = ourList.getList().get(i).getGenre();
                String title = ourList.getList().get(i).getSongTitle();
                GUIGlyphs.get(i % 9).setBottomText("genre: " + genre);
                GUIGlyphs.get(i % 9).setTitle(title);
                int[][] newArray = createPercentArray(i);
                
                GUIGlyphs.get(i % 9).swapBars(newArray, mainWindow);
            }

        }
        checkButtons();
    }

    /**
     * 
     */
    public void clickedSortBySongTitle(Button titleButton) {
        ourList.sortBySongTitle();
        bottomText = "artist";
        for (int i = firstSongPos; i <= firstSongPos + 8; i++) {
            if (i < ourList.getList().size()) {
                String name = ourList.getList().get(i).getArtistName();
                String title = ourList.getList().get(i).getSongTitle();
                GUIGlyphs.get(i % 9).setBottomText("by " + name);
                GUIGlyphs.get(i % 9).setTitle(title);
                int[][] newArray = createPercentArray(i);
                
                GUIGlyphs.get(i % 9).swapBars(newArray, mainWindow);
            }
        }
        checkButtons();
    }

    /**
     * 
     */
    public void clickedSortByReleaseYear(Button yearButton) {
        ourList.sortByReleaseYear();
        bottomText = "year";
        for (int i = firstSongPos; i <= firstSongPos + 8; i++) {
            if (i < ourList.getList().size()) {
                String year = ourList.getList().get(i).getDate();
                String title = ourList.getList().get(i).getSongTitle();
                GUIGlyphs.get(i % 9).setBottomText("year: " + year);
                GUIGlyphs.get(i % 9).setTitle(title);
                int[][] newArray = createPercentArray(i);
                
                GUIGlyphs.get(i % 9).swapBars(newArray, mainWindow);
            }

        }
        checkButtons();
    }

    /**
     * 
     */
    public void clickedRepresentHobby(Button hobbyButton) {
        sort = "hobby";
        removeGUIGlyphs();
        mainKey.updateKey("Hobby Legend", "Reading", "Art", "Sports", "Music");
        if (lastSongPos == 0) {
            createFirstGUIGlyphs();
        }

        else {
            for (int i = firstSongPos; i <= firstSongPos + 8; i++) {
                if (i < ourList.getList().size()) {
                    int[][] hobbyArray = createPercentArray(i);

                    String title = ourList.getList().get(i).getSongTitle();
                    String btmTxt = btmTxt();
                    GUIGlyph hobbyGUIGlyph = new GUIGlyph(100 + 200 * ((i) % 3),
                            100 + 100 * (((i) % 9) / 3), hobbyArray, mainWindow,
                            title, bottomText, btmTxt);

                    GUIGlyphs.add(hobbyGUIGlyph);
                }
            }
        }
        checkButtons();
    }

    /**
     * 
     */
    public void clickedRepresentMajor(Button majorButton) {
        sort = "major";
        removeGUIGlyphs();
        mainKey.updateKey("Major Legend", "Comp Sci", "Other Eng", "Math/CMDA",
                "Other");
        if (lastSongPos == 0) {
            createFirstGUIGlyphs();
        } else {
            for (int i = firstSongPos; i <= firstSongPos + 8; i++) {
                if (i < ourList.getList().size()) {
                    int[][] majorArray = createPercentArray(i);
                    String title = ourList.getList().get(i).getSongTitle();
                    String btmTxt = btmTxt();
                    GUIGlyph majorGUIGlyph = new GUIGlyph(100 + 200 * ((i) % 3),
                            100 + 100 * (((i) % 9) / 3), majorArray, mainWindow,
                            title, bottomText, btmTxt);

                    GUIGlyphs.add(majorGUIGlyph);
                }
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
        mainKey.updateKey("Region Legend", "Northeast US", "Southeast US",
                "the rest of US", "Outside the US");
        if (lastSongPos == 0) {
            createFirstGUIGlyphs();
        } else {
            for (int i = firstSongPos; i <= firstSongPos + 8; i++) {
                if (i < ourList.getList().size()) {
                    int[][] regionArray = createPercentArray(i);
                    String title = ourList.getList().get(i).getSongTitle();
                    String btmTxt = btmTxt();
                    GUIGlyph regionGUIGlyph = new GUIGlyph(
                            100 + 200 * ((i) % 3), 100 + 100 * (((i) % 9) / 3),
                            regionArray, mainWindow, title, bottomText, btmTxt);

                    GUIGlyphs.add(regionGUIGlyph);
                }
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

    private void removeGUIGlyphs() {
        int amtGUIGlyphs = GUIGlyphs.size();

        for (int i = 0; i < amtGUIGlyphs; i++) {
            int GUIGlyphComponents = GUIGlyphs.get(0).getGUIGlyphList().size();
            for (int k = 0; k < GUIGlyphComponents; k++) {
                mainWindow
                        .removeShape(GUIGlyphs.get(0).getGUIGlyphList().get(0));
                GUIGlyphs.get(0).getGUIGlyphList().remove(0);
            }

            GUIGlyphs.remove(0);
        }

    }

    /**
     * Incomplete
     */
    private void checkButtons() {
        if (lastSongPos == ourList.getList().size() - 1) {
            next.disable();
        }

        else {
            next.enable();
        }

        if (lastSongPos == 8 || firstSongPos == 0) {
            previous.disable();
        }

        else {
            previous.enable();
        }
    }

    /**
     * Ignore for now
     */
    private void createFirstGUIGlyphs() {
        if (sort.equals("hobby")) {
            for (int i = firstSongPos; i < firstSongPos + 9; i++) {
                if (lastSongPos < ourList.getList().size()) {
                    int[][] hobbyArray = createPercentArray(i);
                    String title = ourList.getList().get(lastSongPos)
                            .getSongTitle();
                    String btmTxt = btmTxt();
                    GUIGlyph hobbyGUIGlyph = new GUIGlyph(
                            100 + 200 * ((lastSongPos) % 3),
                            100 + 100 * (((lastSongPos) % 9) / 3), hobbyArray,
                            mainWindow, title, bottomText, btmTxt);

                    GUIGlyphs.add(hobbyGUIGlyph);
                    lastSongPos++;
                }
            }
            lastSongPos--;
        }

        else if (sort.equals("major")) {
            for (int i = firstSongPos; i < firstSongPos + 9; i++) {
                if (lastSongPos < ourList.getList().size()) {
                    int[][] majorArray = createPercentArray(i);
                    String title = ourList.getList().get(lastSongPos)
                            .getSongTitle();
                    String btmTxt = btmTxt();
                    GUIGlyph majorGUIGlyph = new GUIGlyph(
                            100 + 200 * ((lastSongPos) % 3),
                            100 + 100 * (((lastSongPos) % 9) / 3), majorArray,
                            mainWindow, title, bottomText, btmTxt);

                    GUIGlyphs.add(majorGUIGlyph);
                    lastSongPos++;
                }
            }
            lastSongPos--;
        }

        else if (sort.equals("region")) {
            for (int i = firstSongPos; i < firstSongPos + 9; i++) {
                if (lastSongPos < ourList.getList().size()) {
                    int[][] regionArray = createPercentArray(i);
                    String title = ourList.getList().get(lastSongPos)
                            .getSongTitle();
                    String btmTxt = btmTxt();
                    GUIGlyph regionGUIGlyph = new GUIGlyph(
                            100 + 200 * ((lastSongPos) % 3),
                            100 + 100 * (((lastSongPos) % 9) / 3), regionArray,
                            mainWindow, title, bottomText, btmTxt);

                    GUIGlyphs.add(regionGUIGlyph);
                    lastSongPos++;
                }
            }
            lastSongPos--;
        }
    }

    private int[][] createPercentArray(int index) {
        if (sort.equals("hobby")) {
            int[][] hobbyArray = new int[2][4];
            hobbyArray[0][0] = ourList.getList().get(index)
                    .getHeardPercent("read");
            hobbyArray[0][1] = ourList.getList().get(index)
                    .getHeardPercent("art");
            hobbyArray[0][2] = ourList.getList().get(index)
                    .getHeardPercent("sports");
            hobbyArray[0][3] = ourList.getList().get(index)
                    .getHeardPercent("music");
            hobbyArray[1][0] = ourList.getList().get(index)
                    .getLikedPercent("read");
            hobbyArray[1][1] = ourList.getList().get(index)
                    .getLikedPercent("art");
            hobbyArray[1][2] = ourList.getList().get(index)
                    .getLikedPercent("sports");
            hobbyArray[1][3] = ourList.getList().get(index)
                    .getLikedPercent("music");
            return hobbyArray;
        }

        else if (sort.equals("major")) {
            int[][] majorArray = new int[2][4];
            majorArray[0][0] = ourList.getList().get(index)
                    .getHeardPercent("Computer Science");
            majorArray[0][1] = ourList.getList().get(index)
                    .getHeardPercent("Other Eng");
            majorArray[0][2] = ourList.getList().get(index)
                    .getHeardPercent("Math or CMDA");
            majorArray[0][3] = ourList.getList().get(index)
                    .getHeardPercent("Other");
            majorArray[1][0] = ourList.getList().get(index)
                    .getLikedPercent("Computer Science");
            majorArray[1][1] = ourList.getList().get(index)
                    .getLikedPercent("Other Eng");
            majorArray[1][2] = ourList.getList().get(index)
                    .getLikedPercent("Math or CMDA");
            majorArray[1][3] = ourList.getList().get(index)
                    .getLikedPercent("Other");
            return majorArray;
        }

        else if (sort.equals("region")) {

            int[][] regionArray = new int[2][4];
            regionArray[0][0] = ourList.getList().get(index)
                    .getHeardPercent("Northeast US");
            regionArray[0][1] = ourList.getList().get(index)
                    .getHeardPercent("Southeast US");
            regionArray[0][2] = ourList.getList().get(index)
                    .getHeardPercent("Other US");
            regionArray[0][3] = ourList.getList().get(index)
                    .getHeardPercent("Outside US");
            regionArray[1][0] = ourList.getList().get(index)
                    .getLikedPercent("Northeast US");
            regionArray[1][1] = ourList.getList().get(index)
                    .getLikedPercent("Southeast US");
            regionArray[1][2] = ourList.getList().get(index)
                    .getLikedPercent("Other US");
            regionArray[1][3] = ourList.getList().get(index)
                    .getLikedPercent("Outside US");
            return regionArray;

        }
        else
        {
            return null;
        }
        
    }
    
    private String btmTxt()
    {
        if (bottomText.equals("artist"))
        {
            return ourList.getList().get(lastSongPos)
            .getArtistName();
        }
        else if (bottomText.equals("genre"))
        {
            return ourList.getList().get(lastSongPos)
            .getGenre();
        }
        
        else if (bottomText.equals("year"))
        {
            return ourList.getList().get(lastSongPos).getDate();
        }
        else
        {
            return null;
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
            songText = new TextShape(xValue - 15, yValue + 90, "Song Title",
                    Color.BLACK);
            heardText = new TextShape(xValue - 29, yValue + 135, "Heard",
                    Color.BLACK);
            likedText = new TextShape(xValue + 23, yValue + 135, "Likes",
                    Color.BLACK);
            blackBar = new Shape(xValue + 13, yValue + 105, 10, 75,
                    Color.BLACK);

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
        public void updateKey(String newTitle, String newPurple,
                String newBlue, String newYellow, String newGreen) {
            keyTitle.setText(newTitle);
            greenText.setText(newGreen);
            yellowText.setText(newYellow);
            blueText.setText(newBlue);
            purpleText.setText(newPurple);
        }

    }
}
