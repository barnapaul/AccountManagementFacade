public class User {

    private String name;
    private Account account;

    public Account getAccount() {
        return account;
    }



    public User(String name, Account account) {
        this.name = name;
        this.account = account;
    }



    public String getName() {
        return name;
    }
}
