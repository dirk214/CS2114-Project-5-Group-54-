/**
 * 
 */
package prj5;

/**
 * @author Group 54
 * @version 2016.04.10 A Song contains an artist name, title, genre, and year
 *          date. It also has information on who has heard/liked it based on
 *          someone's hobby, major, or region.
 *
 */
public class Song {
    private String artistName;
    private String songTitle;
    private String genre;
    private String date;
    int[][] hobbyArray;
    int[][] majorArray;
    int[][] regionArray;

    public Song(String artist, String title, String type, String year) {
        artistName = artist;
        songTitle = title;
        genre = type;
        date = year;

        hobbyArray = new int[2][4];
        majorArray = new int[2][4];
        regionArray = new int[2][4];
    }

    public String getArtistName() {
        return artistName;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getGenre() {
        return genre;
    }

    public String getDate() {
        return date;
    }

    public int getHeard(String category) {
        switch (category) {
        case "read":
            return hobbyArray[0][0];

        case "art":
            return hobbyArray[0][1];

        case "sports":
            return hobbyArray[0][2];

        case "music":
            return hobbyArray[0][3];

        case "Computer Science":
            return majorArray[0][0];

        case "Other Eng":
            return majorArray[0][1];

        case "Math or CMDA":
            return majorArray[0][2];

        case "Other":
            return majorArray[0][3];

        case "Northeast US":
            return regionArray[0][0];

        case "Southeast US":
            return regionArray[0][1];

        case "Other US":
            return regionArray[0][2];

        case "Outside US":
            return regionArray[0][3];

        default:
            throw new IllegalArgumentException();
        }
    }

    public int getLikes(String category) {
        switch (category) {
        case "read":
            category = "Read";
            return hobbyArray[1][0];

        case "art":
            category = "Art";
            return hobbyArray[1][1];

        case "sports":
            category = "Sports";
            return hobbyArray[1][2];

        case "music":
            return hobbyArray[1][3];

        case "Computer Science":
            return majorArray[1][0];

        case "Other Eng":
            return majorArray[1][1];

        case "Math or CMDA":
            return majorArray[1][2];

        case "Other":
            return majorArray[1][3];

        case "Northeast US":
            return regionArray[1][0];

        case "Southeast US":
            return regionArray[1][1];

        case "Other US":
            return regionArray[1][2];

        case "Outside US":
            return regionArray[1][3];

        default:
            throw new IllegalArgumentException();
        }
    }
}
