class Student{
    String name;
    int age ;

       Student() {
        name = "Umknow";
        age = 0;
        System.out.println("Default constructor called");
    }

    Student(String n , int a){
        name = n;
        age = a;
        System.out.println("Parameterized constructor called");

    }

    void display(){
        System.out.println("name :" +name);
        System.out.println("age :" +age);
    }
    
}

public class ConstructorOverloading{
    public static void main(String[] args) {
        Student s1 = new Student("Nitesh",21);
        s1.display();

        System.out.println("");

        Student s2 = new Student("Rushi",21);
        s2.display();
        
    }
}

 