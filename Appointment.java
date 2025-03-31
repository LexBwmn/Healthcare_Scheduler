import java.time.LocalDateTime;

public class Appointment {
    private Patient patient; // adding the patient to the appointment
    private Doctor doctor; //adding the doctor to the appointment
    private int RoomNum; // location inside of offcie / hospital
    private LocalDateTime dateTime; // time of appt

    public Appointment(Patient patient, Doctor doctor, LocalDateTime dateTime) {
        this.patient = patient;
        this.doctor = doctor;
        this.RoomNum = RoomNum;
        this.dateTime = dateTime;
    }
}
