import java.util.ArrayList;
import java.util.Collections;

/**
 * Playlist
 */
public class Playlist_RevThu {

    private String name;
    private String creator;
    private String genre;
    private ArrayList<Song> songs;
    private ArrayList<Song> mergedSongs;    

    public Playlist_RevThu (){

    }
    public Playlist_RevThu (String aName, String aCreator, String aGenre, ArrayList<Song> aSongs){
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
        for (int i = 0; i<songs.size(); i++){
            if (songs.get(i).equals(songInList.getAlbum())&&songs.get(i).equals(songInList.getArtist())&&songs.get(i).equals(songInList.getTitle())&&songs.get(i).equals(songInList.getDuration())){                
                return true;
            }            
        }
        return false;
        
    }
    public void addSong(Song newSong){
        if (this.songExists(newSong)){
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
    public ArrayList<Song> mergePlaylists(Playlist_RevThu playlist_RevThu,String nameMergedList,String nameCreatorMergedList,String genreMergedList){
        this.mergedSongs = playlist_RevThu.getSongs();
        this.mergedSongs.addAll(this.songs);
        return mergedSongs;
    }
}