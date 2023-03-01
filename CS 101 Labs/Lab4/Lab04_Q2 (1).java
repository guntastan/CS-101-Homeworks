/**
 * Lab04_Q2
 */
import java.util.Scanner;

 public class Lab04_Q2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input the string: ");
        String input = scan.nextLine();        
        int lengthInput = input.length();
        int indexIn = lengthInput-1;
        String rev = "";

        while (indexIn >= 0){
            rev = rev + input.charAt(indexIn);
            indexIn --;
        }
        if (rev.equals(input)){
            System.out.println("It is a palindrome.");
        }
        else{
            System.out.println("It is not a palindrome.");
        }
        scan.close();      
    }
    
}