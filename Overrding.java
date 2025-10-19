
class Animal{
    void sound(){
        System.out.println("Animal makes sound :");
    }
}

class dog extends Animal{
   void sound(){
    System.out.println("Dog barks");
    }
}

class cat extends Animal{
    void sound(){
            System.out.println("Cat Moua");
    }
}
public class Overrding{

    public static void main(String[] args) {
        Animal obj = new dog();
        obj.sound();
        
    }
}