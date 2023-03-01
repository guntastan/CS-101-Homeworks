/**
 * Food
 */
public class Food {

    private String name;
    private String ingredients;
    private int calories;
    private String type;
    private double price;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return this.ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public int getCalories() {
        return this.calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Food(String name, double price){
        this.name = name;
        this.price = price;              
    }
    public Food(String name, String ingredients, int calories, String type, double price){
        this.name = name;
        this.ingredients = ingredients;
        this.calories = calories;
        this.type = type;
        this.price = price;
    }
    public boolean equals(Food food){
        if (this.name.equals(food.getName()) && this.ingredients.equals(food.getIngredients())){
            return true;
        }
        else{
            return false;
        }
    }
    public void addNewIngredients(String newIngredient){
        this.ingredients = this.ingredients +"," + newIngredient;
    }
    public boolean doesContain(String ingredient){
        if (this.getIngredients().contains(ingredient)){
            return true;
        }
        else{
            return false;
        }
    }
    public String toString(){
        return "***************************\n" + this.getName() + " is a " + this.getType()+
        " dish.\n" + "It includes " + this.ingredients + ".\n" + "Single portion contains "+
        this.getCalories() + " calories.\n" + "Single serving cost = " + this.getPrice();
    }    
}