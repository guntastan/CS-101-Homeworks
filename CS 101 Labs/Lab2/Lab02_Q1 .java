/**
 * Lab02_Q1
 */
import java.util.Scanner;

 public class Lab02_Q1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the width of the rectangle : ");        
        double input_width= scan.nextDouble();
        System.out.print("Enter the height of the rectangle : ");
        double input_height = scan.nextDouble();

        double area_of_rectangle = input_width * input_height;
        double circumference_of_rectangle = 2 * (input_width + input_height);
        double diagonal_of_rectangle = Math.pow((Math.pow(input_width, 2) + Math.pow(input_height, 2)),1.0/2);
       
    

        System.out.printf("The area of the rectangle is                : %15.3f",area_of_rectangle );
        System.out.println("");
        System.out.printf("The circumference of the rectangle is       : %15.3f",circumference_of_rectangle );
        System.err.println("");
        System.out.printf("The diagonal of the rectangle is            : %15.3f",diagonal_of_rectangle );
        
        System.out.println("");
        System.out.println("");
        System.out.println("***************REVISION**************");
        System.out.print("Enter one side of equilateral triangle : ");        
        
        double side_of_triangle_equilateral = scan.nextDouble();
        double area = ((side_of_triangle_equilateral*side_of_triangle_equilateral)* Math.pow(3, 1.0/2)/(4.0));
        double circumference_triangle = 3 * side_of_triangle_equilateral;
        double height_triangle = (side_of_triangle_equilateral* Math.pow(3, 1.0/2))/2;

        System.out.printf("Area of the equilateral triangle is : %8.3f" , area );
        System.out.println("");
        System.out.printf("Circumferene of triangle is         : %8.3f" , circumference_triangle);
        System.out.println("");
        System.out.printf("Height of the given triangle is     : %8.3f \n",height_triangle);
        
        
        scan.close();
        
    }
}