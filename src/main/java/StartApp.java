

public class StartApp {

    public static void main(String[] args) {
        Account account = new Account(new Statement());

        account.deposit(Amount.amountOf(1000), DateFormater.date("10-01-2021"));
        account.deposit(Amount.amountOf(2000), DateFormater.date("13-01-2021"));
        account.withdraw(Amount.amountOf(500), DateFormater.date("14-01-2021"));

//        account.printStatement(System.out);
    }

}
