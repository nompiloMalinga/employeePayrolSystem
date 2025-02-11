import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {


    private List<Employee> employeeList;


    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }


    public void addEmployee(Employee employee){

        employeeList.add(employee);

    }


    public void processPayroll() {
        System.out.println("\nPayroll Summary:");
        
        for (Employee emp : employeeList) {
            emp.displayEmployeeInfo();
        }
    } 
}
