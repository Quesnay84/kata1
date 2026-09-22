package software.ulpgc.katas;

public class Main {
    public static void main(String[] args) {
        Pirate pirate = new Pirate("Sparrow", 14);
        Pirate espronceda = new Pirate("José", 21);
        System.out.println("the pirate: " + pirate.name() + " and his status is: " + pirate.status());
        System.out.println("the pirate: " + espronceda.name() + " and his status is: " + espronceda.status());

    }
}
