class device{
    void strat(){
        System.out.println("starting a device....");
    }
}

class laptop extends device{
    void strat(){
        System.out.println("laptop is starting with windows os....");

    }
}

class smartphone extends device{
    void  strat(){
        System.out.println("smartphone is stating with android os....");
    }
}

public class MethodOverriding{
    public static void main(String[] args) {
        
        device d1 = new laptop();
        device d2 = new smartphone();

        d1.strat();
        d2.strat();
    }
}