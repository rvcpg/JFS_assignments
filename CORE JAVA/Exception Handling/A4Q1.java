import java.util.Scanner;
public class A4Q1 {

	public static void main(String[] args) {
		Scanner sc = null;
		 try {
	            sc = new Scanner(System.in);
	            System.out.println("Enter number to be divided:");
	            int a = sc.nextInt();
	            System.out.println("Enter the second number:");
	            int b = sc.nextInt();
	            int ans = a/b;
	            System.out.println("The answer is: "+ans);
	        } catch (ArithmeticException e) {
	            System.out.println(e.getMessage());
	            e.printStackTrace();
	        }
	        finally {
	            if(sc != null)
	                sc.close();
	        }


	}

}
