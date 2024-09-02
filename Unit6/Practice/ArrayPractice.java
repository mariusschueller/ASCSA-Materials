// Use concepts from ArraysIntro and MoreArrays

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String args[]){
        int[] numbers = {10, 3, 6, 4, 5, 1};

        System.out.print("Expected: 4 ");
        System.out.println("Returned: " + target(numbers, 5));

        System.out.print("Expected: -1 ");
        System.out.println("Returned: " + target(numbers, 20));


        // max test
        System.out.print("Expected: 10 ");
        System.out.println("Returned: " + FindMax(numbers));


        // sort test
        System.out.print("Expected: [1, 3, 4, 5, 6, 10] ");
        System.out.println("Returned: " + Arrays.toString(Sort(numbers)));
    }

    // Returns the index of the target if found
    // Otherwise return -1
    private static int target(int[] numbers, int num) {
        // Your code here

        return -1; // change this line
    }

    // Returns the max number in the array
    // Hint: Set your first max value to your first element
    private static int FindMax(int[] numbers) {
        // Your code here

        return -1; // change this line
    }


    // sort the array into ascending order
    // There are many ways to do this, first try to write/draw an algorithm
    private static int[] Sort(int[] numbers) {
        int[] ret = new int[numbers.length];
        for (int i = 0; i < numbers.length; ++i){
            ret[i] = numbers[i];
        }
        // ^ copying array contents cause arrays are stored differently in memory

        // Your code here

        return ret;

    }
}