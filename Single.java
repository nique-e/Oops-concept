
 class parent {

        void car() {
            System.out.println("this is a parent class :");
        }

    }

    class Child extends parent {

        void car1() {
            System.out.println("this is a child class :");
        }

    }

public class Single {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.car();
        obj.car1();

    }
}
