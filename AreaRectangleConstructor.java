class Rectangle{
    int length;
    int breadth;

     Rectangle(int l, int b) {
        length = l;
        breadth = b;

    }

    void calculateArea(){
        int area = length * breadth;
        System.out.println("Araea of Rectangle :" +area);
    }

    
}

public class AreaRectangleConstructor{
    public static void main(String[] args) {
         Rectangle rect = new Rectangle(10, 5);
        rect.calculateArea();
        
    }
}