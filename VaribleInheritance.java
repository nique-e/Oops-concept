
class Parent{
    int num = 5;
}

class Child extends  Parent{
    void show(){
        System.out.println("this is a child class :" +num);
    }
}
public class VaribleInheritance{

    public static void main(String[] args){
        Child obj = new Child();
        obj.show();

    }
}