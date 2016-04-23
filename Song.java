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
    /**
     * A song's hobby array
     */
    int[][] hobbyArray;
    /**
     * A song's total hobby array
     */
    int[][] hobbyTotArray;
    /**
     * A song's major array
     */
    int[][] majorArray;
    /**
     * A song's total major array
     */
    int[][] majorTotArray;
    /**
     * A song's region array
     */
    int[][] regionArray;
    /**
     * A song's total region array
     */
    int[][] regionTotArray;

    /**
     * Creates a new song with specified info
     * @param artist The song's artist
     * @param title The song's title
     * @param type The song's genre
     * @param year The song's release year
     */
    public Song(String artist, String title, String type, String year) {
        artistName = artist;
        songTitle = title;
        genre = type;
        date = year;

        hobbyArray = new int[2][4];
        majorArray = new int[2][4];
        regionArray = new int[2][4];
        hobbyTotArray = new int[2][4];
        majorTotArray = new int[2][4];
        regionTotArray = new int[2][4];
    }

    /**
     * Gets the artist's name
     * @return The artist's name
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * Gets the song's title
     * @return The song's title
     */
    public String getSongTitle() {
        return songTitle;
    }

    /**
     * Gets the song's genre
     * @return The song's genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Gets the song's date
     * @return The song's date
     */
    public String getDate() {
        return date;
    }

    /**
     * Gets the song's heard count
     * @param category The specified category
     * @return The heard count
     */
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

    /**
     * Gets the like count for a song
     * @param category The specified category
     * @return The like count
     */
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

    /**
     * Gets the heard percentage
     * @param category The specified category
     * @return The heard percentage
     */
    public int getHeardPercent(String category) {
        switch (category) {
            case "read":
                if (hobbyTotArray[0][0] == 0) {
                    return 0;
                }
                return (100 * hobbyArray[0][0]) / hobbyTotArray[0][0];

            case "art":
                if (hobbyTotArray[0][1] == 0) {
                    return 0;
                }
                return (100 * hobbyArray[0][1]) / hobbyTotArray[0][1];

            case "sports":
                if (hobbyTotArray[0][2] == 0) {
                    return 0;
                }
                return (100 * hobbyArray[0][2]) / hobbyTotArray[0][2];

            case "music":
                if (hobbyTotArray[0][3] == 0) {
                    return 0;
                }
                return (100 * hobbyArray[0][3]) / hobbyTotArray[0][3];

            case "Computer Science":
                if (majorTotArray[0][0] == 0) {
                    return 0;
                }
                return (100 * majorArray[0][0]) / majorTotArray[0][0];

            case "Other Eng":
                if (majorTotArray[0][1] == 0) {
                    return 0;
                }
                return (100 * majorArray[0][1]) / majorTotArray[0][1];

            case "Math or CMDA":
                if (majorTotArray[0][2] == 0) {
                    return 0;
                }
                return (100 * majorArray[0][2]) / majorTotArray[0][2];

            case "Other":
                if (majorTotArray[0][3] == 0) {
                    return 0;
                }
                return (100 * majorArray[0][3]) / majorTotArray[0][3];

            case "Northeast US":
                if (regionTotArray[0][0] == 0) {
                    return 0;
                }
                return (100 * regionArray[0][0]) / regionTotArray[0][0];

            case "Southeast US":
                if (regionTotArray[0][1] == 0) {
                    return 0;
                }
                return (100 * regionArray[0][1]) / regionTotArray[0][1];

            case "Other US":
                if (regionTotArray[0][2] == 0) {
                    return 0;
                }
                return (100 * regionArray[0][2]) / regionTotArray[0][2];

            case "Outside US":
                if (regionTotArray[0][3] == 0) {
                    return 0;
                }
                return (100 * regionArray[0][3]) / regionTotArray[0][3];

            default:
                throw new IllegalArgumentException();
        }
    }

    /**
     * Gets the liked percentage
     * @param category The specified category
     * @return The liked percentage
     */
    public int getLikedPercent(String category) {
        switch (category) {
            case "read":
                if (hobbyTotArray[1][0] == 0) {
                    return 0;
                }
                return (100 * hobbyArray[1][0]) / hobbyTotArray[1][0];

            case "art":
                if (hobbyTotArray[1][1] == 0) {
                    return 0;
                }
                return (100 * hobbyArray[1][1]) / hobbyTotArray[1][1];

            case "sports":
                if (hobbyTotArray[1][2] == 0) {
                    return 0;
                }
                return (100 * hobbyArray[1][2]) / hobbyTotArray[1][2];

            case "music":
                if (hobbyTotArray[1][3] == 0) {
                    return 0;
                }
                return (100 * hobbyArray[1][3]) / hobbyTotArray[1][3];

            case "Computer Science":
                if (majorTotArray[1][0] == 0) {
                    return 0;
                }
                return (100 * majorArray[1][0]) / majorTotArray[1][0];

            case "Other Eng":
                if (majorTotArray[1][1] == 0) {
                    return 0;
                }
                return (100 * majorArray[1][1]) / majorTotArray[1][1];

            case "Math or CMDA":
                if (majorTotArray[1][2] == 0) {
                    return 0;
                }
                return (100 * majorArray[1][2]) / majorTotArray[1][2];

            case "Other":
                if (majorTotArray[1][3] == 0) {
                    return 0;
                }
                return (100 * majorArray[1][3]) / majorTotArray[1][3];

            case "Northeast US":
                if (regionTotArray[1][0] == 0) {
                    return 0;
                }
                return (100 * regionArray[1][0]) / regionTotArray[1][0];

            case "Southeast US":
                if (regionTotArray[1][1] == 0) {
                    return 0;
                }
                return (100 * regionArray[1][1]) / regionTotArray[1][1];

            case "Other US":
                if (regionTotArray[1][2] == 0) {
                    return 0;
                }
                return (100 * regionArray[1][2]) / regionTotArray[1][2];

            case "Outside US":
                if (regionTotArray[1][3] == 0) {
                    return 0;
                }
                return (100 * regionArray[1][3]) / regionTotArray[1][3];

            default:
                throw new IllegalArgumentException();
        }
    }
}
