public class MathClass
{
    public static void main(String[] args)
    {
        // Note here these are all static methods called on
        // the Math class, not an instance. You can tell that
        // because we never made an object of the Math class
        // with the keyword new.
        int x = Math.abs(-5);
        System.out.println("Absolute value of -5: " + x);

        double squared = Math.pow(10, 2);
        System.out.println("10^2 = " + squared);

        double root = Math.sqrt(squared);
        System.out.println("sqrt(100) = " + root);


    }
}
