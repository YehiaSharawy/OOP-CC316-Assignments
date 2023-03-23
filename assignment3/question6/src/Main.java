public class Main {
    public static void main(String[] args) {
        GroceryList cart = new GroceryList();
        GroceryItemOrder One =  new GroceryItemOrder("Cheese", 9, 10.5);
        GroceryItemOrder Two = new GroceryItemOrder("Yogurt", 2, 3);
        GroceryItemOrder Three = new GroceryItemOrder("Meat", 6, 6);

        try {
            cart.add(One);
            cart.add(Two);
            cart.add(Three);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Total Cost: " + cart.getTotalCost());
    }
}

// Write a class named GroceryList that represents a person’s list of items to buy from the market,
// and another class named GroceryItemOrder that represents a request to purchase a particular item in a given quantity
// (example: four boxes of cookies).

// The GroceryList class has a list of grocery item orders and keeps track of its size (number of items in the list so far).
// Assume that a grocery list will have no more than 10 items.

// The GroceryItemOrder class should store an item name, quantity and a price per unit