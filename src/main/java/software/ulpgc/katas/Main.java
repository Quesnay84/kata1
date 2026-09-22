package software.ulpgc.katas;

public class Main {
    public static void main(String[] args) {
        Pirate pirate = new Pirate("Sparrow", 14);
        Pirate pirate_2 = new Pirate("Jack", 21);
        System.out.println("the pirate: " + pirate.name() + " and his status is: " + pirate.status());
        System.out.println("the pirate: " + pirate_2.name() + " and his status is: " + pirate_2.status());

    }
}
