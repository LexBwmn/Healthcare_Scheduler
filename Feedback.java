// collects user feedback on appointments 
public class Feedback {
    private Patient patient;
    private String review;

    public Feedback(Patient patient, String review, int rate) {
        this.patient = patient;
        this.review = review;
    }
    public void printFeedback(){
        System.out.println("Patient: " + patient + "Feeback" + review);
    }
}
