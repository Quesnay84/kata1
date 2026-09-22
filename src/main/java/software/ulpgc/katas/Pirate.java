package software.ulpgc.katas;

import java.util.List;

public record Pirate(String name, int dobloons) {
    private static final int CABINBOY_THRESHOLD = 10;
    private static final int SAILOR_THRESHOLD = 20;

    public String status(){ return list.get(levelStatus());}

    private final static List<String> list = List.of("CabinBoy","Sailor", "Capitan");

    private int levelStatus(){
        if (dobloons <= 10) return 0;
        if (dobloons <= 20) return 1;
        return 2;
    }
}
