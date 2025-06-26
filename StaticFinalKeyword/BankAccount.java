public class BankAccount {
    // Static variable shared among all instances
    static String bankName = "State Bank of India";

    // Static variable to track total number of accounts
    private static int totalAccounts = 0;

    // Final variable to prevent changes after initialization
    private final String accountNumber;

    // Instance variable
    private String accountHolderName;

    // Constructor using 'this' keyword
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;  // Increment total accounts on new creation
    }

    // Static method to get total number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Method to display account details using instanceof
    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("Not a valid BankAccount object.");
        }
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", "1234567890");
        BankAccount acc2 = new BankAccount("Bob", "9876543210");

        acc1.displayDetails();
        System.out.println();

        acc2.displayDetails();
        System.out.println();

        System.out.println("Total Bank Accounts: " + BankAccount.getTotalAccounts());
    }
}