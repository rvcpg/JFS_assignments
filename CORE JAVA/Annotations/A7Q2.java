import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface info{
    int AuthorID();
    String Author() default"Ravi";
    String Supervisor() default"Nil";
    String Date();
    String Time();
    float Version();
    String Description() default"Unknown";
}
@info(AuthorID=420,Date="23-02-2022",Time="09:40",Version=420)

class dev{
    int AuthorID;
    String Author ;
    String Supervisor ;
    String Date;
    String Time;
    float Version;
    String Description;
    public dev(int AuthorID, String Date, String Time, float Version) {
        this.AuthorID = AuthorID;
        this.Date = Date;
        this.Time = Time;
        this.Version = Version;
    }
    String dev() {
       return  "Hey There!";
    }
}
public class A7Q2 {

	public static void main(String[] args) {
		dev rvcpg = new dev(7,"22-02-2022","9.40",7);
        rvcpg.dev();
        Class a = rvcpg.getClass();
        java.lang.annotation.Annotation p = a.getAnnotation(info.class);
        info i = (info)p;
        System.out.println(i);


	}

}
