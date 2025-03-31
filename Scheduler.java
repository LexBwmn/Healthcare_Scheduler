import java.util.ArrayList;
import java.util.List;

// very simple scheduling application 
public class Scheduler { //update for scheduker that uses sinlgeton design pattern
    //public static void main(String[] args) {
        //A//rrayList<String> tasks = new ArrayList<>(); // stores variables in an arraylist 
        //Scanner scanner = new Scanner(System.in);
        private static Scheduler instance; // creating an instance of them
        private List<Appointment> appointments; //sptring all schduled appts

        private Scheduler(){
            appointments = new ArrayList<>();
        }

        public static Scheduler getInstance(){
            if(instance == null) { //null check 
                instance = new Scheduler();
            }
            return instance; // if instance has already been created
        }

        public void bookAppt(Appointment appointment) {
            appointments.add(appointment);
        }

        public List<Appointment> getAppointments() {
            return appointments;
        }
    }

        // simple while loop for execution 
        //while (true) {
            //System.out.println("\n1. Add Task  2. View Tasks  3. Exit");
            //int choice = scanner.nextInt();
            //scanner.nextLine(); 

            //if (choice == 1) {
               // System.out.print("Enter task: ");
               // tasks.add(scanner.nextLine());
           // } else if (choice == 2) {
               // System.out.println("Tasks: " + tasks);
            //} else if (choice == 3) {
               // System.out.println("Goodbye");
               // break;
            //} else {
               // System.out.println("Invalid choice!");
            //}
}

