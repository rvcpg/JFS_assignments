import java.util.*;
class Employee
{
	int id,sal;
	String name,dept;
	public Employee(int id, String name, String dept, int sal) {
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.sal=sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return sal;
	}
	public void setSalary(int sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + sal + ", name=" + name + ", dept=" + dept + "]";
	}
	
}
class IdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getId()-e2.getId();
	}
}
class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
}
class DeptComparator implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2){
        return e1.getDept().compareTo(e2.getDept());
    }
}
class SalaryComparator implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2){
        return e1.getSalary()-e2.getSalary();
    }
}

public class A6Q3 {

	public static void main(String[] args) {
		System.out.println("Select an Action");
		System.out.println("a) Id\nb) Name\nc) Post\nd) Salary");
		
		Scanner sc=new Scanner(System.in);
		String select=sc.nextLine();
		
		if(select.equals("a"))
		{
			TreeSet<Employee> emp=new TreeSet<>(new IdComparator());
			emp.add(new Employee(101,"jethalal","business",100000));
            emp.add(new Employee(102,"mehta","writer",75000));
            emp.add(new Employee(103,"bhide","teacher",40000));
            emp.add(new Employee(104,"hathi","doctor",80000));
            emp.add(new Employee(105,"abdul","shopkeeper",60000));
            emp.add(new Employee(106,"popatlal","reporter",85000));
            emp.add(new Employee(107,"iyer","scientist",45000));
            for (Employee employee : emp) {
				System.out.println(employee.toString());
			}
		}
		else if(select.equals("b"))
		{
			TreeSet<Employee> emp=new TreeSet<>(new NameComparator());
			emp.add(new Employee(101,"jethalal","business",100000));
            emp.add(new Employee(102,"mehta","writer",75000));
            emp.add(new Employee(103,"bhide","teacher",40000));
            emp.add(new Employee(104,"hathi","doctor",80000));
            emp.add(new Employee(105,"abdul","shopkeeper",60000));
            emp.add(new Employee(106,"popatlal","reporter",85000));
            emp.add(new Employee(107,"iyer","scientist",45000));
            for (Employee employee : emp) {
				System.out.println(employee.toString());
			}
		}
		else if(select.equals("c"))
		{
			TreeSet<Employee> emp=new TreeSet<>(new DeptComparator());
			emp.add(new Employee(101,"jethalal","business",100000));
            emp.add(new Employee(102,"mehta","writer",75000));
            emp.add(new Employee(103,"bhide","teacher",40000));
            emp.add(new Employee(104,"hathi","doctor",80000));
            emp.add(new Employee(105,"abdul","shopkeeper",60000));
            emp.add(new Employee(106,"popatlal","reporter",85000));
            emp.add(new Employee(107,"iyer","scientist",45000));
            for (Employee employee : emp) {
				System.out.println(employee.toString());
			}
		}
		else if(select.equals("d"))
		{
			TreeSet<Employee> emp=new TreeSet<>(new SalaryComparator());
			emp.add(new Employee(101,"jethalal","business",100000));
            emp.add(new Employee(102,"mehta","writer",75000));
            emp.add(new Employee(103,"bhide","teacher",40000));
            emp.add(new Employee(104,"hathi","doctor",80000));
            emp.add(new Employee(105,"abdul","shopkeeper",60000));
            emp.add(new Employee(106,"popatlal","reporter",85000));
            emp.add(new Employee(107,"iyer","scientist",45000));
            for (Employee employee : emp) {
				System.out.println(employee.toString());
			}
		}


	}

}
