
class Student {

    private String name;
    private int rollNumber;

    
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Invalid name!");
        } else {
            this.name = name;
        }
    }

    
    public void setRollNumber(int rollNumber) {
        if (rollNumber <= 0) {
            System.out.println("Roll number must be positive!");
        } else {
            this.rollNumber = rollNumber;
        }
    }


    public String getName() {
        return name;
    }

    
    public int getRollNumber() {
        return rollNumber;
    }
}


public class student {
    public static void main(String[] args) {
        Student s = new Student();

        
        s.setName("Nitesh");
        s.setRollNumber(25);

        
        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Roll Number: " + s.getRollNumber());
    }
}
