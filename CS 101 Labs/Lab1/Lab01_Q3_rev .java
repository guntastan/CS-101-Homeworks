/**
 * Student Name = Gün Taştan
 * Student ID = 22101850
 * Lab01_Q3_rev
 */
public class Lab01_Q3_rev {

    public static void main(String[] args) {
        
       
         //Declaration of constants (immutable)
         final int AREA_OF_EARTH = 510072000 ; //in terms of km^2
         final double AREA_OF_TURKEY = AREA_OF_EARTH * ((0.1536)/100) ; // in terms of km^2 as well
         
         //Declaration of variables
         double total_area_of_water_earth = AREA_OF_EARTH * ((70.8)/100);
         double total_are_of_water_turkey = AREA_OF_TURKEY * ((1.3)/100);
         double total_area_of_dry_land_turkey = AREA_OF_TURKEY * (98.7/100);

         //Printing out the statements
         System.out.println("Turkey has " +  (((total_area_of_dry_land_turkey/AREA_OF_EARTH)*100)) + " percent dry land of earths total area.");
         System.out.println("Turkey has " + (((total_are_of_water_turkey)*100)/AREA_OF_EARTH + " percent dry land of total area of earth."));
        
        }
}