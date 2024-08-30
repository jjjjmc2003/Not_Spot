public class Test {
    public static void main(String[] args) {
        // Create a user
        User user = new User("Johnnymac");
        System.out.println("Username: " + user.getUsername());

        // Create playlists
        Playlist RockPlayList = new Playlist("Rock Playlist");
        Playlist JazzPlayList = new Playlist("Jazz Playlist");
        user.createPlaylist("Pop but Not Popular", "Pop");
        user.createPlaylist("Jazz Playlist", "Jazz");
        user.createPlaylist("Rock Playlist", "Rock");
        // Create songs
        Song song1 = new Song("Thunderstruck", "ACDC", 3.5);
        Song song2 = new Song("For Those About to Rock", "ACDC", 4.0);

        // Add song to playlists
        user.addSongToPlaylist(RockPlayList, song1, "Rock"); // Add to the first playlist (My Playlist)
        user.addSongToPlaylist(RockPlayList, song2, "Rock");

        //Delete song from playlist
        user.removeSongfromPlaylist(RockPlayList, song2, "Rock");

        //Delete A Playlist
        user.deletePlaylist(JazzPlayList);

        // Play all songs in a playlist

        Playlist Rockplaylist = new Playlist("Rock Playlist");
        Rockplaylist.playAllSongs();

    }
}
