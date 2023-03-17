package test;

import java.util.Scanner;

public class conditionexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		
		Scanner scanner=new Scanner (System.in);
		
		System.out.println("enter the age");
		
		age = scanner.nextInt();
				
		if(age<18) {
			
			System.out.println("not eligible for voting");
		
		}
		else if(age>=18){
			System.out.println("eligible for voting");
			
		}
		else if(age==17){
			System.out.println("you are eligibile for voting next year");
			
		}
		scanner.close();
		

	}

}
