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
    // bill generation function java 
    public static void CreateBill(Patient patient, double amountdue) {
        // prints out bill information for a specific patient 
        System.out.println("Bill for " + patient + ": $" + amountdue);
    }
}
