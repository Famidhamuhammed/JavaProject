package oops;

public class insurance extends citizen{
	public int insuranceID;
	
public insurance() {
	super();
	System.out.println("inside default const of insurance");
}

	

public void Print() {
	
	super.print();
	
	System.out.println("insurance ID is "+insuranceID);
}
public void Print(String message) {

	System.out.println("typing some message "+message);
}
}
	
	
	

