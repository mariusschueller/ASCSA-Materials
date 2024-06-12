public class IntsAndDoubles {
    public static void main(String[] args) {
        // Introduction to int expressions
        int a = 10;
        int b = 5;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Integer Expressions:");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Sum (a + b): " + sum);
        System.out.println("Difference (a - b): " + difference);
        System.out.println("Product (a * b): " + product);
        System.out.println("Quotient (a / b): " + quotient);
        System.out.println("Remainder (a % b): " + remainder);
        System.out.println();

        // Introduction to double expressions
        double x = 10.5;
        double y = 2.5;
        double dSum = x + y;
        double dDifference = x - y;
        double dProduct = x * y;
        double dQuotient = x / y;

        System.out.println("Double Expressions:");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("Sum (x + y): " + dSum);
        System.out.println("Difference (x - y): " + dDifference);
        System.out.println("Product (x * y): " + dProduct);
        System.out.println("Quotient (x / y): " + dQuotient);
        System.out.println();

        // Mixing int and double expressions
        double mixedSum = a + x;
        double mixedProduct = b * y;
        double mixedQuotient = a / y;

        System.out.println("Mixed Expressions (int and double):");
        System.out.println("a + x: " + mixedSum);
        System.out.println("b * y: " + mixedProduct);
        System.out.println("a / y: " + mixedQuotient);
    }
}
