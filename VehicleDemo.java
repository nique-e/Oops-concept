class Vehicle{
    void fuleType(){
        System.out.println("vehicle uses some type of fule");
    }
}

class Car extends Vehicle{
    void fuleType(){
        System.out.println("Car use petrol or diesel");

    }
}

class Bike extends Vehicle{
    void fuleType(){
        System.out.println("Bike uses petrol");
    }
}

class Bus extends Vehicle{
    void fuleType(){
        System.out.println("Bus use diesel");
    }
}
public class VehicleDemo{
    public static void main(String[] args) {

        Vehicle v;

        v = new Car();
        v.fuleType();

        v = new Bike();
        v.fuleType();

        v = new Bus();
        v.fuleType();


    }
}