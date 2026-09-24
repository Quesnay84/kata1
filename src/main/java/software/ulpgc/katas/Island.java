package software.ulpgc.katas;

public record Island(String name, double distance) {

    private static final double SHIP_VELOCITY = 6.0;
    private static final double HOURS_PER_DAY = 24.0;
    public int daysToReach(){
        double hours = distance/SHIP_VELOCITY;
        return (int) Math.ceil(hours);
    }


}
