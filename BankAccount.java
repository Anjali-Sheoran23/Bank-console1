class BankAccount 
 {
    int accountNumber;
    String accountHolder;
    double balance;
    BankAccount(int accountNumber, String accountHolder, double balance) 
    {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    void deposit(double amount) 
    {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    void withdraw(double amount) 
    {
        if (balance >= amount) 
        {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        } 
        else 
        {
            System.out.println("Insufficient balance");
        }
    }
    void showBalance() 
    {
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) 
    {
        BankAccount account = new BankAccount(12345, "Aman", 1000);
        account.showBalance();
        account.deposit(500);
        account.showBalance();
        account.withdraw(200);
        account.showBalance();
}
}