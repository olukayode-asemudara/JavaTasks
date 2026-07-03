package bankApp;

public class Account {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount > 0) balance = amount + balance;
    }

    public void withdraw(double amount, String password){
        if(password == null) throw new IllegalArgumentException("password field is empty");
        if(password.length() < 4) throw new IllegalArgumentException("password too short");
        if(!password.matches("\\d+")) throw new IllegalArgumentException("password must contain only digits");
        if(amount <= balance) balance -= amount;
    }
}