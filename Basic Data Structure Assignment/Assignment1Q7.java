import java.util.Scanner;

class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue)
    {
    	boolean foundvalue=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==toCheckValue)
                foundvalue=true;
        }
        return foundvalue;
    }
}
public class Assignment1Q7 {

	public static void main(String[] args) {
		int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int Check = 21;
    SearchArray searchArray = new SearchArray();

    if (searchArray.searchArray(arr, Check)) {
        System.out.println("Value present");
    } 
	else 
	{
        System.out.println("Value missing");
    }

	}

}
