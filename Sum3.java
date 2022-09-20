//WAP TO FIND THE SUM OF TWO INTEGERS WITH USER INPUT AND //DISPLAY IT

import java.util.*;

class Sum3{
	public static void main(String[]args)
	{
		int num1,num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("NUM1:");
		num1= scan.nextInt();
		System.out.println("NUM2:");
		num2= scan.nextInt();
		int sum= num1+num2;
		
		
		System.out.println("Sum is:"+sum);
		
	}
}

