package oops;

public class citizen extends person{
	
	public int SSN;
	 public citizen() {
		
		 
		 System.out.println("inside default constructor of citizen");
		 
	 }
	 
	public citizen(String name,int age,String countryname, int SSN) {
		
		System.out.println("inside parametzd constr citizen");
	  this.Name = name;
	  this.age =age;
	  this.CountryName=countryname;
	  this.SSN= SSN;
	  
		
		
	}
	public void print() {
		System.out.println("SSN is "+SSN);
		
		
	}




}
