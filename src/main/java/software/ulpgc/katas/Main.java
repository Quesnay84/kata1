package software.ulpgc.katas;

public class Main {
    public static void main(String[] args) {
        Ship sparrow = new Ship("jack", 60);
        Ship espronceda = new Ship("jose", 10);

        System.out.println("El pirata: " + sparrow.name() + " tiene un: " + sparrow.typeShip());
        System.out.println("El pirata: " + espronceda.name() + " tiene un: " + espronceda.typeShip());



    }
}
