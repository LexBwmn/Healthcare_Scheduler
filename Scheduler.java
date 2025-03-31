import java.util.ArrayList;
import java.util.Scanner;

// very simple scheduling application 
public class Scheduler {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>(); // stores variables in an arraylist 
        Scanner scanner = new Scanner(System.in);


        // simple while loop for execution 
        while (true) {
            System.out.println("\n1. Add Task  2. View Tasks  3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter task: ");
                tasks.add(scanner.nextLine());
            } else if (choice == 2) {
                System.out.println("Tasks: " + tasks);
            } else if (choice == 3) {
                System.out.println("Goodbye");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}