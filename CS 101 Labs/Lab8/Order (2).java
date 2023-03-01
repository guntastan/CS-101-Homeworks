/**
 * Order
 */
public class Order {

    private static int count= 0;
    private int ID;
    private Food orderedFood;
    private double portion;
    private double totalPrice;
    

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Object getOrderedFood() {
        return this.orderedFood;
    }

    public void setOrderedFood(Food orderedFood) {
        this.orderedFood = orderedFood;
    }

    public double getPortion() {
        return this.portion;
    }

    public void setPortion(double portion) {
        this.portion = portion;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }
    public String getOrderedFoodName(){
        return this.orderedFood.getName();
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Order(double aportion, String aname, double  aprice){
        Food food = new Food(aname,aprice);
        this.orderedFood = food;
        this.portion = aportion;        
        this.ID = count;
        this.totalPrice = 0.0;        
        addOrder();
    }
    public Order(double aportion, Food anorderedFood){        
        this.ID = count;
        this.orderedFood = anorderedFood;
        this.portion = aportion;
        this.totalPrice = 0.0;        
        addOrder();
    }
    public void addOrder(){
        count++;
                
    }
    public boolean equals(Order order){
        if (this.ID == order.getID()){
            return true;
        }
        else{
            return false;
        }
    }
    public void checkout(){
        this.totalPrice = this.portion* ((Food)orderedFood).getPrice();
    }
    public void increasePortion(int extraPortion){
        this.portion += extraPortion;
    }
    public String toString(){
        String heading = "***************************";
        if (totalPrice ==0.0){
            heading = heading + "\nWarning: this order is incomplete";
        }
        return "\n" + heading + "\n" + "Details for Order "+ this.getID() + ":\n"+ "      " +
        this.orderedFood.getName() + "(x" + this.portion+")\n" + "      TOTAL: " + this.totalPrice;   
    } 
    public void cancelOrder(){
        this.totalPrice = 0.0;
        this.portion = 0.0;
        this.ID = -1;
    }   
}