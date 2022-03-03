package junit1;

public class junit1 {
    public static double withdraw(double amount) throws  InsufficientFundException {
        double balance = 7000 ;
        try {
            if(balance<amount){
                throw new InsufficientFundException ("Your account has insufficient balance");
            }
            balance -= amount ;
            return balance;
        }
        catch (RuntimeException ru){
            System.out.println("exception");
        }
        return balance;
    }
}
class InsufficientFundException extends Exception {
    public InsufficientFundException(String str)
    {
        super(str);
    }
}