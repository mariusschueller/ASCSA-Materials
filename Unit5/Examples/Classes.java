// Public vs private

// Public access allows for an element to be accessed by any other class.

// Private access is used when an element (such as a variable or method) should only be able to be
// accessed within the declaring class.

public class Classes {
    // This variable can NOT be accessed outside of this class
    private int value;
    private int value2;


    // Constructor
    public Classes(String param1, int param2){
        value = param2;

        // what happens to value2?
    }

    // This method can be called outside of this class
    public int getValue(){
        return value;
    }
}