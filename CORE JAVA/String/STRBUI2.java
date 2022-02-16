public class STRBUI2 {
	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder("It is used to _        at the specified index position");
		str.replace(14, 22, "insert text");
		
		System.out.println(str);

	}

}