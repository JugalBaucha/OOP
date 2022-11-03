import java.util.*;
class Rectangle{
    Scanner scan= new Scanner(System.in);
    double length,breadth,area;
    void computeArea()
    {
        System.out.println("Enter the length: ");
        length= scan.nextDouble();
        System.out.println("Enter the breadth: ");
        breadth= scan.nextDouble();
        area= length* breadth;
    }
    void DisplayArea()
    {
        System.out.println("AREA= "+area);
    }
}

class Imain27{
    public static void main(String[]args){
        Rectangle r1= new Rectangle();
        Rectangle r2= new Rectangle();
        System.out.println("Enter for rectangle 1");
        r1.computeArea();
        System.out.println("Enter for rectangle 2");
        r2.computeArea();
        if(r1.area>r2.area)
        {
            System.out.println("Area of First is greater");
            r1.DisplayArea();   
        }
        else
        {
            System.out.println("Area of Second is greater");
            r2.DisplayArea();
        }
        }
    }
