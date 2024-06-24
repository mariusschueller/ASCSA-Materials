public class ObjectCreator {
    public static void main(String[] args)
    {
        // `Animal` is our class.

        // `myDog` and `myCat` are objects, because
        // they are specific instances of our `Animal` class.
        Animal myDog = new Animal("Cujo", true, 7);
        Animal myCat = new Animal("Kerby", true, 2);
    }
}
