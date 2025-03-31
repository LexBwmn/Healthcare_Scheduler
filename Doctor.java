public class Doctor {
    private String Name; // name of doctor 
    private String Department; // department of doctor 
    private String Specility;  // doctors specilaity 

    // constructor using this poniters
    // in this case name, department, and string 
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

