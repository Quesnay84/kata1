package software.ulpgc.katas;


import java.util.List;

public record Pirate(String name, int cannons) {

    private final static int BALANDRO_LIMIT = 3;
    private final static int FRAGATA_LIMIT = 25;
    public String firePower(){ return typeShip.get(typeShip());}

    private static final List<String> typeShip = List.of("Balandro", "Fragata", "Galeón");

    private int typeShip(){
        if(cannons < BALANDRO_LIMIT) return 0;
        if(cannons > FRAGATA_LIMIT) return 1;
        return 2;
    }

}
