import java.util.Scanner;

public class Lab03_Q1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms: ");
        double weight = scan.nextDouble();
        System.out.print("Enter your height in meters   : ");
        double height = scan.nextDouble();

        //BMI
        double bmi_value = weight/(height*height);
        
        if (bmi_value >= 30){
            System.out.printf("Your BMI is %.2f and in the category of obese.\n" , bmi_value);
        }
        else if (bmi_value >=25){
            System.out.printf("Your BMI is %.2f and in the category of overweight.\n" , bmi_value);
        }
        else if (bmi_value >= 18.5){
            System.out.printf("Your BMI is %.2f and in the category of healthy.\n" , bmi_value);
        }
        else {
            System.out.printf("Your BMI is %.2f and in the category of underweight.\n" , bmi_value);
        }
        
        scan.close();
    }
}