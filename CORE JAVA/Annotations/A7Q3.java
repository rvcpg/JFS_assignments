import java.lang.reflect.*;
import java.util.*;
import java.lang.annotation.*;

    class MyClass {

        @execute(sequence=2)
        public void myMethod1()
        {
            System.out.println("1");
        }
        @execute(sequence=1)
        public void myMethod2()
        {
            System.out.println("2");
        }

        @execute(sequence=3)
        public void myMethod3()
        {
            System.out.println("3");
        }
    }
    public class A7Q3 {
        public static void main(String args[])throws Exception{

            MyClass n = new MyClass();
            Method a= n.getClass().getMethod("myMethod1");
            Method b= n.getClass().getMethod("myMethod2");
            Method c= n.getClass().getMethod("myMethod3");
            execute a1E= a.getAnnotation(execute.class);
            execute b1E = b.getAnnotation(execute.class);
            execute c1E = c.getAnnotation(execute.class);
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }