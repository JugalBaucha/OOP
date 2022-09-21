import java.util.*;
class MarkSheet10{
	
	public static void main(String[]args)
	{
		Scanner scan= new Scanner(System.in);
		
		System.out.println("MARK FOR SUB1: ");
		double sub1= scan.nextDouble();
		System.out.println("MARK FOR SUB2: ");
		double sub2= scan.nextDouble();
		System.out.println("MARK FOR SUB3: ");
		double sub3= scan.nextDouble();
		System.out.println("MARK FOR SUB4: ");
		double sub4= scan.nextDouble();
		System.out.println("MARK FOR SUB5: ");
		double sub5= scan.nextDouble();

		double total= sub1+sub2+sub3+sub4+sub5;
		double per=total/5;
		double PM=35.00;
		if(sub1>PM && sub2>PM && sub3>PM && sub4>PM && sub5>PM)
		{
			System.out.println("Percentage: "+per+"%");
			if(per>=80)
			{
				System.out.println("Division: Distinction");
			}
			else if(per>=70 && per<80)
			{
				System.out.println("Division: First");
			}
		}
		
		else
		{
			System.out.println("FAIL");
		}
		
	}
}