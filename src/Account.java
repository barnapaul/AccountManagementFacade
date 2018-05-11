public class Account {

    private double cashInAccount;
    private int accountNumber;

    public Account(int accountNumber,double cashInAccount) {
        this.cashInAccount = cashInAccount;
        this.accountNumber = accountNumber;
    }

    public double getCashInAccount() {
        return cashInAccount;
    }

    public void setCashInAccount(double cashInAccount) {
        this.cashInAccount = cashInAccount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
