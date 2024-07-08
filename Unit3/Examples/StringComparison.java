public class StringComparison {
    public static void main(String[] args) {
        // Initialize strings
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";

        // Using equals() method with if statements
        System.out.println("Using equals() method with if statements:");
        if (str1.equals(str2)) {
            System.out.println("str1 is equal to str2");
        } else {
            System.out.println("str1 is not equal to str2");
        }

        if (str1.equals(str3)) {
            System.out.println("str1 is equal to str3");
        } else {
            System.out.println("str1 is not equal to str3");
        }

        // Using equalsIgnoreCase() method with if statements
        System.out.println("\nUsing equalsIgnoreCase() method with if statements:");
        if (str1.equalsIgnoreCase(str3)) {
            System.out.println("str1 is equal to str3 (ignoring case)");
        } else {
            System.out.println("str1 is not equal to str3 (ignoring case)");
        }
    }
}
