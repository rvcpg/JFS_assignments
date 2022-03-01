@FunctionalInterface
interface Func<F1,F2,F3,L> {
     L apply(F1 f1, F2 f2, F3 f3);
}
public class A10Q1 {

	public static void main(String[] args) {
		Func <Integer,Integer,Integer,Integer>  i = ( var p,var t,var r) -> (p*(1+(t*r)));
        System.out.println(i.apply(100,5,10));
	}

}
