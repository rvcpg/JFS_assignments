import java.util.LinkedList;
import java.util.List;
public class A6Q4 {

	public static void main(String[] args) {
		List<String> date = new LinkedList<>();
		date.add("29-10-2000");
		date.add("17-10-2013");
		date.add("12-03-1960");
		date.add("24-09-1968");
			for(String it : date) 
			{
				String[] str = it.split("-");
				if((int)Integer.parseInt(str[2])%4==0)
				{
					if((int)Integer.parseInt(str[2])%100==0) 
					{
						if((int)Integer.parseInt(str[2])%400==0)
							System.out.println("Your Date of Birth is "+it+" and it was Leap Year");
						else {
							System.out.println("Your Date of Birth is "+it+" and it was not Leap Year");
						}
					}
					else {
						System.out.println("Your Date of Birth is "+it+" and it was Leap Year");
					}				
				}
				else {
					System.out.println("Your Date of Birth is "+it+" and it was not Leap Year");
				}
			}

	}

}
