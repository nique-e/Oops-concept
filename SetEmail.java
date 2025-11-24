 class Student {

    private String name;
    private int age;
    private String email;


    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid name! Name cannot be empty.");
        } else {
            this.name = name;
        }
    }

    
    public void setAge(int age) {
        if (age < 1 || age > 120) {
            System.out.println("Invalid age! Age must be between 1 and 120.");
        } else {
            this.age = age;
        }
    }

    
    public void setEmail(String email) {
        if (email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            System.out.println("Invalid email! Please enter a valid email address.");
        }
    }


    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }
}

public class SetEmail {
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Nitesh");
        s.setAge(21);
        s.setEmail("nitesh@gmail.com");

        s.setName("");
        s.setAge(150);
        s.setEmail("wrongEmail");

        s.display();
    }
}
