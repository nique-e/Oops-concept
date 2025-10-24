class student{
    String name;
    int rollno;
    int age;

    student() {
        name = "Nitesh";
        rollno = 23;
        age = 21;

    }

    student(String n, int r, int a){
        name = n;
        rollno = r;
        age = a;
    }

    void  display(){
        System.out.println("Name :" +name);
        System.out.println("Rollno :" +rollno);
        System.out.println("Age :" +age);
        System.out.println("..................../");
    }

    
}

public class Constructor1{

    public static void main(String[] args) {
        student s1 = new student();
        
        student s2 = new student();
        s1.display();
        s2.display();
        

    }
}