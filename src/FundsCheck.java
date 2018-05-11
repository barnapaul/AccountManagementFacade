public class FundsCheck extends Account {

   double cashInAccount = getCashInAccount();

    public FundsCheck(int accountNumber, double cashInAccount) {
        super(accountNumber, cashInAccount);
    }


    public void decreaseCashInAccount(double cashWithdrawn) {
        cashInAccount -= cashWithdrawn;
    }

    public void increaseCashInAccount(double cashDeposited) {
        cashInAccount += cashDeposited;
    }

    public boolean haveEnoughMoney(double cashToWithdrawal) {

        if (cashToWithdrawal > getCashInAccount()) {

            System.out.println("Error: You don't have enough money");
            System.out.println("Current Balance: " + cashInAccount);

            return false;

        } else {

            decreaseCashInAccount(cashToWithdrawal);

            System.out.println("Withdrawal Complete: Current Balance is " + cashInAccount);

            return true;

        }

    }

    public void makeDeposit(double cashToDeposit) {

        increaseCashInAccount(cashToDeposit);

        System.out.println("Deposit Complete: Current Balance is " + cashInAccount);

    }

}