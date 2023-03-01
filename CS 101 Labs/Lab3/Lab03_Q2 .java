/**
 * Lab03_Q2
 */
import java.util.Scanner;

 public class Lab03_Q2 {

    public static void main(String[] args) {
        System.out.print("Enter the year to be evaluated:");
        Scanner scan = new Scanner(System.in);
        int enteredYear = scan.nextInt();
        int century = (int)(Math.floor((enteredYear * 1.0)/100.00)+1);
        
        if (enteredYear >= 900 && enteredYear <= 1899){
            if (enteredYear % 4 == 0 && enteredYear % 100 != 0){ 
                System.out.println("The year " + enteredYear + " is in the "+century+  "th century and is a leap year.");
            }  
            else if (enteredYear % 4 == 0 && enteredYear % 100 == 0){
                System.out.println("The year " + enteredYear + " is in the "+(century-1)+  "th century and is a leap year.");
            }  
            else{
                System.out.println("The year " + enteredYear + " is in the "+(century)+  "th century and is not a leap year.");
            }
        }
        else if (enteredYear%100 == 0){
            if (enteredYear%4 ==0){
                System.out.println("The year " + enteredYear + " is in the " + (century-1) + "th century and is a leap year.");
            }
            else{
                System.out.println("The year " + enteredYear + " is in the " + (century-1) + "th century and is not a leap year.");
            }
        }
        else if (century % 10 == 1){
            if (enteredYear % 4 == 0 && enteredYear % 100 != 0){
                System.out.println("The year " + enteredYear + " is in the " + century + "st century and is a leap year.");
            }
            else if (enteredYear % 4 == 0 && enteredYear % 400 == 0){
                System.out.println("The year " + enteredYear + " is in the " + century + "st century and is a leap year.");
            }
            else {
                System.out.println("The year " + enteredYear + " is in the " + century + "st century and is not a leap year.");
            }
        }
        else if (century % 10 == 2){
            if (enteredYear % 4 == 0 && enteredYear % 100 != 0){
                System.out.println("The year " + enteredYear + " is in the " + century + "nd century and is a leap year.");
            }
            else if (enteredYear % 4 == 0 && enteredYear % 400 == 0){
                System.out.println("The year " + enteredYear + " is in the " + century + "nd century and is a leap year.");
            }
            else{
                System.out.println("The year " + enteredYear + " is in the " + century + "nd century and is not a leap year.");
            }
        }
        else if (century % 10 == 3){
            if (enteredYear % 4 == 0 && enteredYear % 100 != 0){
                System.out.println("The year " + enteredYear + " is in the " + century +"rd century and is a leap year.");
            }
            else if (enteredYear % 4 == 0 && enteredYear % 400 == 0){
                System.out.println("The year " + enteredYear + " is in the " + century +"rd century and is a leap year.");
            }
            else {
                System.out.println("The year " + enteredYear + " is in the " + century +"rd century and is not a leap year.");
            }
        }
        else if  (century % 10 != 1 || century % 10 != 2 ||century % 10 != 3){
            if (enteredYear % 4 == 0 && enteredYear % 100 != 0){
                System.out.println("The year " + enteredYear + " is in the " + century+"th century and is a leap year.");
            }
            else if (enteredYear % 4 == 0 && enteredYear % 400 == 0){
                System.out.println("The year " + enteredYear + " is in the " + century+"th century and is a leap year.");
            }
            else{
                System.out.println("The year " + enteredYear + " is in the " + century+"th century and is not a leap year.");
            }
        }
    scan.close();
    }
}