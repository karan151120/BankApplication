package class2.BankApplication;

public interface Bank {
    public int getBalance(String passwordSent);

    public String addMoney(int accountNumber, int money);

    public String withdrawMoney(String passwordSent, int money);

    public double calcRate(int years);
}
