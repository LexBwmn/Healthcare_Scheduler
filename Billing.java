// payment calss 
public class Billing {
    private Patient patient; // patient (who is paying)
    private double amonutDue; // amount of money that is due

    // constructoe made using this poniter
    // in this case patient and amountdue
    public Billing(Patient patient, double amonutDue) {
        this.patient = patient;
        this.amonutDue = amonutDue;
    }
    // bill generation function java 
    public static void CreateBill(Patient patient, double amountdue) {
        // prints out bill information for a specific patient 
        System.out.println("Bill for " + patient + ": $" + amountdue);
    }
}
