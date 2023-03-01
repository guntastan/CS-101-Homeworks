 /**
 * Lab02_Q3
 */
import java.util.Scanner;

 public class Lab02_Q3 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the title:");
        String input = scan.nextLine();

        System.out.println("--------------------------------------");
        System.out.println("Number of characters:" + input.length());
        System.out.println("All uppercase:" + input.toUpperCase());
        System.out.println("Remove leading and trailing blank characters:" + input.strip());
        System.out.println("Character at index position 5:" + input.charAt(5));
        System.out.println("Title from 3rd character to 8th character (not included):"+ input.substring(3,7));
        System.out.println("First occurence of character 'a':" + input.indexOf("a"));
        System.out.println("Last occurence of character 'a':" + input.lastIndexOf("a"));
        System.out.println("");
        System.out.println("");
        System.out.println("***************REVISION**************");
        
        String new_version = "War and Peace" ;
        String firstWord = new_version.split(" ")[0];
        String secondWord = new_version.split(" ")[1];
        String thirdWord = new_version.split(" ")[2];

        
        String lastletter = thirdWord.substring(thirdWord.length() - 1);
        String newWord = thirdWord.substring(0,4) + lastletter.toUpperCase();

        String last_result = newWord + " " + secondWord + " " +firstWord;

        System.out.println("Wanted version is : " + last_result);


        scan.close();
    }
}