/**
 * 
 */
package prj5;

import java.io.File;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Group 54
 * @version 2016.04.16
 * Creates a list of songs
 *
 */
public class SongList {

    /**
     * Creates a new linked list
     */
    private LinkedList<Song> list;
    /**
     * Creates a new Comparator
     */
    private StringComparator comp;

    /**
     * Creates a new SongList with a specified string file
     * @param songs The specified file
     */
    public SongList(String songs) {
        comp = new StringComparator();
        Scanner scanner;
        try {
            scanner = new Scanner(new File(songs));
            list = new LinkedList<Song>();


            scanner.nextLine();
            
            while (scanner.hasNextLine()) {
                String[] str = scanner.nextLine().split(",");
                Song song = new Song(str[1], str[0], str[3], str[2]);
                list.add(song);
            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Returns the Linked List
     * @return the list
     */
    public LinkedList<Song> getList() {
        return list;
    }

    /**
     * Sorts the songs by the artist's name
     */
    public void sortByArtistName() {
        for (int i = 0; i < list.size(); i++) {
            Song song = list.get(i);
            int index = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (comp.compare(song.getArtistName(),
                        list.get(j).getArtistName()) > 0) {
                    song = list.get(j);
                    index = j;
                }
            }

            list.remove(index);
            list.add(i, song);
        }
    }
    
    /**
     * Sorts the songs by their titles
     */
    public void sortBySongTitle()
    {
        for (int i = 0; i < list.size(); i++) {
            Song song = list.get(i);
            int index = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (comp.compare(song.getSongTitle(),
                        list.get(j).getSongTitle()) > 0) {
                    song = list.get(j);
                    index = j;
                }
            }

            list.remove(index);
            list.add(i, song);
        }
    }
    
    /**
     * Sorts the songs by their release years
     */
    public void sortByReleaseYear()
    {
        for (int i = 0; i < list.size(); i++) {
            Song song = list.get(i);
            int index = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (comp.compare(song.getDate(),
                        list.get(j).getDate()) > 0) {
                    song = list.get(j);
                    index = j;
                }
            }

            list.remove(index);
            list.add(i, song);
        }
    }
    
    /**
     * Sorts the songs by their genre
     */
    public void sortByGenre()
    {
        for (int i = 0; i < list.size(); i++) {
            Song song = list.get(i);
            int index = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (comp.compare(song.getGenre(),
                        list.get(j).getGenre()) > 0) {
                    song = list.get(j);
                    index = j;
                }
            }

            list.remove(index);
            list.add(i, song);
        }
    }

    /**
     * 
     * @author Group 54
     * @version 2016.04.16
     * Compares Strings
     *
     */
    private class StringComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }
}
