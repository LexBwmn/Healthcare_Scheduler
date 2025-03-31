public class Doctor {
    private String Name;
    private String Department; 
    private String Specility; 

    public Doctor(String Name, String Department, String Specility) {
        this.Name = Name;
        this.Department = Department;
        this.Specility = Specility;
    }
    
    @Override
    // returns doctor information
    public String toString() {
        return "Name :" + Name + " Department :" + Department + ", Speciality : " + Specility;
    }
}

