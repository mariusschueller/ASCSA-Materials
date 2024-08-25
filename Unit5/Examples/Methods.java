// Static
// Means the same
// Static Method: a method shared among all instances of the object (also known as class method)
// Static variable: a vairable shared among all instances of the object (also known as class variable)

// We're only going to be implementing objects that are static

public class Methods //example is super hero
{
    // Is this a static variable?
    private String name;

    public static int numSuperHeroes = 0;

    public Methods(String heroName, String power)
    {
        name = heroName;
        System.out.println("Power");
        numSuperHeroes++;
    }

    // Is this a static method?
    public static int getNumSuperHeroes()
    {
        return numSuperHeroes;
    }
}




