public class TestBankAccount {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount();

        account1.deposit("checking", 100000);
        account1.showBalance();

        account1.deposit("saving", 5000);
        account1.showBalance();

        account1.withdraw("checking", 50);
        account1.showBalance();

        account1.withdraw("saving", 50);
        account1.showBalance();

        account1.withdraw("saving", 100000);
        account1.showBalance();

        System.out.println(BankAccount.accountCount());

        System.out.println(account1);
    }
}