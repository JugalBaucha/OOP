import java.util.*;
class Math13{
    public static void main(String[]args)
    {
        int c;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number ,operator and another number:(a*b): ");
        int a=scan.nextInt();
        char operator= scan.next().charAt(0);
        int b=scan.nextInt();

        switch(operator)
        {
            case '+':
                c=a+b;
                System.out.println(c);
                break;
            case '-': 
                c=a-b;
                System.out.println(c);
                break;
            case '*':
                c=a*b;
                System.out.println(c);
                break;
            case '/': 
                c=a/b;
                System.out.println(c);
                break;
            case '%':
                c=a%b;
                System.out.println(c);
                break;
            default:
                System.out.println("Wrong Operator!");
                break;    
        }

    }
}