import java.util.Scanner;
class ArmstrongOrNot {
    public boolean armstrongCheck(int num){
        int og = num;
        int a =0;
        while(og != 0){
            int remainder = og%10;
            a =a+ (int)Math.pow(remainder,3); 
            og = og/10; 
        }

        if(num==a)
            return true;
        else
            return false;
    }
}

public class Assignment1Q1 {

	public static void main(String[] args) {
		ArmstrongOrNot a = new ArmstrongOrNot();
        int num;
        try (Scanner sc = new Scanner(System.in)) {
        	num = sc.nextInt();
        	}

        if(a.armstrongCheck(num)==true){
            System.out.println(num + " is an armstrong number");
        }
        else
        {
            System.out.println(num + " is not an armstrong number");
        }

	}

}
