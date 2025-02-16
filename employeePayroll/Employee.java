public abstract class Employee {

    private String name;
    private int id;

    public Employee(String name, int id) {

        this.name = name;
        this.id = id;

    }

    public abstract double calculateSalary();

    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + calculateSalary());
    }

}
