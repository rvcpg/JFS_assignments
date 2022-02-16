abstract class Persistence {
    abstract public String per();
}
class FilePersistence extends Persistence{
    @Override
    public String per() {
    	return "File persistence";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String per() {
    	return "Database persistence";
    }
}
public class Assignment2Q6 {
	public static void main(String[] args) {
		
		Persistence p = new Persistence();
		
	}

}