package bank;

public class Account {
    private String accountNumber;
    private double balance;
    private boolean active;
    private Customer customer;
    private String savingsAccountNumber;
    private double maxWithdrawalAmount;
    private double maxDeposit;
    private double minimumBalance;

    public double changeBalance(double amount) {
        double newBalance = balance - amount;

        if((amount > 0 && active && newBalance >= minimumBalance && amount <= maxWithdrawalAmount) ||
                (amount < 0 && active && amount <= maxDeposit)) {
            balance = newBalance;
        } else {
            System.out.println("Er ging iets fout met af-/bijschrijving van " + amount + " van " + this);
        }
        return balance;

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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getSavingsAccountNumber() {
        return savingsAccountNumber;
    }

    public void setSavingsAccountNumber(String savingsAccountNumber) {
        this.savingsAccountNumber = savingsAccountNumber;
    }

    public double getMaxWithdrawalAmount() {
        return maxWithdrawalAmount;
    }

    public void setMaxWithdrawalAmount(double maxWithdrawalAmount) {
        this.maxWithdrawalAmount = maxWithdrawalAmount;
    }

    public double getMaxDeposit() {
        return maxDeposit;
    }

    public void setMaxDeposit(double maxDeposit) {
        this.maxDeposit = maxDeposit;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", active=" + active +
                ", customer=" + customer +
                ", savingsAccountNumber='" + savingsAccountNumber + '\'' +
                ", maxWithdrawalAmount=" + maxWithdrawalAmount +
                ", maxDeposit=" + maxDeposit +
                ", minimumBalance=" + minimumBalance +
                '}';
    }
}
