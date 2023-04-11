public class Main {
    public static void main(String[] args) {

        System.out.println("lets create a BankApp");

        Bank sbiBankAccount = new SBIBankAccount(1000, "saikrsna", "sai123");
        sbiBankAccount.addMoney(100);
        boolean withDrawStatus = sbiBankAccount.withdrawMoney(1300);
        if(boolean.TRUE.equals(withDrawStatus)){
            System.out.println("Sucessfully withdraw money from bank account");
        }else{

        }

        int balance = sbiBankAccount.checkBalance();

        SBIBankAccount sbiBankAcc2 = new SBIBankAccount();
        sbiBankAcc2.setName("saikrishna");
        sbiBankAcc2.setBalance(10000);
        sbiBankAcc2.setPassword("passwrd");

    }
}