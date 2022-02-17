import java.util.Scanner;
class divisonunsup  {
    public static void solve() throws UnsupportedOperationException {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            System.out.println("Enter number to be divided:");
            int a = sc.nextInt();
            System.out.println("Enter second number:");
            int b = sc.nextInt();
            if (b == 0) {
                throw new UnsupportedOperationException("canot divide number using Zero");
            }
            int ans = a / b;
            System.out.println("Answer:" + ans);
        } catch (UnsupportedOperationException u) {
            System.out.println(u.getMessage());
            u.printStackTrace();
        } finally {
            if (sc != null)
                sc.close();
        }
    }
}
public class A4Q2 {

	public static void main(String[] args) {
		divisonunsup.solve();

	}

}
