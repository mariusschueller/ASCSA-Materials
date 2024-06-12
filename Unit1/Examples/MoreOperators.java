public class MoreOperators {
    public static void main(String[] args) {
        // Initializing variables
        int a = 10;
        int b = 5;

        // Compound Assignment Operators
        System.out.println("Initial value of a: " + a); // 10
        a += b; // Equivalent to a = a + b;
        System.out.println("After a += b: " + a); // 15

        a -= b; // Equivalent to a = a - b;
        System.out.println("After a -= b: " + a); // 10

        a *= b; // Equivalent to a = a * b;
        System.out.println("After a *= b: " + a); // 50

        a /= b; // Equivalent to a = a / b;
        System.out.println("After a /= b: " + a); // 10

        a %= b; // Equivalent to a = a % b;
        System.out.println("After a %= b: " + a); // 0

        // Reinitializing variables
        a = 10;

        // Increment and Decrement Operators
        System.out.println("Initial value of a: " + a); // 10
        a++; // Post-increment, equivalent to a = a + 1;
        System.out.println("After a++: " + a); // 11

        a--; // Post-decrement, equivalent to a = a - 1;
        System.out.println("After a--: " + a); // 10

        ++a; // Pre-increment, equivalent to a = a + 1;
        System.out.println("After ++a: " + a); // 11

        --a; // Pre-decrement, equivalent to a = a - 1;
        System.out.println("After --a: " + a); // 10

        // Demonstrating difference between pre- and post- increment/decrement
        int c = 10;
        System.out.println("Initial value of c: " + c); // 10
        System.out.println("Value of c++: " + c++); // 10 (c is incremented after this statement)
        System.out.println("Value of c after c++: " + c); // 11

        c = 10;
        System.out.println("Value of ++c: " + ++c); // 11 (c is incremented before this statement)

        c = 10;
        System.out.println("Value of c--: " + c--); // 10 (c is decremented after this statement)
        System.out.println("Value of c after c--: " + c); // 9

        c = 10;
        System.out.println("Value of --c: " + --c); // 9 (c is decremented before this statement)
    }
}
