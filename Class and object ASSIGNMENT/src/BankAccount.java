//4. Bank Withdrawal Story A bank system stores customer account information.
//Create a class BankAccount with private variables: accountHolder
//balance withdrawAmount Using getter logic: If withdrawAmount ≤ balance then subtract it from balance.
//Otherwise print: Insufficient balance Display remaining balance.

class BankAccount {
    private String accountHolder;
    private double balance;
    private double withdrawAmount;

    // Setter
    public void setData(String name, double bal, double amount) {
        accountHolder = name;
        balance = bal;
        withdrawAmount = amount;
    }

    // Getter
    public double getBalance() {
        if (withdrawAmount <= balance) {
            balance = balance - withdrawAmount;
        } else {
            System.out.println("Insufficient Balance");
        }
        return balance;
    }

    public void display() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Remaining Balance : " + getBalance());
    }
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.setData("Kalyani", 10000, 3000);

        b.display();
    }
}