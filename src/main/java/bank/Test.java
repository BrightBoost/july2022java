package bank;

public class Test {
    public static void main(String[] args) {
        Account a = new Account();
        BusinessAccount ba = new BusinessAccount();

        System.out.println(a.getMaxDeposit());
        System.out.println(ba.getMaxDeposit());

        Account.maxDeposit = 10000;

        System.out.println(a.getMaxDeposit());
        System.out.println(ba.getMaxDeposit());
    }
}
