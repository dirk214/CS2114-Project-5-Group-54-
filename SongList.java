/**
 * 
 */
package prj5;

import java.io.File;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Chris
 *
 */
public class SongList {
    private Scanner scanner;
    private LinkedList<Song> list;
    private StringComparator comp;

    public SongList(String songs) {
        comp = new StringComparator();
        try {
            scanner = new Scanner(new File(songs));
        }

        catch (Exception e) {
            e.printStackTrace();
        }
        list = new LinkedList<Song>();

        if (scanner.hasNextLine())
        {
            scanner.nextLine();
        }
        
        while (scanner.hasNextLine()) {
            String[] str = scanner.nextLine().split(",");
            Song song = new Song(str[1], str[0], str[3], str[2]);
            list.add(song);
        }
    }

    public LinkedList<Song> getList() {
        return list;
    }

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
    
    public void sortBySongTitle()
    {
        
    }
    
    public void sortByReleaseYear()
    {
        
    }
    
    public void sortByGenre()
    {
        
    }

    private class StringComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }
}
