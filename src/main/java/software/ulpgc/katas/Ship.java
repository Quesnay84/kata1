package software.ulpgc.katas;

import java.util.List;

public record Ship(String name,int cannons){


    private final static int BALANDRO_LIMIT = 10;
    private final static int FRAGATA_LIMIT = 20;

    public String typeShip(){ return shipList.get(numberShip());}

    private final static List<String> shipList = List.of("Balandro", "Fragata", "Galeón");
    private int numberShip(){

        if(cannons <= BALANDRO_LIMIT)return 0;
        if(cannons <= FRAGATA_LIMIT)return 1;
        return 2;
    }




}
