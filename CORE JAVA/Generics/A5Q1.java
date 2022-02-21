import java.util.HashSet;
import java.util.Set;
import java.util.*;
class Employees
{
    int id,Salary;
    String Name,Dept;
    public Employees(int id,String Name, int Salary, String Dept)
    {
        super();
        this.id=id;
        this.Name=Name;
        this.Salary=Salary;
        this.Dept=Dept;
    }



    public String display() {
        return "Employees [id=" + id + ", Salary=" + Salary + ", empName=" + Name + ", empDept=" + Dept
                + "]";
    }
}
public class A5Q1 {

	public static void main(String[] args) {
		Employees e1=new Employees(1," Ravi",30000," Analyst");
        Employees e2=new Employees(2," Verma",40000," Data scientist");
        Employees e3=new Employees(3," Kumar",100000," CEO");
        Employees e4=new Employees(4," Aradhya",200000," MD");
        HashSet<Employees> employees= new HashSet<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        for (Employees e : employees) {
            System.out.println(e.display());

        }

	}

}
