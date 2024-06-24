public class RectangleRunner {
    public static void main(String[] args)
    {
        // Create a new rectangle with a width of 10 and a height of 3
        // Be sure to check out the other file in the sidebar in the code editor!
        Rectangle room = new Rectangle(10, 3);

        // Print out information about the rectangle
        System.out.println("Rectangle Room");
        System.out.println(room);

        // Create a different rectangle with a width of 40 and a height of 60
        Rectangle backyard = new Rectangle(40, 60);

        // Print out information about the rectangle
        // Notice this rectangle has different values for
        // the instance variables.
        System.out.println("Rectangle Backyard");
        System.out.println(backyard);


        // Create a different rectangle with a width of 40 and a height of 60
        Rectangle kitchen = new RectangleOverload(40);

        // Print out information about the rectangle
        // Notice this rectangle has different values for
        // the instance variables.
        System.out.println("Rectangle Kitchen");
        System.out.println(kitchen);


        // Why does uncommenting the following lines cause an error?
        /*
        Rectangle house = new Rectangle(40);

        // Print out information about the rectangle
        // Notice this rectangle has different values for
        // the instance variables.
        System.out.println("Rectangle Backyard");
        System.out.println(backyard);
        */
    }
}
