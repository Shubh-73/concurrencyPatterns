package immutableClassPattern;

public class BankAccount {

    private final int accountNumber;
    private final Person accountHolder;
    private final double balance;

    public BankAccount(int accountNumber, Person accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = new Person(accountHolder);
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    //always return the deep copy of other object instantiated in the immutable class
    public Person getAccountHolder() {
        return new Person(accountHolder);
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolder=" + accountHolder.getName() +
                ", balance=" + balance +
                '}';
    }
}
