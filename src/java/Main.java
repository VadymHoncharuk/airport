import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Family>> families = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(
                        new Family("f1", "Kyiv", 2),
                        new Family("f2", "Dnipro", 3),
                        new Family("f3", "Lviv", 4)
                )),
                new ArrayList<>(Arrays.asList(
                        new Family("f4", "Lviv", 3),
                        new Family("f5", "Dnipro", 2),
                        new Family("f6", "Kyiv", 4)
                )),
                new ArrayList<>(Arrays.asList(
                        new Family("f7", "Lviv", 5),
                        new Family("f8", "Dnipro", 2),
                        new Family("f9", "Kyiv", 3)
                ))
        ));

        List<Plane> planes = new ArrayList<>(Arrays.asList(
                new Plane(families.get(0), 1),
                new Plane(families.get(1), 2),
                new Plane(families.get(2), 3)

        ));

        List<Bus> buses = new ArrayList<>(Arrays.asList(
                new Bus(6, "Kyiv", 1),
                new Bus(7, "Dnipro", 2),
                new Bus(7, "Lviv", 3),
                new Bus(8, "Dnipro", 4),
                new Bus(6, "Kyiv", 5),
                new Bus(7, "Lviv", 6),
                new Bus(6, "Lviv", 7),
                new Bus(7, "Dnipro", 8),
                new Bus(6, "Kyiv", 9)
        ));

        Airport.processMultiThreading(planes, buses);
    }
}