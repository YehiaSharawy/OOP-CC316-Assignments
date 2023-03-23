public class GroceryList {
    GroceryItemOrder[] list = new GroceryItemOrder[10];
    private int itemCount=0;
    public GroceryList(){}
    public void add(GroceryItemOrder item) throws Exception{
        if(itemCount==10)
            throw new Exception("List is FULL!!");
        list[++itemCount] = item;
    }
    public double getTotalCost(){
        double total=0;
        for(int i=0;i<list.length;i++){
            if(list[i]!=null)
                total+= list[i].getCost();
        }
        return total;
    }
}
