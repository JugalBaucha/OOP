import java.util.*;


class MonthsD11{
	
	public static void main(String[]args)
	{
		Scanner scan= new Scanner(System.in);
		int days;
		int input;
		System.out.println("Enter the month:");
		input = scan.nextIn();
		if(input ==1 ||input ==3||input ==5||input ==7||input ==8||input ==12||input ==10 )
		{
			System.out.println("31 Days");
		}
		else if(input ==4||input ==6||input ==11||input ==9||)
		{
			System.out.println("30 Days");
		}
		else if(input ==2)
		{
			System.out.println("Either 29 or 28 days");
		}
		else
		{
			System.out.println("1-12 months only");
		}
	}
	
}