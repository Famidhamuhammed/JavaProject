package test;

public class stringexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr2 = {"Mon","Tue","Wed","Thu","Fri"};
		
		System.out.println("Value at third position is " + arr2[2]);
		
		
		String str = "Clean World Green World Happy World";
		
		String[] arr3 = str.split(" ");  // {"Clean","World","Green","World"}
		
		System.out.println("Total num of words inside the string is " + arr3.length);

	}

}
