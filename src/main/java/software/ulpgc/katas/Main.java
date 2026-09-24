package software.ulpgc.katas;

import static java.lang.System.*;
public class Main {
    public static void main(String[] args) {
        Island tenerife = new Island("Tenerife", 300);
        System.out.println("a la isla: " + tenerife.name() + "; se tardará "+ tenerife.daysToReach() + " dias en llegar");
    }
}

