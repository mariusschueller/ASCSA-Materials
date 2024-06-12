public class ArithmeticOperations {
    public static void main(String[] args) {
        // Example numbers
        double num1 = 12.5;
        double num2 = 3.5;

        // Perform arithmetic operations
        double sum = num1 + num2;        // Addition
        double difference = num1 - num2; // Subtraction
        double product = num1 * num2;    // Multiplication
        double quotient = num1 / num2;   // Division
        double remainder = num1 % num2;  // Modulus

        // Display the results
        System.out.println("Results of arithmetic operations:");
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " * " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + quotient);
        System.out.println(num1 + " % " + num2 + " = " + remainder);
    }
}
