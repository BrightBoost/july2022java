package bank;

public class BusinessCustomer extends Customer {
    private boolean largeCompany;
    private int nrOfEmployees;
    private int largeCompanyTreshold;
    private String chamberOfCommerce;
    private String tin;
    private String name;

    public boolean isLargeCompany() {
        return largeCompany;
    }

    public void setLargeCompany(boolean largeCompany) {
        this.largeCompany = largeCompany;
    }

    public int getNrOfEmployees() {
        return nrOfEmployees;
    }

    public void setNrOfEmployees(int nrOfEmployees) {
        this.nrOfEmployees = nrOfEmployees;
    }

    public int getLargeCompanyTreshold() {
        return largeCompanyTreshold;
    }

    public void setLargeCompanyTreshold(int largeCompanyTreshold) {
        this.largeCompanyTreshold = largeCompanyTreshold;
    }

    public String getChamberOfCommerce() {
        return chamberOfCommerce;
    }

    public void setChamberOfCommerce(String chamberOfCommerce) {
        this.chamberOfCommerce = chamberOfCommerce;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
