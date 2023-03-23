public class GroceryItemOrder {
    String itemName;
    int quantity;
    double pricePerUnit;

    public GroceryItemOrder(String itemName,int quantity,double pricePerUnit){
        this.itemName=itemName;
        this.quantity=quantity;
        this.pricePerUnit=pricePerUnit;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public double getCost(){
        return quantity*pricePerUnit;
    }
}
