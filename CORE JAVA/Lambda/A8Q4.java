import java.util.ArrayList;
import java.util.Arrays;

public class A8Q4 {
    public static void main(String[] args) {
        ArrayList<String> employeeList = new ArrayList<String> (Arrays.asList("Papa ranjit","ranjitji", "chacha ranjit", "dada rojgit", "kaka ranjit"));
        employeeList.removeIf(s -> ((s.length())%2 != 0));
        System.out.println(employeeList);
    }
}