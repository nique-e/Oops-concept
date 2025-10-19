class granparent{
    void diplay1(){
        System.out.println("this is a granparent class");
    }
}

class parent extends granparent{
    void diplay2(){
        System.out.println("this is a parent class ");
    }
}

class child extends parent{
    void diplay3(){
        System.out.println("this is child class");
    }
}

public class Multilevel{
    public static void main(String[] args) {

        child obj = new child();
        obj.diplay1();
        obj.diplay2();
        obj.diplay3();
        
    }
}