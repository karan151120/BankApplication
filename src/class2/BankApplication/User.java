package class2.BankApplication;

public class User {
    public static void main(String[] args) {
        SBIbank account1 = new SBIbank(110000, "Karan", "123");

        String message = account1.withdrawMoney("123",10000);
        System.out.println(message);

        double interest = account1.calcRate(20);
        System.out.println("You will get interest after 20 years : " + interest);

    }
}
