package bank;

public class BusinessAccount extends Account {
    @Override
    public void setCustomer(Customer customer) {
        if(customer instanceof BusinessCustomer) {
            super.setCustomer(customer);
        } else {
            System.out.println("No can do.");
        }
    }
}
