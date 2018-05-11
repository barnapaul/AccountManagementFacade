public class MainAccountManagement {


    public static void main(String[] args) {


        User paulAccount =  new User("Paul",new Account(123,30000));
        System.out.print("\t    Hi, " + paulAccount.getName() + "\n");

        AccountManagementFacade accessToAccount =
                new AccountManagementFacade(paulAccount.getAccount().getAccountNumber(),paulAccount.getAccount().getCashInAccount());

        accessToAccount.withdrawCash(50.00);

        accessToAccount.withdrawCash(950.00);

        accessToAccount.depositCash(1001.00);

        accessToAccount.withdrawCash(30002.00);

        accessToAccount.savings(5);


        User mariusAccount =  new User("Marius",new Account(321,25050));
        System.out.print("\n\tHi, " + mariusAccount.getName() + "\n");

        AccountManagementFacade accessToMariusAccount =
                new AccountManagementFacade(mariusAccount.getAccount().getAccountNumber(),mariusAccount.getAccount().getCashInAccount());

        accessToMariusAccount.withdrawCash(50.00);

        accessToMariusAccount.withdrawCash(1000.00);

        accessToMariusAccount.depositCash(7000.00);

        accessToMariusAccount.withdrawCash(3000.00);

        accessToMariusAccount.savings(2);

    }


}
