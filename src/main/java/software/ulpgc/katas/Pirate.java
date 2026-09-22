package software.ulpgc.katas;

import java.util.ArrayList;
import java.util.List;

public record Pirate(String name, int dobloons) {
    public String status(int dobloons){ return list[levelStatus(dobloons)];}

    static List<String> list = List.of("Capitan", "Sailor", "CabinBoy");

    private int levelStatus(int dobloons){
        if (dobloons < 10) return 0;
        if (dobloons < 20) return 1;
        return 2;
    }


}
