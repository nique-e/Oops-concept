// Class demonstrating encapsulation
class Student {
    // Private data members
    private int id;
    private String name;
    private int age;

    // Public setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }

    // Public getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Main class
public class Encapsulation {
    public static void main(String[] args) {
        // Create object
        Student s = new Student();

        // Set values using setters
        s.setId(101);
        s.setName("Nitesh");
        s.setAge(22);

        // Get values using getters
        System.out.println("Student ID: " + s.getId());
        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Age: " + s.getAge());
    }
}
