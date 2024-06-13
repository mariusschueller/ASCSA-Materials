public class VariableExtremes {
    public static void main(String[] args) {
        // Maximum and minimum values for integers
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        // Print out the maximum and minimum values
        System.out.println("Maximum integer value: " + maxInt);
        System.out.println("Minimum integer value: " + minInt);

        // Incrementing beyond the maximum value to demonstrate overflow
        System.out.println("\nIncrementing beyond maximum value:");
        System.out.println("Before increment: " + maxInt);
        int incrementedMax = maxInt + 1;
        System.out.println("After increment: " + incrementedMax);

        // Decrementing beyond the minimum value to demonstrate underflow
        System.out.println("\nDecrementing beyond minimum value:");
        System.out.println("Before decrement: " + minInt);
        int decrementedMin = minInt - 1;
        System.out.println("After decrement: " + decrementedMin);
    }
}