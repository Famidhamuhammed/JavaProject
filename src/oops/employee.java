package oops;

public class employee {
	public String name;
	public int emplyeeID;
	private static int salary=50000;
	
	
	public employee() {
		System.out.println("inside defaut constructor");
	}
	
	//calling constructor(parametrised)
	
	public employee(String var1,int var2) {
		name=var1;
		emplyeeID=var2;
		System.out.println("inside paramtrsd constructor");
		
		
		
	}
	
	public void Displayname() {
		
		System.out.println("Name of the employee is "+name);
		
		
		
	}
	
	public static void DisplaySalary() {
		System.out.println("salary of all the employee is"+salary);
		
	}
}
