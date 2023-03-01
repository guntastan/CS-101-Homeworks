/**
 * thursday
 */
import java.util.Scanner;

 public class Lab06_Q1_rev {

    public static int countDigits(int x){
        int counter = 0;        
        while(x!=0){
            x =x/10;
            counter ++;
        }
        return counter;
    }
    public static int power(int x,int y){        
        int z = 1;
        int t = x;
        while (z < y){
            t = t*x;
            z++;
        }
        return t;
    }
    public static boolean isDisarium(int x){
        int b = countDigits(x);
        final int finalx = x;
        int checked = 0;
        for (int a = 1; a <= b; b-- ){
            checked = checked + power(x%10,b);
            x = x/10;
        }
        if (checked == finalx ){
            return true;
        }
        return false; 
    }

    public static void main(String[] args) {
        System.out.print("Enter the number to be evaluated: ");
        Scanner scan = new Scanner (System.in);
        int input = scan.nextInt();
        if (isDisarium(input))
        {
            System.out.println(input + " is a Disarium Number.");
        }
        else{
            System.out.println(input + " is not a Disarium NUmber");
        }
        scan.close();
    }
}