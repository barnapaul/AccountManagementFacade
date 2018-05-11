public class AccountManagementFacade extends Account {

    FundsCheck fundChecker;
    Savings savings;


    public AccountManagementFacade(int accountNumber, double cashInAccount) {
        super(accountNumber, cashInAccount);

        fundChecker = new FundsCheck(accountNumber,cashInAccount);
        savings = new Savings(accountNumber,cashInAccount);

    }


    public void withdrawCash(double cashToGet){

        if(fundChecker.haveEnoughMoney(cashToGet)) {

            System.out.println("Transaction Complete\n");

        } else {

            System.out.println("Transaction Failed\n");

        }

    }

    public void savings(int nrOfMonths){
        savings.calculateInterest(nrOfMonths);
    }


    public void depositCash(double cashToDeposit){



            fundChecker.makeDeposit(cashToDeposit);

            System.out.println("Transaction Complete\n");




    }
}
