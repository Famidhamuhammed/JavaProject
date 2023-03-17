package oops;


public class runnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*employee emp1 = new employee();
		emp1.name="Famidha";
		emp1.emplyeeID=2000;
		emp1.Displayname();
		
		employee emp2 = new employee();
		emp2.name="anoop";
		emp2.emplyeeID=65000;
		emp2.Displayname();
		
		//using constr easy code
		employee emp3= new employee("Ehaan",75000);
		emp3.Displayname();
		employee.DisplaySalary();*/
		
		
		
		System.out.println("***creating ct1");
		citizen ct1=new citizen();
		ct1.age=50;
		ct1.Name = "Mike";
		ct1.SSN = 12345;
		ct1.CountryName ="India";
		ct1.print();
		
		
		
		
		citizen ct2 = new citizen("anoop",35,"india",19010);
		ct1.print();
		
		insurance obj1 =new insurance();
		obj1.insuranceID =3000;
	    obj1.SSN=9999;
	   
	    obj1.Print();
	    obj1.Print("hello class");
	    
	    
	    Encapsulationexample emp= new Encapsulationexample();
	    emp.setSalary(5000);
	    
	    System.out.println("the salary is "+emp.getSalary());
	    
	    		
		
		
		
		
		
				
				
				
				
				
				
				
		
		
		
	
		
		

	}

}
