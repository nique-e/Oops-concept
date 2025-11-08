

public class MethodOverloadingExample{

    void add(int a, int b){
        System.out.println("sum of two integer :" +(a+b));
    }

    void add(int a, int b, int c){
        System.out.println("sum of three integer:" +(a+b+c));
    }

    void add(double a, double b){
        System.out.println("sum of double :" +(a+b));
    }
    public static void main(String[] args){
        MethodOverloadingExample obj = new MethodOverloadingExample();
          obj.add(10, 20);        // Calls method 1
        obj.add(10, 20, 30);    // Calls method 2
        obj.add(5.5, 3.2); 
    }
}
