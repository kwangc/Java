package Challenge1;

public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        System.out.println("An empty constructor was called.");
    }

    public Account(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double fund) {
        this.balance += fund;
        System.out.println("Deposit of " + fund + " made. New balance is " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + " processed. Remaining balance = " + balance);
        } else {
            System.out.println("Only " + balance + " available. Withdrawal not processed.");
        }

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
