
// this class serves as a class needed for patients who are under 18
public class EmergencyContact {
    private String name; // name of emergency contact 
    String Relationship; // relatioship that the contact has to the patient 
    String phonenumber; // phonr number of the emergnecy contact 

    // constructor using this pointers 
    // in this case name, relationship, and phone number 
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
