/**
 * User
 */
import java.util.Scanner;
public class User {
    Scanner scan = new Scanner(System.in);

    private static int count=0;
    private int ID;
    private String name;
    private int age;
    private String orders;
    private int numberOfOrders=0;
    private String eatenFoods;
    private String allergicIngredient;
    public Food allergicFood;
    
    public Food getAllergicFood(){
        return this.allergicFood;
    }
    public boolean setAllergicFood(Food anAllergicFood){
        if (anAllergicFood.doesContain(this.allergicIngredient)){
            this.allergicFood = anAllergicFood;
            return true;

        }
        else{
            System.out.println(anAllergicFood.getName() + " doesnt contain " + allergicIngredient + ". " + this.name + " is not allergic to " + anAllergicFood.getName());
            return false;
        }
    }

    public String getallergicIngredient(){
        return this.allergicIngredient;
    }
    public void setAllergicIngredient(String anallergicIngredient){
        this.allergicIngredient = anallergicIngredient;
    }

    public int getCount(){
        return count;
    }
    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOrders() {
        return this.orders;
    }

    public void setOrders(String orders) {
        this.orders = orders;
    }

    public int getNumberOfOrders() {
        return this.numberOfOrders;
    }

    public void setNumberOfOrders(int numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    }

    public String getEatenFoods() {
        return this.eatenFoods;
    }

    public void setEatenFoods(String eatenFoods) {
        this.eatenFoods = this.eatenFoods + "-"+ eatenFoods;
    }

    public User(String aName, int aAge){        
        this.name = aName;
        this.age = aAge;
        this.numberOfOrders = 0;  
        this.ID = count;      
        addUser();              
    }
    public void addUser(){
        count++;
    }
    public boolean equals(User user){
        if (this.ID == user.getID() && this.name.equals(user.getName()) && this.age == user.getAge()){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean didEat(Food food) {
        if (this.getEatenFoods().contains(food.getName())){
            return true;
        }
        else{
            return false;
        }
    }
    public String pickOrderByIndex(int index) {
        int minusCounter = 1;
        int counter = 0;
        int limiter = 0;
        while(true){ 
            counter++;
            if (counter < orders.length()){
                return "Order you have called does not exist!!!";
                
            }
            if (orders.charAt(counter) == '-') {
                minusCounter++;
                if (minusCounter > index){ 
                    return orders.substring(limiter+1, counter);
                }
                limiter = counter;                
            }
        }
    }
    public void addNewOrder(Order order) {
        if (orders != null){
            this.orders += "-" ;
        }
        this.orders = this.orders+ order.getID();
        this.numberOfOrders++;
        this.setEatenFoods(order.getOrderedFoodName());
        if (order.getOrderedFood().equals((Food)allergicFood)){            
            System.out.print(this.name + " is allergic to " + allergicFood.getName()+". Do you want to continue ordering? y/n");
            String question = scan.next();
            if (question.equals("y")){
                System.out.println("Proceeding with the order...and CALLING THE AMBULANCE!");                
            }
            else{
                order.cancelOrder();
            }
        }
        
    }
    public String toString() {
        return "User ID: " + this.getID() + ", User Name: " + this.getName() + ", Age: " + this.getAge() + "\n";
    }    
}