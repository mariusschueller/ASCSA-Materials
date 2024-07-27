public class WhileLoops{
    public static void main(String[] args) {
        //Here is the basic while loop structure:
        //while(boolean expression)
        //        {
        //             code block inside of while loop to execute if the boolean expression is true
        //        }
        // code outside of while loop to execute if the boolean expression is false

        int i = 5;
        System.out.println("Initiating countdown:");
        while (i >= 0) {
            System.out.println(i + "...");
            i--;
        }

        int num = 345;

        while (num > 0) {
            // get the first digit by using the mod function
            int digit = num % 10;
            System.out.println(digit);

            // Divide the number by 10
            num /= 10; // Integer division truncates the number
        }


        // Another Example
        int i = 0;
        System.out.println("Initiating countup:");
        while (i <= 5) {
            System.out.println(i + "...");
            i++;
        }


        // What's wrong with the following code:

//    int i = 5;
//    System.out.println("Initiating countdown:");
//    while(i >= 0) {
//            System.out.println(i + "...");
//    }
    }
}


