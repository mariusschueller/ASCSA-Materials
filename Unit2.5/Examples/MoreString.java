public class MoreString {
    public static void main(String[] args) {
        String strLiteral = "karel"; // String Literal
        String strConstr = new String("karel"); // String constructor

        String one = "Mc";
        String two = "Donald's";
        String concatenate = one + two;
        System.out.println(concatenate);

        int number = 24;
        System.out.println("This String is concatenated with an integer at the end: " + number);
    }
}