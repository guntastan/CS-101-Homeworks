/**
 * Student Name = Gün Taştan
 * Sudent ID = 22101850
 * 
 * Lab01_Q3
 */
public class Lab01_Q3 {

    public static void main(String[] args) {
        //Declaration of constants(immutable values) 
        final long AREA_OF_EARTH = 510072000 ; //in terms of km^2
        final double AREA_OF_TURKEY = AREA_OF_EARTH * ((0.1536)/100) ; // in terms of km^2 as well
        
        //Declaration of variables (all areas will change due to climate change. LOL)
        double total_area_of_water_earth = AREA_OF_EARTH * ((70.8)/100);
        double total_are_of_water_turkey = AREA_OF_TURKEY * ((1.3)/100);
        double turkey_dry_land = AREA_OF_TURKEY - total_are_of_water_turkey;
        double earth_dry_land = (AREA_OF_EARTH - total_area_of_water_earth);
        
        //Printing out the statements
        System.out.println("Earth has "+ Math.round(earth_dry_land) + " km2 dry land and "
        + Math.round(total_area_of_water_earth) +" km2 water." );
        System.out.println("Turkey has "+  Math.round(turkey_dry_land) + " km2 dry land and "
        + Math.round(total_are_of_water_turkey) + " km2 water.");
        System.out.println("Turkey has " + (turkey_dry_land*100)/earth_dry_land+
        " percent of the Earth's dry land.");
        System.out.println("Turkey has "+ ((total_are_of_water_turkey)*100)/(total_area_of_water_earth)+ 
        " percent of Earth's water." );
    }
}