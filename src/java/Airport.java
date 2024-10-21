import java.util.ArrayList;
import java.util.List;

public class Airport {
    public static void processMultiThreading(List<Plane> planes, List<Bus> buses) {
        List<Thread> threads = new ArrayList<>();

        Thread thread;
        for (Plane plane : planes) {
            thread = new Thread(() -> {
                process(plane, buses);
            });
            threads.add(thread);
            thread.start();
        }

        for (Thread tempThread : threads) {
            try {
                tempThread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void process(Plane plane, List<Bus> buses) {

        for (Family family : plane.getFamilies()) {

            for (Bus bus : buses) {
                synchronized (bus) {
                    if (bus.getPassengersCount() > family.getCount() - 1 && bus.getDriveTo().equals(family.getTravelTo())) {
                        System.out.println(plane + " " + bus + " " + family + " ");
                        bus.setPassengersCount(bus.getPassengersCount() - family.getCount());
                        break;
                    } else {
                        System.out.println("Not enough space for family " + family.getName() + " in bus " + bus.getId());
                    }
                }
            }

        }
    }
}