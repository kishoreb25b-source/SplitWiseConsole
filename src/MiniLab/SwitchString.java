package MiniLab;

import java.util.Scanner;

public class SwitchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running=true; // Declare a boolean to run the loop


        while (running) {  //Run until the condition false

            //variable
            final String REASON_EXPENSE = "Dinner";
            final double TOTAL_AMOUNT = 1200;
            final int Total_Person = 4;
            final double SHARE_PER_PERSON;


            System.out.println();
            System.out.println("=== SplitWise-Console-Backend ===");
            System.out.println();
            System.out.println("1. Add Expense");
            System.out.println("2. View Expense");
            System.out.println("3. Exit");
            System.out.print("Enter Choice:");
            String choice = sc.nextLine();    // Get the value to go to which case in string

            // Using switch function go to the case 1 or 2 or 3 or default
            switch (choice) {

                case "1" -> {                        // Use to Add Expense With new information
                    System.out.println();
                    System.out.println("Recording expense (sample data)...");
                    System.out.println("Expense saved: Dinner | amount=1200.0 | people=4");
                }

                case "2" -> {               // Use to show the Expense to User
                    System.out.println();
                    System.out.println("--- Expense Summary ---");
                    System.out.println("Reason for the Expense:" + REASON_EXPENSE);
                    System.out.println("Number Person in Expense:" + Total_Person);
                    System.out.println("Total Amount in Expanse:" + TOTAL_AMOUNT);
                    SHARE_PER_PERSON = TOTAL_AMOUNT / Total_Person;
                    System.out.println("The Share Per Person:" + SHARE_PER_PERSON);
                }

                case "3" -> {     //If user want to exit case 3  work
                    System.out.println("=== Thanks for coming ===");
                    running = false; // to stop the while loop
                }
                default -> {   // use to tell the use only 1,2,3 is allowed
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                }


            }
        }
    }
}
