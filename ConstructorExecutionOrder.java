class Parent{

     Parent() {
        System.out.println("parent class constructor executed");
    }
    
}

class Child extends Parent{
    Child(){
        System.out.println("child class constructor executed");
    }
}

public class ConstructorExecutionOrder{
    public static void main(String[] args) {
        Child obj = new Child();
        
    }
}