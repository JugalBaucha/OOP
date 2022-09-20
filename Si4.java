import java.util.*;

class Si4{
	public static void main(String[]args){
		double principle,time,rate;
		Scanner scan = new Scanner(System.in);
		System.out.println("PRINCIPAL:");
		principle = scan.nextDouble();
		System.out.println("Rate:");
		rate = scan.nextDouble();
		System.out.println("Time:");
		time = scan.nextDouble();
		
		
		double Si= (principle+time+rate)/100;
		System.out.println(Si);
	}
}