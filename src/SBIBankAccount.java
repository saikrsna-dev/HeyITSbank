import java.util.UUID;

public class SBIBankAccount implements Bank{
    private int balance;
    private String name;
    private int roi;
    private String password;
    private String accountNumber;



    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoi(int roi) {
        this.roi = roi;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoi() {
        return roi;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public SBIBankAccount() {
        this.balance = 0;
        this.name = "defaultName";
        this.password = "password";
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.roi = 5;
    }

    public SBIBankAccount(int balance, String name, String password) {
        this.balance = balance;
        this.name = name;
        this.password = password;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.roi = 5;
    }

    public SBIBankAccount(String name, String password) {
        this.name = name;
        this.password = password;
        this.balance = 0;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.roi = 5;
    }

    @Override
    public int checkBalance() {
        return this.balance;
    }

    @Override
    public boolean addMoney(int money) {
        this.balance += money;
        return true;
    }

    @Override
    public boolean withdrawMoney(int money) {
        if(this.balance < money)return false;
        this.balance -= money;
        return true;
    }


    @Override
    public int getROI() {
        return this.roi;
    }

    @Override
    public int totalInterest(int loanAmount, int timeInyears) {
        return loanAmount * roi * timeInyears / 100;}
}
