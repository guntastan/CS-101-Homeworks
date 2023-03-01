/**
 * Lab03_Q3
 */
import java.util.Scanner;

 public class Lab03_Q3_rev {

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
            System.out.println("3- Make money transfer");
            System.out.println("4- Change PIN");
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
                    System.out.println("Invalid operation. Bye!");
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
                System.out.print("Enter the account number: ");
                String account_number = scan.next();
                             
                System.out.print("Enter the amount of transfer: ");
                double transferred_amount = scan.nextDouble();
                if (account_number.length() ==6 && transferred_amount <= currentBalance){
                    System.out.println("Money transfer successful. Your new balance is " + (currentBalance-transferred_amount) + ". Bye !");
                    currentBalance = currentBalance-transferred_amount ;
                }    
                else{
                        System.out.println("Invalid transfer opertaion! Bye!");
                }
            }
                                
            
            
            else if (selectedOption == 4){
                System.out.print("Enter your new PIN: ");
                String new_pin = scan.next();
                if (new_pin.equals(initialPin) || new_pin.equals("0000")){
                    System.out.println("You entered current PIN or invalid 0000. Bye !");
                }
                else{
                    char charAtOne = new_pin.charAt(0);
                    char charAtTwo = new_pin.charAt(3);
                    String valueOne = Character.toString(charAtOne);
                    String valueTwo = Character.toString(charAtTwo); 
                    String printedNewPin = valueOne + "**" + valueTwo ;
                    System.out.println("Your PIN is changed to " + printedNewPin + ". Bye!");
                    initialPin = new String (new_pin);
                    //System.out.println(initialPin);   (in order to prove that inital pin has changed)
                }
            }
        
        }
        else 
        {
            System.out.println();
        }
        
    scan.close();
    
    }
}