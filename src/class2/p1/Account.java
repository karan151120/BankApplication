package class2.p1;

public class Account {
    private String accountNumber;

    private String password;

    private int balance;

    public Account(String password, int balance) {
        this.accountNumber = "1234";
        this.password = password;
        this.balance = balance;
    }

    public int getBalance(String passwordSent) {
        //putting a validation check
        if(this.password.equals(passwordSent)) {
            return balance;
        }
        return -1;
    }

    public int withdrawMoney(String passwordSent, int amount) {
        if(passwordSent.equals(this.password)) {
            if(amount <= balance) balance -= amount;
            else return -1;
        }
        else {
            return -1;
        } return balance;
    }
}
