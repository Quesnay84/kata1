package software.ulpgc.katas;

import java.util.ArrayList;
import java.util.List;

public record Pirate(String name, int dobloons) {
    public String status(){ return list.get(levelStatus());}

    static List<String> list = List.of("CabinBoy","Sailor", "Capitan");

    private int levelStatus(){
        if (dobloons <= 10) return 0;
        if (dobloons <= 20) return 1;
        return 2;
    }


}
