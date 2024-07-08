public class BooleanIntro {
    public static void main (String args[]) {
        // Initial setting and printing
        boolean loggedIn = false;
        System.out.println("User logged in?: " + loggedIn);

//        >	    Greater Than
//        <	    Less Than
//        >=	Greater Than Or Equal To
//        <=	Less Than Or Equal To
//        ==	Equal To
//        !=	Not Equal To

        int FirstInt = 10;
        int SecondInt = 8;
        boolean ExampleBool = FirstInt > SecondInt;
        System.out.println(ExampleBool);

        // Declare some integer variables to use for practice comparisons below.
        int a = 3;
        int b = 5;
        int c = 2;
        int d = 3;

// You store the boolean results of each comparison into boolean variables t-z.
        boolean t = a > 0; // true
        boolean u = a == d; // true
        boolean v = d >= b; // false
        boolean w = b > c; // true
        boolean x = a != d; // false
        boolean y = d <= a; // true
        boolean z = 4 <= c; // false


        boolean boolComparison1 = t == u; // true
        boolean boolComparison2 = t == w; // true
        boolean boolComparison3 = t != u; // false
        boolean boolComparison4 = x != y; // true


        // Real life example
        int heightInInches = 50; // Can change this value to see different print statement
        boolean isTallEnough = heightInInches >= 48;
        System.out.println("Can ride on the roller coaster: " + isTallEnough);
    }
}