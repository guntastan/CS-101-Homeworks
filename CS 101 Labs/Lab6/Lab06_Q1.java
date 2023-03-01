/**
 * newproject
 */
import java.util.Scanner;

 public class Lab06_Q1 {

    public static boolean isPerfectSquare(int x){
        if( x>=0){
            //What is the square root of the number
            int sqr = (int) Math.sqrt(x);

            //Now looking whether square of it is equal to the entered input
            return(sqr*sqr == x); //Which may be true
        }
        return false;//if not
    }
    public static boolean isFibonacci(int x){
        int checked1 = 5*(x*x)+4;
        int checked2 = 5*(x*x)-4;
        if (isPerfectSquare(checked1)== true || isPerfectSquare(checked2)== true){
            return true;
        }
        return false;
    }
    public static int sumOfDigits(int x){ 
        int sum = 0;
        while (x != 0){
            sum = sum + x%10;
            x = x/10;
        }
        return sum;
    }
    public static boolean isHarshad(int x){
        if (x%sumOfDigits(x)== 0){
            return true;
        }
        return false;
    }
    public static boolean isPrime(int x){
        int counter = 0;
        for (int i = 2 ; i<=x-1; i++){
            if (x%i == 0){
                counter++;                
            }
        }
        if (counter == 0){
            return true;
        }
        return false;
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
    public static int countDigits(int x){
        int counter = 0;        
        while(x!=0){
            x =x/10;
            counter ++;
        }
        return counter;
    }
    public static boolean isNarcissistic(int x){
        final int notProcessed = x;
        int sumExpo = 0;
        while (x != 0){
            sumExpo = sumExpo + power(x%10,countDigits(notProcessed));
            x = x/10;
        }
        if (notProcessed == sumExpo){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to be evaluated: ");
        int input = scan.nextInt();        
        //Fibonacci        
        if (isFibonacci(input)){
            System.out.println(input + " is a Fibonacci number.");
        }
        else{
            System.out.println(input + " is not a Fibonacci number.");
        }
        //Harshad
        if (input == 0){
            System.out.println("0 is not a Harshad NUmber.");
        }
        else if (isHarshad(input)){
            System.out.println(input + " is a Harshad number.");
        }
        else{
            System.out.println(input + " is not a Harshad number.");
        }
        //Narcissistic
        if (isNarcissistic(input)){
            System.out.println(input + " is a Narcissistic number.");
        }
        else{
            System.out.println(input + " is not a Narcissistic number.");
        }
        //Prime
        if (input == 1 || input == 0){
            System.out.println( input + " is not a Prime number.");
        }
        else if (isPrime(input)){
            System.out.println(input + " is a Prime a number");
        }
        else{
            System.out.println(input + " is not a Prime number.");
        }
        // 
        scan.close();      
    }
}