public class StringFunctions {

    public static void main(String[] args) {
        // Example strings
        String str1 = "Hello, World!";
        String str2 = "Hello, Java!";
        String str3 = "hello, world!";

        // length()
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Length of str2: " + str2.length());

        // substring()
        System.out.println("Substring of str1 from index 0 to 1: " + str1.substring(0, 1));
        System.out.println("Substring of str2 from index 1 to 3: " + str2.substring(1, 3));

        // indexOf()
        System.out.println("Index of 'W' in str1: " + str1.indexOf("W"));
        System.out.println("Index of 'Java' in str2: " + str2.indexOf("Java"));

        // equals()
        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equals str3: " + str1.equals(str3));

        // compareTo()
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));

        // Additional comparison with a string that has the same characters but different case
        String str4 = "Hello, world!";
        System.out.println("str1 equals str4: " + str1.equals(str4));
        System.out.println("str1 compareTo str4: " + str1.compareTo(str4));
        System.out.println("str1 compareToIgnoreCase str4: " + str1.compareToIgnoreCase(str4));

        AnotherExample();
    }

    public static void AnotherExample(){
        // Example strings
        String str1 = "jeff";
        String str2 = "johnny";
        String str3 = "jeff";

        // length()
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Length of str2: " + str2.length());

        // substring()
        System.out.println("Substring of str1: " + str1.substring(0,
                str1.length() - 1));
        System.out.println("Substring of str2 from index 1 to 5: " + str2.substring(1, 5));

        // indexOf()
        System.out.println("Index of 'j' in str1: " + str1.indexOf("j"));
        System.out.println("Index of 'n' in str2: " + str2.indexOf("n"));

        // equals()
        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equals str3: " + str1.equals(str3));

        // compareTo()
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));

        // Additional comparison with a string that has the same characters but different case
        String str4 = "Jeff";
        System.out.println("str1 equals str4: " + str1.equals(str4));
        System.out.println("str1 compareTo str4: " + str1.compareTo(str4));
        System.out.println("str1 compareToIgnoreCase str4: " + str1.compareToIgnoreCase(str4));
    }
}
