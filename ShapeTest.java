class shape{
    void draw(){
        System.out.println("Drawing acricle");
    }
}

class square extends shape{
    void draw(){
        System.out.println("Drawing a square");
    }
}

class cricle extends shape{
    void draw(){
        System.out.println("Drawing a cricle");
    }
}

public class ShapeTest{

    public static void main(String[] args) {
        shape s;

        s = new square();
        s.draw();

        s = new cricle();
        s.draw();
        
    }
}
