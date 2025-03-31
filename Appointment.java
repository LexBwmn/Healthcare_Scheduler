import java.time.LocalDateTime;

public class Appointment {
    private Patient patient; // adding the patient to the appointment 
    private Doctor doctor; //adding the doctor to the appointment
    private int RoomNum; // location inside of offcie / hospital
    private LocalDateTime dateTime; // time of appt (using todays current date and time for slpicty and demo)

    // constructor using this poniters (acessing objects memebers)
    // in this case patient, doctor, roomNum, dattime. 
    public Appointment(Patient patient, Doctor doctor, LocalDateTime dateTime) {
        this.patient = patient;
        this.doctor = doctor;
        this.RoomNum = RoomNum;
        this.dateTime = dateTime;
    }
    @Override
    // return patient information and location / roomnum 
    public String toString() {
        return patient + " has an appointment with " + doctor + " on " + dateTime + "in Room: " + RoomNum;
    }
}
