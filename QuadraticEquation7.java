import java.util.*;

class QuadraticEquation7{
	public static void main(String[]args)
	{
		//X=-b+sqrrt(b^2-4ac/2a)
		double a,b,c;
		double X;
		
		Scanner scan= new Scanner(System.in);
		double part1;
		double part2;
		
		System.out.println("Enter A:");
		a= scan.nextDouble();
		
		System.out.println("Enter B:");
		b= scan.nextDouble();
		
		System.out.println("Enter C:");
		c= scan.nextDouble();
		
		part1=(b*b)-(4*a*c)/(2*a);
		part2=-b+Math.sqrt(part1);
		
		System.out.println("Equation:"+part2);
	}
}