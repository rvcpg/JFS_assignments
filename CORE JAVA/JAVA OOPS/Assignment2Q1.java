import java.util.Objects;

class SingletonInheritanceCheck{
    public static void Check(Singleton a, Singleton b) {
        if(Objects.equals(a, b)){
            System.out.println("Checking for singleton inheritance");}

        else {
            System.out.println("Not a singleton class");
        }
    }
}
class Singleton
{
    private static Singleton instance;
    public String s;
    private Singleton()
    {
        s = "Singleton class";
    }
    public static Singleton getInstance()
    {
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
    public static void main(String args[])
    {
        Singleton ft = Singleton.getInstance();
        Singleton st = Singleton.getInstance();
        System.out.println(ft.s);
        System.out.println(st.s);
        SingletonInheritanceCheck.Check(ft,st);
    }
}
