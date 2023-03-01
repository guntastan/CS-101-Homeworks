import java.util.ArrayList;
import java.util.Collections;

/**
 * Playlist
 */
public class Playlist {

    private String name;
    private String creator;
    private String genre;
    private ArrayList<Song> songs;    

    public Playlist (){

    }
    public Playlist (String aName, String aCreator, String aGenre, ArrayList<Song> aSongs){
        this.name = aName;
        this.creator = aCreator;
        this.genre = aGenre;
        this.songs = aSongs;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public ArrayList<Song> getSongs() {
        return this.songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }
    public boolean songExists(Song songInList){
        if (songs.contains(songInList)){
            return true;
        }
        else{
            return false;
        }
    }
    public void addSong(Song newSong){
        if (songs.contains(newSong)){
            System.out.println(newSong.getTitle() + " is already in playlist " + this.getName());
        }
        else{
            songs.add(newSong);
        }
    }
    public void removeSong(int index){
        songs.remove(index);
    }
    public void sortByDurationDesc(){
        Collections.sort(songs);
    }
    public String toString(){
        return "*************************************************\n" + "Playlist Name: " + this.getName()+
        "\n" + "Creator Name: " + this.getCreator() + "\n" + "Genre: " + this.getGenre() + "\n--------------------------------------------------------"
        + "\n" +  this.getSongs() + "\n--------------------------------------------------------\n" ;
    }
}