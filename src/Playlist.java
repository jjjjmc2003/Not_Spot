import java.util.ArrayList;
import java.util.List; //Importing Lists here gonna need them to store songs

public class Playlist { //class setup
    private  String name; //initializing name and List songs
    private  List<Song> songs;

    public Playlist (String name){ // I added a constructor here and used polymorphism by extending the other subclass and inheriting
       this.name = name;          // the constructor using super() so that it made it easier to test. I ran into a nightmare testing because
        this.songs = new ArrayList<>(); // I originally made a constructor for each subclass of Playlist, so I made a separate constructor for
                                        //Pop Rock and Jazz Playlist. Which led to a headache trying to run,so I decided to add this and use
                                        // polymorphism
    }

    public void addSong(Song song) {
        songs.add(song); //add song method
        }

    public void removeSong(Song song) {
        songs.remove(song); //remove song method

    }

    //Play Songs Method
    public void playAllSongs() { //for loop to play the songs in a playlist, essentially loops over the List songs and prints them
        for (Song song : songs) {
            System.out.println("Now Playing: " + song.getTitle()); // this getter is from Song class and this tells you what is playing
        }                                                          // otherwise known as our !Shuffle
    }

    public String getName() {
        return name;  //to print out name
    }
}
