public class CastingBasics {
    public static void main(String[] args) {
        // Casting variables
        int a = 10;
        double b = 3.14;

        // Casting int to double
        double result1 = (double) a;
        System.out.println("Casting int to double: " + result1);

        // Casting double to int
        int result2 = (int) b;
        System.out.println("Casting double to int: " + result2);

        // Casting expression
        double c = 2.5;
        int d = 7;

        // Casting result of division to int
        int result3 = (int) (d / c);
        System.out.println("Casting result of division to int: " + result3);

        // Explicit casting of expression
        double result4 = (double) d / c;
        System.out.println("Explicit casting of division result: " + result4);
    }
}
