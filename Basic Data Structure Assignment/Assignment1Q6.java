import java.util.Scanner;

class Login{
    String userId = "Ravi", password = "password";
    int logintry =3;
    public String loginUser(String user, String pass) 
    {
    	if(user.equals(userId) && pass.equals(password))
    	{
    		return "true";
    	}
    	else
    	{
    		return "false";
    	}
    	
    }

}
public class Assignment1Q6 {

	public static void main(String[] args) {
		Login l = new Login();

        String userId,password;


        Scanner sc = new Scanner(System.in);

        int logintry =0;
        while(true) {
            System.out.println("Enter userId");
            userId = sc.next();

            System.out.println("Enter password");
            password = sc.next();
            String result = l.loginUser(userId, password);
            if(result.equals("true")){
                System.out.println("Welcome "+userId);
                break;
            }
            else{
                logintry++;
                if(logintry==3) {
                    System.out.println("You have entered wrong credentials 3 times");
                    System.out.println("Contact Admin");
                    break;
                }
                System.out.println("You have entered the wrong credentials ,please enter the right credentials to login.");


            }
        }

	}

}
