import java.util.Scanner;

class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
double simp = (principalAmount*time*interestRate)/100;
        
        return  simp;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
       
        double comp = (principalAmount * (Math.pow((1+interestRate /100),time)));

        return comp;
    }
}


public class Assignment1Q3 {

	public static void main(String[] args) {
		SiCi SiCo = new SiCi();
	 	double principalAmount,interestRate;
     	int time;
        System.out.println("Enter the principal Amount: ");
        Scanner sc = new Scanner(System.in);
        principalAmount = sc.nextDouble();
        System.out.println("Enter the Annual interest rate: ");
        interestRate = sc.nextDouble();
        System.out.println("Enter the period of time(in years): ");
        time = sc.nextInt();


        System.out.println("The simple interest for the principal Amount "+principalAmount+" for "+time+" years: "+SiCo.simpleInterest(principalAmount,time,interestRate));

        System.out.println("The compound interest for the principal Amount "+principalAmount+" for "+time+" years: "+SiCo.compoundInterest(principalAmount,time,interestRate));

	

	}

}
