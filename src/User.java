import java.util.ArrayList;
import java.util.List;

public class User{
    private String username;
    private List<Playlist> playlists;

    public User(String username) {
        this.username = username;
        this.playlists = new ArrayList<>();

    }

    public String getUsername(){
        return username;
    }

    public void createPlaylist(String name, String type) {
        Playlist playlist = null;
        if (type == "Pop") {
            playlist = new Playlist(name);
        } else if (type == "Rock") {
            playlist = new Playlist(name);
        } else if (type == "Jazz") {
            playlist = new Playlist(name);
        }
        playlists.add(playlist);
        System.out.println("New " + type + " Playlist Titled: " + name);
    }

    public void deletePlaylist(Playlist playlist) {
        playlists.remove(playlist);
            System.out.println("Deleted playlist: " + playlist.getName());

    }

    public void addSongToPlaylist(Playlist playlist, Song song, String type) {
        if (type == "Pop") {
            playlist.addSong(song);
        } else if (type == "Rock") {
            playlist.addSong(song);
        } else if (type == "Jazz") {
            playlist.addSong(song);
        }
        System.out.println("Song successful added: " + song.getTitle() + "\nArtist: " + song.getArtist() + "\nDuration (mins): " + song.getDuration());
    }

    public void removeSongfromPlaylist(Playlist playlist, Song song, String type) {
        if (type == "Pop") {
            playlist.removeSong(song);
        } else if (type == "Rock") {
            playlist.removeSong(song);
        } else if (type == "Jazz") {
            playlist.removeSong(song);
        }
        System.out.println("Song sucessfully removed: " + song.getTitle());
    }
}
