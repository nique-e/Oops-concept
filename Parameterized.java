 class Student{

    String name;
    int age;

       Student(String n , int a ) {

        name = n;
        age = a;
    }

    void display(){
        System.out.println("name :" +name);
        System.out.println("age :" +age);
    }

 }

public class Parameterized{

    public static void main(String[] args) {
        Student s1 = new Student("Nitesh",21);
        Student s2 = new Student("Rushi",21);

        s1.display();
        s2.display();
        
    }

}