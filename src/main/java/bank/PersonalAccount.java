package bank;

public class PersonalAccount extends Account {
    private boolean vip;

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public void setCustomer(Customer customer) {
        if(customer instanceof PersonalCustomer) {
            super.setCustomer(customer);
        } else {
            System.out.println("No can do.");
        }
    }
}
