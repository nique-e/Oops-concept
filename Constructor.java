
class Student{
    String name;
    int age;

        Student() {
            name = "Nitesh";
            age = 21;
            System.out.println("Deflut Constructor called");
    }

void display(){
    System.out.println("name :" +name);
    System.out.println("age :" +age);
}
    
}
public class Constructor{
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        
    }
}