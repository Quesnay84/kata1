package software.ulpgc.katas;

public class Main {
    public static void main(String[] args) {
        Pirate sparrow = new Pirate("jack", 60);
        Pirate espronceda = new Pirate("jose", 10);
        System.out.println("El pirata: " + sparrow.getName() + " tiene un: " + sparrow.typeShip());
        System.out.println("El pirata: " + espronceda.getName() + " tiene un: " + espronceda.typeShip());


    }
}
