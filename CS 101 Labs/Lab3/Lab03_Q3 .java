/**
 * Lab03_Q3
 */
import java.util.Scanner;

 public class Lab03_Q3 {

    public static void main(String[] args) {
        
        String initialPin = "1234";
        double currentBalance = 1000;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        String enteredPin = scan.nextLine();
                
        if (initialPin.equals(enteredPin))
        {
            System.out.println("1- Withdraw money");
            System.out.println("2- Open a new account");
            System.out.println("3- Change PIN");
            System.out.print("Select an operation: ");
            int selectedOption = scan.nextInt();

            if (selectedOption == 1 ){
                System.out.print("Enter the amount to withdraw: ");
                double wantedMoney = scan.nextDouble();
                if (currentBalance >= wantedMoney){
                    System.out.println("Your new balance is " + (currentBalance-wantedMoney) + " TRY. Bye!");
                    currentBalance = currentBalance-wantedMoney ;
                }
                else {
                    System.out.println("Invalid operation. Bye !");
                }
            }
            else if (selectedOption == 2){
                System.out.println("1- TRY");
                System.out.println("2- USD");
                System.out.print("Select currency type: ");
                int currencyOption = scan.nextInt();
                if (currencyOption == 1 ){
                    System.out.println("Your new TRY account is now opened! Bye!");
                }
                else if (currencyOption == 2){
                    System.out.println("Your new USD account is now opened! Bye!");
                }

            }
            else if (selectedOption == 3){
                System.out.print("Enter your new PIN: ");
                String newPin = scan.next();
                char charAtOne = newPin.charAt(0);
                char charAtTwo = newPin.charAt(3);
                String valueOne = Character.toString(charAtOne);
                String valueTwo = Character.toString(charAtTwo); 
                String printedNewPin = valueOne + "**" + valueTwo ;
                System.out.println("Your PIN is changed to " + printedNewPin + ". Bye!");
                initialPin = new String (newPin);
                // System.out.println(initialPin);   (in order to prove that inital pin has changed)
            }
        }
        else {
            System.out.println("Invalid PIN! Bye!");
        }
    scan.close();
    }
}