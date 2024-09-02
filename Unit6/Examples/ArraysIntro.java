package Examples;

public class ArraysIntro
{
    public static void main(String[] args)
    {
        // General array creation
        // type[] arrayName = new type[numberOfElements];

        int[] newNumberList = new int[6];


        // Alternate initialization
        int[] numberList = {10,20,30,40,50,60};


        // What will this create?
        double[] list = new double[24];



        // Getting elements
        int firstNumber = numberList[0];

        System.out.println(firstNumber);
        System.out.println(numberList[0]);

        // Out of bounds
        double[] example = new double[5];
        double value = example[5];

    }
}