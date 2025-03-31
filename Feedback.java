// collects user feedback on appointments 
public class Feedback {
    private Patient patient;
    private String review;
    private int rate;

    public Feedback(Patient patient, String review, int rate) {
        this.patient = patient;
        this.review = review;
        this.rate = rate;
    }
}
