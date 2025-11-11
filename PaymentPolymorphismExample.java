
class payment{
    void makepayement(){
        System.out.println("processing generic payement....");
    }
}

class creditcardpayment extends payment{
    void makepayement(){
        System.out.println("payment done is credit card...");
    }
}

class Upipayment extends payment{
    void makepayement(){
        System.out.println("payment done using UPI....");
    }
}

class cash extends payment{
    void makepayement(){
 System.out.println("payment done using UPI");
 }
 }

public class PaymentPolymorphismExample{

    public static void main(String[] args) {
payment p1 = new creditcardpayment();
payment p2 = new Upipayment();
payment p3 = new cash();

p1.makepayement();
p2.makepayement();
p3.makepayement();

        
    }
}