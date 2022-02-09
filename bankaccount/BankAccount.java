import java.util.Random;

public class BankAccount{
    private double checkingBalance;
    private double savingBalance;
    private String accountNumber;
    private static int account = 0;
    private static double totalMoney = 0;

    public BankAccount(){
        genAccNumber();
        account++;
    }

    public double getChecking(){
        return checkingBalance;
    }

    public void setChecking(double checkingBalance){
        this.checkingBalance = checkingBalance;
    }

    public double getSaving(){
        return savingBalance;
    }

    public void setSaving(double savingBalance){
        this.savingBalance = savingBalance;
    }

    public static int accountCount(){
        return account;
    }

    public static double totalBalance(){
        return totalMoney;
    }

    public void deposit(String accountType, double amount){
        if(accountType == "checking"){
            this.checkingBalance += amount;
        } else if(accountType == "saving"){
            this.savingBalance += amount;
        }
        totalMoney += amount;
    }

    public void withdraw(String accountType, double amount){
        if(accountType == "checking" && getChecking() >= amount){
            setChecking(getChecking() - amount);
            totalMoney -= amount;
        } else if(accountType == "saving" && getSaving() >= amount){
            setSaving(getSaving() - amount);
            totalMoney -= amount;
        } else {
            System.out.println("You're Broke");
        }
    }

    public void showBalance(){
        System.out.println("Total money: " + getChecking() + getSaving());
    }

    private String genAccNumber(){
        Random accNum = new Random();
        this.accountNumber = new String();
        for(int i = 0; i < 10; i++){
            int randomNum = accNum.nextInt(10);
            this.accountNumber += randomNum;
        }
        return this.accountNumber;
    }

}