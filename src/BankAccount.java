public class BankAccount {
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double balance){
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public double deposit(double amount){
       this.balance += amount;
        return this.balance;
    }

    public double withdraw(double amount){
        this.balance -= amount;
        return this.balance;
    }

    public void getBalance(){
        System.out.println(this.balance);
    }



}
