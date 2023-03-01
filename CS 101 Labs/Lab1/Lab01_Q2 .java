/**
 * Student Name = Gün Taştan
 * Student ID = 22101850
 * Lab01_Q2
 */
public class Lab01_Q2 {

    public static void main(String[] args) {
        
        //Stating the variables which contain values of expressions
        double first_expression = (32.2 - (1.7/2.2))/ ((1.5-7.3)* (4.3+2.4));
        double second_expression = ((73.5*16.4)- Math.pow(3,6))/(34+ Math.pow(2,5));
        double third_expression = Math.pow((1.2+0.8), -1.0/3); //Since expressions like 1/3 is interpreted as 0 due to integer division, I had to do my operations in float values.
        //Printing the expressions
        System.out.println("Result of expression 1 is: " + first_expression);
        System.out.println("Result of expression 2 is: " + second_expression);
        System.out.println("Result of expression 3 is: "+ third_expression);
    }
}