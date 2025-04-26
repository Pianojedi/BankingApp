public class BankAccount {
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountName, double balance){
        this.accountHolderName = accountName;
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

    public double getBalance(){
        return this.balance;
    }

    public void getInfo(){
        System.out.println("Name: " + this.accountHolderName);
        System.out.println("Balance: " + this.balance);
    }

    public double applyIntrest(double percent){
        double ratio = percent / 100;
        this.balance = this.balance + (this.balance * ratio);
        return this.balance;
    }



}
