class Generics<G>{
    public G[] swap(G[] a, int i, int j) {
        G temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }

}
public class A5Q3 {

	public static void main(String[] args) {
		Integer arr[] = {0,1,2,3,4};
        Generics<Integer> objGeneric = new Generics<>();
        Integer[] arr1=objGeneric.swap(arr, 0, 2);
        for(int i : arr1) {
            System.out.println(i);
        }

	}

}
