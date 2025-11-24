class Employee {

    
    private String name;
    private int id;
    private double salary;

    
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid name! Name cannot be empty.");
        } else {
            this.name = name;
        }
    }

    
    public void setId(int id) {
        if (id <= 0) {
            System.out.println("Invalid ID! ID must be positive.");
        } else {
            this.id = id;
        }
    }

    
    public void setSalary(double salary) {
        if (salary < 1000) {
            System.out.println("Invalid salary! Salary must be at least 1000.");
        } else {
            this.salary = salary;
        }
    }

    
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    
    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class SetSarlary{
    public static void main(String[] args) {

        Employee emp = new Employee();

        
        emp.setName("Nitesh");
        emp.setId(101);
        emp.setSalary(25000);

        
        emp.setSalary(500);  
        emp.setName("");     

        emp.display();
    }
}
