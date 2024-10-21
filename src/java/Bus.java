public class Bus {
    private int passengersCount;
    private String driveTo;
    private long id;

    public Bus(){}
    public Bus(int passengersCount, String driveTo, long id) {
        this.passengersCount = passengersCount;
        this.driveTo = driveTo;
        this.id = id;
    }

    public void setPassengersCount(int passengersCount) {
        this.passengersCount = passengersCount;
    }

    public int getPassengersCount() {
        return this.passengersCount;
    }

    public void setDriveTo(String driveTo) {
        this.driveTo = driveTo;
    }

    public String getDriveTo() {
        return this.driveTo;
    }

    public long getId() {
        return id;
    }

    public String toString() {
        return "The bus" + id + " has " + passengersCount + " seats and its drive to " + driveTo + "/ ";
    }

}