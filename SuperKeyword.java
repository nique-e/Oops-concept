
class Parent {
    void display(){
        System.out.println("this is a parent class methods");
    }
}

// Child class
class Child extends Parent {
    void display(){
        System.out.println("This is a child class mehods");
        super.display();
    }
}
public class SuperKeyword {

    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();

    }
}
