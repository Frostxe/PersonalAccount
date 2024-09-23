public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private Amount[] transactions;
    private int transactionCount;

    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new Amount[100];
        this.transactionCount = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions[transactionCount++] = new Amount(amount, TransactionType.DEPOSIT);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions[transactionCount++] = new Amount(amount, TransactionType.WITHDRAWAL);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History for Account Number: " + accountNumber);
        for (int i = 0; i < transactionCount; i++) {
            System.out.println(transactions[i]);
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}



