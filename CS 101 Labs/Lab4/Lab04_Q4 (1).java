/**
 * Lab04_Q4
 */
import java.util.Scanner;

 public class Lab04_Q4 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int input = scan.nextInt();
        int startPoint = 1;
        int asterisk = 0;
        String printedLast = "";

        while (startPoint <= input){
             while (asterisk < input){
                 printedLast = printedLast + "*";
                 System.out.println(printedLast);
                 asterisk++;
             }
            startPoint++;
        }        
        scan.close();
    }
}