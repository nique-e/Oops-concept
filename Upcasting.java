 class Employee{

    void work(){
        System.out.println("Employee is working");
    }
 }
 class Manager extends  Employee{
    void work(){
        System.out.println("Manager is managing the team");
    }

    void meeting(){
        System.out.println("Manager is conducting a meeting");
    }
 }
public class Upcasting{

    public static void main(String[] args) {
        Employee emp = new Manager();
        emp.work();

        Manager m = (Manager) emp;
        m.meeting();

        
    }
}