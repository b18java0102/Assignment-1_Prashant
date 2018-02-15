package OOPs;

public class Employee {
	int id;
	float Salary;
	String name;
	final static String Department= "Java";
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.id=1;
		e1.Salary=50000;
		e1.name="Prashant";
		Employee e2=new Employee();
		e2.id=2;
		e2.Salary=60000;
		e2.name="Sahil";
		Employee e3=new Employee();
		e3.id=3;
		e3.Salary=70000;
		e3.name="Chanderhass";
		
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.Salary);
		System.out.println(Employee.Department);
		
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.Salary);
		System.out.println(Employee.Department);
		
		System.out.println(e3.id);
		System.out.println(e3.name);
		System.out.println(e3.Salary);
		System.out.println(Employee.Department);
	}

}
