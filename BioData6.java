import java.util.*;
class BioData6{
	public static void main(String[]args)
	{
		String name;
		String gen;
		int year,m,d;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Your Name:");
		name= scan.nextLine();
		System.out.println("Enter Your Gender:");
		gen= scan.nextLine();
		System.out.println("Enter Your Birth Year:");
		year= scan.nextInt();
		System.out.println("Enter Your Birth Month:");
		m= scan.nextInt();
		System.out.println("Enter Your Birth Day:");
		d= scan.nextInt();
		
		//Printing
		
		System.out.println("\nNAME:"+name);
		System.out.println("SEX:"+gen);
		System.out.println("DOB:"+year+"."+m+"."+d);
	}
}