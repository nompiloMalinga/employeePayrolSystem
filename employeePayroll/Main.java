import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PayrollSystem pSystem = new PayrollSystem();

        while (true) {
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

            System.out.println("Enter Employee Name: ");
            String employeeName = scanner.nextLine();

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
        }

        System.out.println("\nProcessing Payroll...");
        pSystem.processPayroll();
        scanner.close();

    }
}
