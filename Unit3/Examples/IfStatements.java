class IfStatements {
    public static void main(String args[]) {
        // The and operator: &&

        boolean sunny = true;

        if (temp > 70 && sunny == true) {
            System.out.println("Time to get outside!");
        }

        // The same as:
//        if (temp > 70) {
//            if (sunny) {
//                System.out.println("Time to get outside!");
//            }
//        }

        // Another example
        boolean sixThirty = true;
        boolean schoolDay = false;
        System.out.println(sixThirty && schoolDay);


        // the or operator: ||

        boolean rainy = true;
        if (temp < 70 || rainy == true) {
            System.out.println("Time to get outside!");
        }


        // Another example
        boolean isRaining = true;
        boolean isCold = false;
        System.out.println(isRaining || isCold);


        // the not operator: !
        boolean hungry = true;
        System.out.println(!hungry);


        // Another example (slightly more complicated
        rainy = true;
        if (!(temp < 70) || rainy != true) {
            System.out.println("Time to get outside!");
        }
    }
}