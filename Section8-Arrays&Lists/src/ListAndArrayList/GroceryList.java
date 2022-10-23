package ListAndArrayList;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
        System.out.println("You have added " + item + " in your grocery list.");
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " item(s) in your grocery list.");
        for (int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(theItem);
        System.out.println("Grocery item " + (position+1) + " has been removed.");
    }

    public String findItem(String searchItem) {
        boolean exists = groceryList.contains(searchItem);
        if (exists) {
            return groceryList.get(groceryList.indexOf(searchItem));
        }
        return null;
    }
}
