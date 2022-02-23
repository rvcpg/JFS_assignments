import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
}
class random{
    @Test
    void run() {
        System.out.println("test-case");
    }
}
public class A7Q1 {

	public static void main(String[] args) {
		random r = new random();
        r.run();

	}

}
