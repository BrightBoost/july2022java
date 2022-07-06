package bank;

public class Main {
    public static void main(String[] args) {
        PersonalCustomer personalCustomer = new PersonalCustomer();
        PersonalAccount personalAccount = new PersonalAccount();
        personalAccount.setActive(true);
        personalAccount.setBalance(1000);
        personalAccount.setMaxWithdrawalAmount(100);
        personalAccount.setMinimumBalance(0);
        personalAccount.setCustomer(personalCustomer);
        personalCustomer.setAccount(personalAccount);

        System.out.println(personalAccount.changeBalance(100));
    }


}
