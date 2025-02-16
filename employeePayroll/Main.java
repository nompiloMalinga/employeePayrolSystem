import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PayrollSystem pSystem = new PayrollSystem();

        while (true) {
            try {
                System.out.println("\nChoose Employee Type:");
                System.out.println("1. Full-Time Employee");
                System.out.println("2. Part-Time Employee");
                System.out.println("3. Exit");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 3) {
                    System.out.println("Exiting Payroll System...");
                    break;
                }

                
                String employeeName;
                while (true) {
                    System.out.println("Enter Employee Name: ");
                    employeeName = scanner.nextLine();
                    if (isNameValid(employeeName)) {
                        break;
                        
                    }else{
                        System.out.println("Name should consist of letters only,Please enter a valid name.");
                    }

                    
                }

                System.out.println("Enter Employee ID: ");
                int id = scanner.nextInt();

                Employee employee;
                if (choice == 1) {
                    System.out.println("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    employee = new FullTimeEmployee(employeeName, id, salary);
                } else if (choice == 2) {
                    System.out.println("Enter Hourly Rate: ");
                    double hourlyRate = scanner.nextDouble();

                    System.out.println("Enter Hours Worked: ");
                    int hoursWorked = scanner.nextInt();

                    employee = new PartTimeEmployee(employeeName, id, hourlyRate, hoursWorked);
                } else {
                    System.out.println("Invalid choice! Please try again.");
                    continue;
                }

                pSystem.addEmployee(employee);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();

            }
        }

        System.out.println("\nProcessing Payroll...");
        pSystem.processPayroll();
        scanner.close();

    }


    public static boolean isNameValid(String name){
        return name.matches("[a-zA-Z ]+");
    }
}
