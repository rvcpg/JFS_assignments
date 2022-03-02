Var keyword cannot be used in the scenarios given below:
	*cannot be used in an instance and global variable declaration.
class IV {
  
    // instance variable
    var x = 50;
    public static void main(String[] args)
    {
        System.out.println(x);
    }
}
        *var cannot be used as a Generic type
import java.util.*;
class GT {
    public static void main(String[] args)
    {
          // Generic list using var
        var<var> al = new ArrayList<>();
            
        al.add(10);
        al.add(20);
        al.add(30);
        
        System.out.println(al);
    }
}
        *var cannot be used with the generic type.
import java.util.*;
class GT {
    public static void main(String[] args)
    {
          // var used with Generic type
        var<Integer> al = new ArrayList<Integer>();
         
        al.add(10);
        al.add(20);
        al.add(30);
        
        // print the list
        System.out.println(al);
        
          var list = new ArrayList<String>();
    }
}
        * var cannot be used without explicit initialization.
import java.io.*;
  
class EI {
    public static void main(String[] args)
    {
  
        // declaration without
        // initialization
        var variable;
          
          // This is also not valid
        var variable = null;
    }
}
	*cannot be used with a LAMBDA expression.
import java.util.*;
  
interface myInt {
    
    int add(int a, int b);
}
class LE {
    public static void main(String[] args)
    {
        
          // var cannot be used since they
          // require explicit target type
        var obj = (a, b) -> (a + b);
  
          // calling add method
        System.out.println(obj.add(2, 3));
    }
}
        *var cannot be used for method parameters and return type.
class MR {
  
    // method1 using var
    // as a return type
    var method1() { return ("Inside Method1"); }
  
    // method2 using var for a
    // parameter
    void method2(var a) { System.out.println(a); }
  
    public static void main(String[] args)
    {
  
        // create an instance
        Demo1 obj = new Demo1();
  
        // call method1
        var res = obj.method1();
  
        // call method2
        obj.method2();
    }
}
