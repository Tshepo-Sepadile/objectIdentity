package ac.za.cput;

public class DogName {

    private static Dog dog = new Dog("Bobby");

    public static void main(String[]rags)
    {
        naming();
    }

    public static void naming()
    {
       System.out.println("My dog's name is " + dog.getName() + ".");
    }
}
