import java.util.*;

class Ci5{
	public static void main(String[]args)
	{
	//CI=P[(1+i)^n-P]
	
		Scanner scan= new Scanner(System.in);
		double P,I,N;
		System.out.println("Enter the Principal amount:");
		P = scan.nextDouble();
		System.out.println("Enter the Interest amount:");
		I = scan.nextDouble();
		System.out.println("Enter the number of compounding period:");
		N = scan.nextDouble();
		
		double Part1= Math.pow(1+(I/100),N);
		double Part2= Part1;
		double Ci =P*Part2;
		System.out.println("Compound Interest="+Ci);
		
	}
}