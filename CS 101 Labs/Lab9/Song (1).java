/**
 * Song
 */
public class Song implements Comparable<Song>{

    private String title;
    private String artist;
    private String album;
    private int duration;
    private int timesPlayed;    

    public Song(String atitle, String anArtist,String anAlbum, int aDuration, int atimesPlayed){
        this.title = atitle;
        this.artist = anArtist;
        this.album = anAlbum;
        this.duration = aDuration;
        this.timesPlayed = atimesPlayed;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return this.album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTimesPlayed() {
        return this.timesPlayed;
    }

    public void setTimesPlayed(int timesPlayed) {
        this.timesPlayed = timesPlayed;
    }
    public int compareTo(Song comparedSong){
        if (this.duration == comparedSong.getDuration()){
            return 0;
        }
        else if (this.duration > comparedSong.getDuration()){
            return -1;
        }
        else{
            return 1;
        }
    }
    public String toString(){
        return "\n--------------------------------------------------------\n" + "Song Name: " + this.getTitle() + "\n"
        + "Artist Name: " + this.getArtist() + "\n" + "Album Name: " + this.getAlbum() + "\n" + "Duration: " + this.getDuration()/60 +":" + 
        this.getDuration()%60 +"\n" + "Times Played: " + this.getTimesPlayed();
        
    }

}

