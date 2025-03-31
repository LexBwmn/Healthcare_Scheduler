
// this class serves as a class needed for patients who aer under 18
public class EmergencyContact {
    private String name;
    String Relationship;
    String phonenumber;

    public EmergencyContact(String name, String Relationship, String phonenumber) {
        this.name = name;
        this.Relationship = Relationship;
        this.phonenumber = phonenumber;
    }
    @Override
    public String toString() {
        return "Emergency Contact: " + name + ", Phone: " + phonenumber;
    }

}
