public class Savings extends FundsCheck {


    public Savings(int accountNumber, double cashInAccount) {
        super(accountNumber, cashInAccount);
    }

    public void calculateInterest(int nrOfMonths) {
        System.out.println("In " + nrOfMonths + " months, your interest will be " +
                (this.cashInAccount * nrOfMonths * (0.5/100)) + "\nTotal: " +
                (this.cashInAccount * nrOfMonths * (0.5/100) + this.cashInAccount  + "\n"));
    }

}
