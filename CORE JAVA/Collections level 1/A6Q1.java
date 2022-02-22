import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class info implements Comparable<info>{
	private String name;
	private String mailid;
	private String gender;
	
	public info(String name, String mailid, String gender) {
		super();
		this.name = name;
		this.mailid = mailid;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public String getmailid() {
		return mailid;
	}
	public String getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return "Name:"+name+" mail:"+mailid+" Gender:"+gender;
	}
	@Override
	public int compareTo(info o) {
		return this.getName().compareTo(o.getName());
	}
	
}

class contact implements Comparable<contact>{
	private long number;

	public contact(long number) {
		super();
		this.number = number;
	}
	
	public long getNumber() {
		return number;
	}

	public String toString() {
		return String.valueOf(number);
		
	}
	

	@Override
	public int compareTo(contact o) {
		return this.toString().compareTo(o.toString());
	}
	
	
}
public class A6Q1 {

	public static void main(String[] args) {
		info i1 = new info("Ramesh", "ramesh5star@gmail.com", "Male");
		info i2 = new info("Suresh", "suresh5star@hotmail.com", "Male");
		info i3 = new info("Kamlesh", "kamleshddlj@yahoomail.com", "Male");
		info i4 = new info("Bimlesh", "bimleshji@gmail.com", "Male");
		
		contact c1 = new contact(925656541);
		contact c2 = new contact(1800369555);
		contact c3 = new contact(962458796);
		contact c4 = new contact(766259874);
		
		Map<contact, info> map = new TreeMap<>();
		
		map.put(c1,i1);
		map.put(c2,i2);
		map.put(c3,i3);
		map.put(c4,i4);
		
	
		Set<Entry<contact, info>> entrySet = map.entrySet();

	    int index = 0;
	    for (Entry<contact, info> currentEntry :entrySet) {
	        System.out.println("Keys at " + index + ":"+ currentEntry.getKey());
			index++;
			}
	    int index2=0;
	    for (Entry<contact, info> currentEntry :entrySet) {
	        System.out.println("Values at " + index2 + ":"+ currentEntry.getValue());
			index2++;
			}
	    
        
        for (Entry<contact, info> entry : map.entrySet()) {     
            System.out.println("Keys = " + entry.getKey() +
                             ", Values = " + entry.getValue());
	    	
	    }

	}

}
