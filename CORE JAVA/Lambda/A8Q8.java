import java.util.ArrayList;
import java.util.Arrays;

public class A8Q8 {
    public static void main(String[] args) {
        ArrayList <Integer> j = new ArrayList<>(Arrays.asList(10,20,30,40,50,60,70,80,90));
        new Thread(() -> System.out.println(j)).start(); 
    }
}