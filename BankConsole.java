import java.io.*;
import java.util.*;

// Account class (Serializable for saving in file)
class Account implements Serializable {
    int accNo;
    String name;
    double balance;

    Account(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }
}

public class BankConsole {
    static HashMap<Integer, Account> accounts = new HashMap<>();
    static File file = new File("accounts.txt");

    // Load data from file
    @SuppressWarnings("unchecked")
    static void loadData() {
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                accounts = (HashMap<Integer, Account>) ois.readObject();
            } catch (Exception e) {
                System.out.println("No previous data found, starting fresh.");
            }
        }
    }

    // Save data to file
    static void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(accounts);
        } catch (Exception e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    // Create Account
    static void createAccount(int accNo, String name, double balance) {
        if (accounts.containsKey(accNo)) {
            System.out.println("Account already exists!");
        } else {
            accounts.put(accNo, new Account(accNo, name, balance));
            saveData();
            System.out.println("Account created successfully!");
        }
    }

    // Deposit
    static void deposit(int accNo, double amount) {
        Account acc = accounts.get(accNo);
        if (acc != null) {
            acc.balance += amount;
            saveData();
            System.out.println("Deposit successful! Balance: " + acc.balance);
        } else System.out.println("Account not found!");
    }

    // Withdraw
    static void withdraw(int accNo, double amount) {
        Account acc = accounts.get(accNo);
        if (acc != null && acc.balance >= amount) {
            acc.balance -= amount;
            saveData();
            System.out.println("Withdraw successful! Balance: " + acc.balance);
        } else System.out.println("Transaction failed!");
    }

    // Check Balance
    static void checkBalance(int accNo) {
        Account acc = accounts.get(accNo);
        if (acc != null) System.out.println("Balance: " + acc.balance);
        else System.out.println("Account not found!");
    }

    // Display all accounts
    static void displayAll() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found!");
            return;
        }
        System.out.println("AccNo\tName\tBalance");
        for (Account acc : accounts.values()) {
            System.out.println(acc.accNo + "\t" + acc.name + "\t" + acc.balance);
        }
    }

    // Main Menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        loadData();

        while (true) {
            System.out.println("\n=== Bank Management System ===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter Account No: ");
                    int accNo = sc.nextInt();
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double bal = sc.nextDouble();
                    createAccount(accNo, name, bal);
                    break;
                case 2:
                    System.out.print("Enter Account No & Amount: ");
                    deposit(sc.nextInt(), sc.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter Account No & Amount: ");
                    withdraw(sc.nextInt(), sc.nextDouble());
                    break;
                case 4:
                    System.out.print("Enter Account No: ");
                    checkBalance(sc.nextInt());
                    break;
                case 5:
                    displayAll();
                    break;
                case 6:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
