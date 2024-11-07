package structure;

public class Account {

    String owner;
    double balance;
    double minimumBalance;

    public void deposit(double amount) {
        //implementation
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {

    }

    public double calculateCreditWorthiness(){
        return 100;
    }
}
