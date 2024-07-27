class LoopsAndStrings{
    public static void main(String[] args)
    {
        String print = "Print Me!";

        for(int i = 0; i < print.length(); i++)
        {
            System.out.println(print.substring(i, i+1));
        }

        // How to break this down:
        // how is the loop changing?
        // what is the iterator (i) being used for?
        // if when all else fails, start with what you know
        String string = "Hi ThErE";
        int counter = 0;
        for(int i = 0; i < string.length(); i++) {
            String letter = string.substring(i, i+1);
            if(letter.equals(letter.toUpperCase())) {
                counter++;
            }
        }
        System.out.print(counter);



        // Another Example
        String str = "hello world";
        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if ((c == 'A') || (c == 'a') || (c == 'E') || (c == 'e') || (c == 'I') || (c == 'i')
                    || (c == 'O') || (c == 'o') || (c == 'U') || (c == 'u')) {
                String front = str.substring(0, i);
                String back = str.substring(i + 1);
                str = front + "*" + back;
            }
        }
        System.out.println(str);

    }
}
