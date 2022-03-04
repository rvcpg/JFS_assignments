import java.time.LocalDate;
import java.util.HashMap;
class date{
    LocalDate d ;

    public date(LocalDate d) {
        this.d = d;
    }

    public LocalDate getDate() {
        return d;
    }

    @Override
    public String toString() {
        return "date= " + d;
    }
}
public class EQ6 {

	public static void main(String[] args) {
		HashMap<date, String> s = new HashMap<>();
        s.put( new date(LocalDate.of( 2000 , 10 , 29 )),"ajay");
        s.put( new date(LocalDate.of( 2000 , 9 , 24)),"vijay");
        s.put( new date(LocalDate.of( 2013 , 10 , 17 )),"ranvijay");
        System.out.println(s);

	}

}
