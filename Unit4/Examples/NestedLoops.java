public class NestedLoops {
    public static void main(String[] args){
        for (int row = 1; row < 6; row++) {
            // Original loop inside
            for(int count = 1; count < 6; count++) {
                System.out.print(count * row + " " );
            }
            System.out.println();
        }


        int line = 1;
        while(line < 6) {
            int number = 1;
            while(number < 6) {
                System.out.print(number*line +" ");
                number++;
            }
            System.out.println();
            line++;
        }


        // Some more examples

        for (int row = 0; row < 3; row++)
        {
            for (int col = 0; col < 5; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
