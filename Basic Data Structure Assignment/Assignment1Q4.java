import java.util.Scanner;

class ResultDeclaration{
    public String declareResults(double subject1Marks, double subject2Marks, double subject3Marks) 
    {
    	double total = subject1Marks+subject2Marks+subject3Marks;
    	if( (total<60 || (subject1Marks>60 && subject2Marks<60 && subject3Marks<60)) || (total<60 || (subject2Marks>60 && subject1Marks<60 && subject3Marks<60)) || (total<60 || (subject3Marks>60 && subject2Marks<60 && subject1Marks<60)) ) {
            return "failed";
        }
    	else if(total>60 && ((subject1Marks+subject2Marks >=60) && (subject2Marks+subject3Marks>=60) && subject1Marks+subject3Marks>=60))
            return "Passed";
    	else
            return "passed\npromoted";
    	
    }
}
public class Assignment1Q4 {

	public static void main(String[] args) {
		double subject1Marks,subject2Marks,subject3Marks;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter marks in subject 1: ");
        subject1Marks = sc.nextDouble();

        System.out.println("enter marks in subject 2: ");
        subject2Marks = sc.nextDouble();

        System.out.println("enter marks in subject 3: ");
        subject3Marks = sc.nextDouble();
        ResultDeclaration rd = new ResultDeclaration();
        System.out.println(rd.declareResults(subject1Marks,subject2Marks,subject3Marks));

	}

}
