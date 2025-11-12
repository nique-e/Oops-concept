
class device{
    void showFeatures(){
        System.out.println("Basic device features...");
    }
}

class laptop extends device{
    void showFeatures(){
        System.out.println("laptop : large screen, keybord, and multitasking support");
    }
}
class smartphone extends device{
    void showFeatures(){
        System.out.println("smartphone: mobile start");
    }
}
class smartwatch extends device{
    void showFeatures(){
      System.out.println("Smartwatch: Health tracking and notifications");
    }
}
public class polymorphismEx{

    public static void main(String[] args) {
         device d1 = new laptop();
        device d2 = new smartphone();
        device d3 = new smartwatch();

        d1.showFeatures();
        d2.showFeatures();
        d3.showFeatures();

    }

}