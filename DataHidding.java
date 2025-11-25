class BankAccount {

    
    private String accountHolder;
    private double balance;

    
    public void setAccountHolder(String name) {
        if (name != null && name.trim().length() > 0) {
            accountHolder = name;
        } else {
            System.out.println("Invalid account holder name!");
        }
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    
    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class DataHidding {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.setAccountHolder("Nitesh");
        acc.deposit(5000);

        
        acc.setAccountHolder("");
        acc.deposit(-200);

        acc.displayDetails();
    }
}
