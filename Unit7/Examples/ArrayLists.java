import java.util.ArrayList; // Import to import

public class ArrayLists {

    public static void main(String args[]){
        /*
        An ArrayList in Java is a resizable array implementation of the List interface. Unlike
        standard arrays, which have a fixed length, an ArrayList can dynamically resize itself when
        elements are added or removed. This makes ArrayList a versatile data structure when you
        need a collection that can grow or shrink in size.
         */

        // Creation
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Displaying the ArrayList
        System.out.println(fruits);


        // Getting an item
        String fruit = fruits.get(0);
        System.out.println(fruit);

        // Setting an item
        fruits.set(1, "Pineapple");
        System.out.println(fruits);

        // Removing items
        fruits.remove(0);  // Removes "Apple"
        fruits.remove("Orange");  // Removes "Orange"

        // Get Size
        int size = fruits.size();  // 2
        System.out.println(size);

        boolean empty = fruits.isEmpty();  // false
        System.out.println(empty);

        // Empty list
        fruits.clear();  // List is now empty
        System.out.println(size);

        boolean hasApple = fruits.contains("Apple");
        System.out.println(hasApple);


        // More stuff
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        for(int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        for(String element : fruits) {
            System.out.println(fruit);
        }
    }
}

// Closing questions:
// Why array lists over arrays?
// Why arrays over array lists?
