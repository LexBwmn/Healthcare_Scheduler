
public class Hospital {
    private String name;
    private String location;

    public Hospital(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Hospital: " + name + " in " + location;
    }
    
}
