import java.util.ArrayList;
import java.util.List;

class CurrentAccount extends Assignment2Q3 {
    int creditLimit = 2000;
    public CurrentAccount(String name) {
        super(name);
    }
    @Override
    public int withdraw(int amount) {
        if (getCash() > amount) {
            totalDeposits -= amount;
            return -(amount);
        }
        else if((getCash()+creditLimit)>amount){
            this.creditLimit -= amount-totalDeposits;
            totalDeposits -= amount;
            return -(amount);
        }
        else {
            return 0;
        }
    }
    @Override
    public int getCash() {
        return (totalDeposits);
    }
}
class SavingsAccount extends Assignment2Q3 {
    int fixedDepositAmount = 5000;

    public SavingsAccount(String name) {
        super(name);
    }

    @Override
    public int getCash() {
        return (fixedDepositAmount+totalDeposits);
    }
    @Override
    public int withdraw(int amount) {
        if (getCash() > amount) {
            totalDeposits -= amount;
            return -(amount);
        } else {
            return 0;
        }
    }

}
public  class Assignment2Q3 {
    static ArrayList<Integer> totalCashInBank;
    private String name;
    protected int totalDeposits=0;
    public Assignment2Q3(String name) {
        this.name = name;
    }
    public int deposit(int amount) {
        this.totalDeposits += amount;
        return amount;
    }
    public int withdraw(int amount) {
        if (totalDeposits > amount) {
            totalDeposits -= amount;
            return -amount;
        } else {
            return 0;
        }
    }
    public static int totalCashInBank(ArrayList<Integer> cash){
        int total = 0;
        for(int i =0;i<cash.size();i++){
            total += cash.get(i);
        }
        return total;
    }
    public int getCash(){
        return totalDeposits;
    }
    public static void main(String[] args) {
        totalCashInBank = new ArrayList<Integer>();
        Assignment2Q3 account1 = new SavingsAccount("acct1");
        Assignment2Q3 account2 = new CurrentAccount("acct2");
        SavingsAccount account3 = new SavingsAccount("acct3");
        CurrentAccount account4 = new CurrentAccount("acct4");
        totalCashInBank.add(account1.deposit(900));
        totalCashInBank.add(account2.deposit(3450));
        totalCashInBank.add(account3.deposit(3490));
        totalCashInBank.add(account4.deposit(980));
        totalCashInBank.add(account3.withdraw(870));
        totalCashInBank.add(account2.withdraw(1000));
        System.out.println(totalCashInBank((totalCashInBank)));
        }
    }