public class ForLoops {
    public static void main(String[] args) {
        // Here is the basic for loop structure

        //for (int i = 0; i < COUNT; i++)
        //{
        //    // Code segment that is executed COUNT times.
        //}


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("Countdown");
        for (int i = 100; i >= 0; i--) {
            System.out.println(i);
        }

        // Another Example

        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}
