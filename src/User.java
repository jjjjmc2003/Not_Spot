import java.util.ArrayList;
import java.util.List;

public class User{
    private String username; //initializing username
    private List<Playlist> playlists = new ArrayList<>(); //initializing Lists

    public void setusername(String username){ //setting username
        this.username = username;
    }

    public String getUsername(){
        return username; //getter username
    }

    public Playlist createPlaylist(String name, String type) { //create playlist method
        Playlist playlist = null;
        if (type == "Pop") { //if else statements to set the type to be specific
            playlist = new PopPlaylist();
            playlist.setName(name); //setting name of playlists
        } else if (type == "Rock") {
            playlist = new RockPlaylist();
            playlist.setName(name);
        } else if (type == "Jazz") {
            playlist = new JazzPlaylist();
            playlist.setName(name);
        }
        playlists.add(playlist);
        System.out.println("New " + type + " Playlist Titled: " + name); //this adds playlists
        return playlist;
    }

    public void deletePlaylist(Playlist playlist) {
        playlists.remove(playlist);
            System.out.println("Deleted playlist: " + playlist.getName()); //this deletes playlist using remove

    }

    public void addSongToPlaylist(Playlist playlist, Song song, String type) {
        if (type == "Pop") {
            playlist.addSong(song);
        } else if (type == "Rock") { //adding songs to playlist here keep types of Rock Pop Jazz (I realize how
            playlist.addSong(song);  //unnecesarry this is here as I am typing this but will keep it solely
        } else if (type == "Jazz") { // because it is too late to fix)
            playlist.addSong(song);
        }
        System.out.println("Song successful added: " + song.getTitle() + "\nArtist: " + song.getArtist() + "\nDuration (mins): " + song.getDuration());
    }

    public void removeSongfromPlaylist(Playlist playlist, Song song, String type) {
        if (type == "Pop") {
            playlist.removeSong(song);
        } else if (type == "Rock") { //removing songs from the playlist, keeping up with types here as well
            playlist.removeSong(song); //solely for continuity
        } else if (type == "Jazz") {
            playlist.removeSong(song);
        }
        System.out.println("Song sucessfully removed: " + song.getTitle());
    }
}
