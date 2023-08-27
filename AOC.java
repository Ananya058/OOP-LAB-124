import java.util.Scanner;

public class AOC
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double radius,Area;
        System.out.print("Please enter the radius of Circle: ");
        radius = input.nextInt();
        
        Area = Math.PI * radius * radius;
        
        System.out.println("The area of Circle = "+Area);
    }
}
