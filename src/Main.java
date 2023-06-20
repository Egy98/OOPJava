import Models.Account;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber(34589211);
        account.setBalance(1000.0);
        System.out.println("Bank Name: " + Account.getNameBank());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());
        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}
