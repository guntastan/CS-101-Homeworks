/**
 * MusicApp
 */
import java.util.ArrayList;
import java.util.Scanner;

public class MusicApp {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 
        Scanner in = new Scanner(System.in);       
        

        ArrayList<Playlist> playlists = new ArrayList<Playlist>();
        ArrayList<String> genres = new ArrayList<String>();
        
        genres.add("Country");
        genres.add("Electronic");
        genres.add("Pop Music");
        genres.add("Rock Music");
        genres.add("Jazz");
        genres.add("Classical");
        String selectedOption;
        System.out.println("--------------------------------------------------------");
        System.out.println("Welcome to Music App! Get Ready to create your playlist!");
        System.out.println("--------------------------------------------------------");        

        do {            
            System.out.println("1 - Create a new Playlist");
            System.out.println("2 - Display the Playlist");
            System.out.println("3 - Sort the Playlist");
            System.out.println("4 - Remove song by index from the current Playlist");
            System.out.println("5 - Display all Playlists");
            System.out.println("6 - Exit");
            selectedOption = scan.nextLine();
            if (selectedOption.equals("1")){
                ArrayList<Song> songs = new ArrayList<Song>();
                Playlist playlist;
                System.out.println("How many songs do you want to add to playlist?:");
                int numberOfSongs = in.nextInt();                
                for (int i=1; i<=numberOfSongs;i++){
                    playlist = new Playlist();
                    System.out.println("Enter artist name for Song " + i+ " :");
                    String artistName = scan.nextLine();                                                                             
                    System.out.println("Enter album name for Song " + i+ " : ");
                    String albumName = scan.nextLine();
                    System.out.println("Enter song name for Song " + i + " : ");
                    String songName = scan.nextLine();
                    System.out.println("Enter song duration in seconds for Song " + i + " : ");
                    int durationOfSong = in.nextInt();
                    System.out.println("Enter the times song has been played for Song " + i + " : ");
                    int timesPlayed = in.nextInt();                                      
                    Song newsong = new Song(songName, artistName, albumName, durationOfSong, timesPlayed);                    
                    songs.add(newsong);                                   
                }
                System.out.println("Enter playlist name: ");                                  
                String playlistName = scan.nextLine();                
                System.out.print("");               
                System.out.println("Enter creator of playlist: ");
                String creatorOfPlaylist = scan.nextLine();                
                System.out.println("0-Country");
                System.out.println("1-Electronic");
                System.out.println("2-Pop Music");
                System.out.println("3-Rock Music");
                System.out.println("4-Jazz");
                System.out.println("5-Classical");
                System.out.println("Select genre of playlist :");
                int selectedGenreIndex = in.nextInt();
                playlist = new Playlist(playlistName, creatorOfPlaylist, genres.get(selectedGenreIndex), songs);                  
                playlists.add(playlist);
                System.out.println("--------------------------------------------------------");                                                        
            }
            if (selectedOption.equals("2")){
                System.out.println("Displaying the playlist: " + playlists.get(0).getName());
                System.out.println(playlists.get(0));
                System.out.println("--------------------------------------------------------");                               
            } 
            if (selectedOption.equals("3")){
                playlists.get(0).sortByDurationDesc();
                System.out.println(playlists.get(0));
            }
            if (selectedOption.equals("4")){
                System.out.println("Which song do you want to remove? (Remove by index)");
                int removalIndex = in.nextInt();
                playlists.get(0).removeSong(removalIndex);
            }
            if (selectedOption.equals("5")){
                System.out.println(playlists);
            }            
        } while (!selectedOption.equals("6")); 
        
        in.close();
        scan.close();     
    }
}