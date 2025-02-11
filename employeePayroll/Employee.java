public abstract class Employee {

    private String name;
    private int id;

  
    public Employee(String name, int id){
      
        this.name = name;
        this.id=id;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
      
    public void setName(String name) {
        if(!name.isEmpty()){
            this.name = name;
        }else{
            System.out.println("Name cannot be empty");
        }
    }

    public void setId(int id) {
       if(id > 0){
        this.id = id;
       }else{
        System.out.println("ID cannot be negative");
       }
    }

    
    public abstract double calculateSalary();

    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + calculateSalary());
    }


}
