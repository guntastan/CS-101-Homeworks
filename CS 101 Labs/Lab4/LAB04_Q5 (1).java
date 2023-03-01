/**
 * Lab04_Q4
 */
import java.util.Scanner;

 public class LAB04_Q5 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int input = scan.nextInt();        
        int a = 1;     
        
        while (1 <= input){
            while (a <= input){
                System.out.print(input);
                a++;
            }
            a=1;
            System.out.println("");
            input--;
        }
        scan.close();
    }
}