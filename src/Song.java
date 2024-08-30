public class Song { //class setup
    private String title; //initializing title artist and duration
    private String artist;
    private double duration;


    public Song(String title, String artist, double duration) { //Constructor for Song ensures that every song has a name, artist, time
        this.title = title;  // this is just allowing us to enter in that information and ensuring it will stay
        this.artist = artist;
        this.duration = duration;
    }
    public String getTitle() {   //Getters for Song gets title artist and duration
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public double getDuration() {
        return duration;
    }
}
