public class Main {
    public static void main(String[] args) {
        PersonalAccount myAccount = new PersonalAccount(100, "Omurbek");

        myAccount.deposit(200);
        myAccount.withdraw(50);
        myAccount.withdraw(30);
        myAccount.deposit(100);

        System.out.println("Current Balance: " + myAccount.getBalance());
        myAccount.printTransactionHistory();
    }
}
