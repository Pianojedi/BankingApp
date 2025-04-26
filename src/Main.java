public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new CheckingAccount("Checkings", 500.0);
        BankAccount account2 = new SavingsAccount("Savings", 2000.0);

        System.out.println("------------------------------------------");
        System.out.println("Welcome to the Banking App");
        System.out.println("Here are the current accounts");
        System.out.println();

        System.out.println("Account 1:");
        account1.getInfo();
        System.out.println();
        System.out.println("Account 2:");
        account2.getInfo();


        System.out.println("------------------------------------------");
        System.out.println("-Deposit Money-");
        account1.deposit(250);
        account2.deposit(1500);
        System.out.println("Account 1:");
        account1.getInfo();
        System.out.println();
        System.out.println("Account 2:");
        account2.getInfo();


        System.out.println("------------------------------------------");
        System.out.println("-Withdraw Money-");
        account1.withdraw(150);
        account2.withdraw(1500);
        System.out.println("Account 1:");
        account1.getInfo();
        System.out.println();
        System.out.println("Account 2:");
        account2.getInfo();
        System.out.println("(withdraw fee taken from account 2)");
        System.out.println("------------------------------------------");



        System.out.println("-Applying Interest on Savings-");
        account2.applyIntrest(5);
        account2.getInfo();
        System.out.println("(5% interest on balance)");
        System.out.println("------------------------------------------");




    }
}