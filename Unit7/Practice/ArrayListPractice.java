import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(3);
        numbers.add(6);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);

        System.out.print("Expected: 4 ");
        System.out.println("Returned: " + target(numbers, 5));

        System.out.print("Expected: -1 ");
        System.out.println("Returned: " + target(numbers, 20));

        // max test
        System.out.print("Expected: 10 ");
        System.out.println("Returned: " + FindMax(numbers));

        // sort test
        System.out.print("Expected: [1, 3, 4, 5, 6, 10] ");
        System.out.println("Returned: " + Sort(numbers));
    }

    // Returns the index of the target if found
    // Otherwise return -1
    private static int target(ArrayList<Integer> numbers, int num) {
        // Your code here

        return -1; // change this line
    }

    // Returns the max number in the ArrayList
    // Hint: Set your first max value to your first element
    private static int FindMax(ArrayList<Integer> numbers) {
        // Your code here

        return -1; // change this line
    }

    // Sorts the ArrayList into ascending order
    private static ArrayList<Integer> Sort(ArrayList<Integer> numbers) {
        ArrayList<Integer> ret = new ArrayList<>(numbers);
        // ^ copying ArrayList contents cause ArrayLists are stored differently in memory

        // Your code here

        return ret;
    }
}
