package test;

public class arrayexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {10,20,30,40,50,60,80,90,100};
		System.out.println("the length of the array is"+arr1.length);
		System.out.println("the first value in the array is"+arr1[0]);
		System.out.println("the last value in the array is"+arr1 [arr1.length-1]);
		System.out.println("the middle value of the array is"+arr1 [arr1.length/2]);
		
        String[] arr2 = {"Mon","Tue","Wed","Thu","Fri"};
		
		System.out.println("Value at third position is " + arr2[2]);
		
		String str = "clean world green world healthy world";
		String[] arr3 = str.split(" ");
		System.out.println("the total number of words inside the string is "+arr3.length);
		;
		
		
		
		

	}
		
		

	

	}


