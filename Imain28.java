import java.util.*;
class Factorial{
    int result;
    int FindFact(int n){
        int count;
        result= 1;
        for(count=n;count>=1;count--)
        {
            result= count*result;
        }
        return result;
    }
}
class Imain28{
    public static void main(String[] args)
    {
        Factorial f= new Factorial();
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number:");
        int number= scan.nextInt();
        int display= f.FindFact(number);
        System.out.println("Factorial!! "+display);
    }
}