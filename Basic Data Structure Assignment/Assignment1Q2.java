import java.util.ArrayList;
import java.util.Scanner;

class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){
    	ArrayList<Integer> totalarmstrongNumbers = new ArrayList<>();
 
        for(int i = min;i<=max;i++){
            if(armstrongCheck(i))
                totalarmstrongNumbers.add(i);

        }
        int [] arrayOfArmNum = new int[totalarmstrongNumbers.size()];
        int i=0;

       for(Integer ele:totalarmstrongNumbers){
           arrayOfArmNum[i] =ele;
           i++;
       }
         return  arrayOfArmNum;

}
    
        public boolean armstrongCheck(int num){
            int original = num;
            int arm =0;
            while(original!=0){
                int remainder = original%10;
                arm =arm+ (int)Math.pow(remainder,3); 
                original = original/10; 
            }

            if(num==arm)
                return true;
            else
                return false;
        }
    }
public class Assignment1Q2 {

	public static void main(String[] args) {
		int min =100;
        int max=999;

        ArmstrongNumBetweenRange a = new ArmstrongNumBetweenRange();
        int[] res = a.armstrongNumbersInRange(min,max);

        for(int i:res){
            System.out.print(i+" ");
        }

	}

}
