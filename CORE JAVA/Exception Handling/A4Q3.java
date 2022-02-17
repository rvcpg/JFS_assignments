class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String str)
    {
        super(str);
    }
}
class IllegalBankTransactionException extends InsufficientBalanceException {

    public IllegalBankTransactionException(String str) {
        super(str);
    }
}
class  SA{
    private final long id ;
    private double bal  ;
    public SA(long id,double bal){
        this.id=id;
        this.bal=bal;
    };
    public  double withdraw(double amt) throws RuntimeException {
        try {
            if(bal<amt){
                throw new InsufficientBalanceException ("Account low in cash");
            }
            bal -= amt ;
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return  bal ;
    }
public  double deposit(double amt) throws RuntimeException {
    try {
        if(amt<=0){
            throw new IllegalBankTransactionException("Note: Amount should be greater than Rs 0");
        }
        bal -= amt ;
    }
    catch (IllegalBankTransactionException ez) {
        System.out.println(ez.getMessage());
        ez.printStackTrace();
    }
    finally {
        bal = bal ;
    }
    return  bal ;
        }
    public  double getBalance()  {
        return  bal ;
    }
}

public class A4Q3 {

	public static void main(String[] args) {
		 SA Ravi = new SA(7,4000);
	        Ravi.deposit(1000);
	        Ravi.withdraw(2000);
	        System.out.println(Ravi.getBalance());
	}

}
