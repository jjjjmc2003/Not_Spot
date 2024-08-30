import java.util.ArrayList;
import java.util.List; //Importing Lists here gonna need them to store songs

public class Playlist { //class setup
    private  String name; //initializing name and List songs
    private  List<Song> songs = new ArrayList<>(); //

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
        return name;  //to print out name of playlists
    }
    public void setName(String name){
        this.name = name; // setter to set the name of the playlists
    }
}
