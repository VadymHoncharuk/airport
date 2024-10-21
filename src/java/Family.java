public  class Family {
    private String name;
    private String travelTo;
    private int count;

    public Family(){}
    public Family(String name, String travelTo, int count) {
        this.name = name;
        this.travelTo = travelTo;
        this.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTravelTo(String travelTo) {
        this.travelTo = travelTo;
    }

    public String getTravelTo() {
        return this.travelTo;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }

    @Override
    public String toString() {
        return "The family is " + name + " travel to " + travelTo + ". The family has " + count + " people / ";
    }
}