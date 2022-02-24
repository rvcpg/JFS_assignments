import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Fruit {
	private String name;
    private int calories;
    private int price;
    private String color;
    public Fruit(String name, int calories, int price, String color) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
public class A9Q1 {
    public static List<String> reverseSort(ArrayList<Fruit> fruits) {
        ArrayList<Fruit> rSort = fruits.stream()
                .filter(p -> p.getCalories() < 100)
                .sorted(Comparator.comparingInt(Fruit::getCalories).reversed())
                .collect(Collectors.toCollection(ArrayList::new));
        List<String> rSortNames = new ArrayList<>();
        rSort.forEach(p -> rSortNames.add(p.getName()));
        return rSortNames;
    }

    public static ArrayList<Fruit> sort(ArrayList<Fruit> fruits) {
        fruits=fruits.stream()
                .sorted(Comparator.comparing(Fruit::getColor))
                .collect(Collectors.toCollection(ArrayList::new));
        return fruits;
    }
    public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits){
        fruits=fruits.stream()
                .filter(p->p.getColor().equals("red"))
                .sorted(Comparator.comparingInt(Fruit::getPrice))
                .collect(Collectors.toCollection(ArrayList::new));
        return fruits;
    }

    public static void main(String[] args) {
        ArrayList <Fruit> fList = new ArrayList<Fruit>();
        fList.add(new Fruit("Apple", 52, 100, "red"));
        fList.add(new Fruit("Banana", 89, 40, "yellow"));
        fList.add(new Fruit("Cherry", 50, 80, "red"));
        fList.add(new Fruit("Dates", 282, 120, "black"));
        fList.add(new Fruit("Elderberry", 100, 200, "black"));
        System.out.println("Reverse sort by calories");
        System.out.println(reverseSort(fList)+"\n");
        System.out.println("sort by colour");
        System.out.println(sort(fList)+"\n");
        System.out.println("sort by red colour and price by ascending");
        System.out.println(filterRedSortPrice(fList));
    }


}
