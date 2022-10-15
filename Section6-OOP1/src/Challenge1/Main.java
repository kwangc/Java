package Challenge1;

public class Main {
    public static void main(String[] args) {
        Account tonysAccount = new Account("12345", 0.00, "Tony Lee", "test@tony.com", "010-2345-6789");

        tonysAccount.deposit(101.0);
        tonysAccount.withdraw(100.0);
    }
}
