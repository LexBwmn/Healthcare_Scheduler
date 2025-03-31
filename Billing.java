// payment 
public class Billing {
    private Patient patient;
    private double amonutDue;
    private boolean payment;

    public Billing(Patient patient, double amonutDue) {
        this.patient = patient;
        this.amonutDue = amonutDue;
        this.payment = false;
    }
}
