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
    }

    
}

public class Constructor1{

    public static void main(String[] args) {
        

    }
}