public class Patient {
    private String Name;
    private int age;
    private String contactInfo; //phone number

    public Patient(String Name, int age, String contactInfo) {
        this.Name = Name;
        this.age = age;
        this.contactInfo = contactInfo;
    }

    @Override
    //returns patient information
    public String toString() {
        return "Name :" + Name + "Age" + age + ",Contact Infromation: " + contactInfo;
    }
}
