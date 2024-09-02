package Examples;

public class MoreArrays
{
    public static void main(String[] args) {
        int[] orangeOrders = {10, 3, 6, 4, 5, 1};


        // Where have we seen code like this before?
        for(int i = 0; i < orangeOrders.length; i++)
        {
            // This prints out the ith element!
            System.out.println(orangeOrders[i]);
        }

        // With while loops
        int index = 0;
        while (index <orangeOrders.length)
        {
            System.out. println(orangeOrders[index]);
            index++;
        }


        // Another type of loop: Enhanced For loop
        // This makes a copy of the array so DON'T use to modify elements
        int[] numList = {5,6,7,4,2};
        for(int number: numList)
        {
            System.out. println(number);
        }


        //Another Example
        String[] classroom = {"julian", "larisa", "amada", "mikka", "jay"};

        for(String student : classroom)
        {
            System.out.println(student);
        }
    }
}
