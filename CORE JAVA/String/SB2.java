public class SB2 {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("It is used to _        at the specified index position");
		str.replace(14, 22, "insert text");
		
		System.out.println(str);

	}

}