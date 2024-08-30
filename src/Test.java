public class Test {
    public static void main(String[] args) {
        // Creating a user using setter I set up in User
        User user = new User();
        user.setusername("Johnnymac");
        System.out.println("Username: " + user.getUsername());


        //Creating my playlists using user
        Playlist PopPlaylist = user.createPlaylist("Pop but Not Popular", "Pop");
        Playlist JazzPlayList = user.createPlaylist("Jazz Playlist", "Jazz");
        Playlist RockPlayList = user.createPlaylist("Rock Playlist", "Rock");

        // Creating songs (I like ACDC)
        Song song1 = new Song("Thunderstruck", "ACDC", 3.5);
        Song song2 = new Song("For Those About to Rock", "ACDC", 4.0);


        // Add song to playlists they are both Rock Songs so adding them to Rock
        user.addSongToPlaylist(RockPlayList, song1, "Rock"); // Add to the first playlist (My Playlist)
        user.addSongToPlaylist(RockPlayList, song2, "Rock");

        //Delete song from playlist
        user.removeSongfromPlaylist(RockPlayList, song2, "Rock");

        //Deleting Jazz Playlist because I do not like Jazz
        user.deletePlaylist(JazzPlayList);

        // Play all songs in a playlist
        Playlist Rockplaylist = new RockPlaylist();
        Rockplaylist.playAllSongs();

    }
}
