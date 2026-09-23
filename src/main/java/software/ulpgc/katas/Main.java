package software.ulpgc.katas;

public class Main
{
    public static void main(String[] args)
    {
        Pirate pirate = new Pirate("Juan", 24);
        System.out.println("Pirate name is: " + pirate.name() + " and he has a: " + pirate.firePower());
    }
}
