public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolderName, double balance){
        super(accountHolderName,balance);
    }


    @Override
    public double withdraw(double amount){
        this.balance -= (amount + 2);
        return this.balance;
    }





}
