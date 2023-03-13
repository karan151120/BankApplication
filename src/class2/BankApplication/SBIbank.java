package class2.BankApplication;

import java.util.UUID;

public class SBIbank implements Bank{
    String accountNumber;
    int balance;
    String name;
    String password;

    double rate = 7;
    public SBIbank(int balance, String name, String password) {
        this.accountNumber = UUID.randomUUID().toString();
        this.balance = balance;
        this.name = name;
        this.password = password;
    }

    @Override
    public int getBalance(String passwordSent) {
        if(this.password == passwordSent) {
            return this.balance;
        } return -1;
    }

    @Override
    public String addMoney(int accountNumber, int money) {
        this.balance = this.balance + money;

        return "Money added sucessfully";
    }

    @Override
    public String withdrawMoney(String passwordSent, int money) {
        if(this.password == passwordSent) {
            if(this.balance < money) {
                return "Insufficient Balance";
            }
            else {
                this.balance = this.balance - money;
                return "Money withdraw sucessfull";
            }
        }
        return "Invalid Password";
    }

    public double calcRate(int years){
        double interest = (this.balance*rate*years)/100;
        return interest;
    }
}
