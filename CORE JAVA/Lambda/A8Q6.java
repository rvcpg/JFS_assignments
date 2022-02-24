import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.UnaryOperator;

class  convertToUpperCase implements UnaryOperator<String>
{
    @Override
    public String apply(String t) {
        return t.toUpperCase();
    }
}
public class A8Q6
{
    public static void main(String[] args)  {
        ArrayList<String> a = new ArrayList<>(Arrays.asList("RaVi", "KuMaR", "JiGnEs", "DiNeS"));
        System.out.println("Before Convertion  : "+a+"\n");
        a.replaceAll( new convertToUpperCase());
        System.out.println("After Convertion  : "+a+"\n");

    }

}

