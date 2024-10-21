import java.util.List;

public class Plane {
    private List<Family> families;
    private long id;

    public Plane(){}
    public Plane(List<Family> families, long id) {
        this.families = families;
        this.id = id;
    }

    public void setFamilies(List<Family> families) {
        this.families = families;
    }

    public List<Family> getFamilies() {
        return families;
    }

    public long getId() {
        return id;
    }

    public String toString() {
        return "The plane " + id + "/ ";
    }


}