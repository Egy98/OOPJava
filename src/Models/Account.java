package Models;

    public class Account {
        private static String NameBank = "Intesa San Paolo";
        private int accountNumber;
        private double balance;

        public Account() {
        }

        public static String getNameBank() {
            return NameBank;
        }

        public static void setNameBank(String nameBank) {
            NameBank = nameBank;
        }

        public int getAccountNumber() {
            return this.accountNumber;
        }

        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }

        public double getBalance() {
            return this.balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public void deposit(double amount) {
            this.balance += amount;
        }

        public void withdraw(double amount) {
            if (this.balance >= amount) {
                this.balance -= amount;
            } else {
                System.out.println("Insufficient funds");
            }

        }
    }

