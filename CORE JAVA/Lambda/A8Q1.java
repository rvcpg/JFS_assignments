@FunctionalInterface
interface calc {
    public void doCalc();
}
public class A8Q1 {

	public static double addition(int a, int b) {
	      return (a+b);
	    }
	    public static double subtraction(int a, int b){
	        return (a-b);
	    }
	    public static double multiplication(int a,int b){
	        return (a*b);
	    }
	    public static double division(int a, int b){
	        return (a/b);
	    }
	    public static void main(String[] args) {
	        int a = 100 ;
	        int b = 5;
	        calc cAdd  = () -> {
	            System.out.println("Result of...");
	            System.out.println("sum of numbers is :"+ addition(a,b));
	            System.out.println("subtraction of numbers is :"+ subtraction(a,b));
	            System.out.println("Multiplication of numbers is :"+ multiplication(a,b));
	            System.out.println("division of numbers is is :"+ division(a,b));
	        };
	        cAdd.doCalc();

	}

}
