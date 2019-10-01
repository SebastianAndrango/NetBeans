
package MainPackage;

import java.util.Scanner;


public class Program 
{

    
    public static void main(String[] args) 
    {
        double perimeter, area, radiuos;

        radiuos= Initialize ();
        perimeter= Initialize ();
        area= Initialize ();
        radiuos= ReadRadiuos ();
        perimeter= CalculatePerimeter (radiuos);
        area= CalculateArea(radiuos);
        PrintData (perimeter,area);
    
    }
   
    public static double Initialize ()
    {
        return (0);
    }
    public static double ReadRadiuos ()
    {
        double radiuos; 
        System.out.printf("Ingrese el valor del radio: ");
        Scanner scan = new Scanner (System.in);
        radiuos = scan.nextDouble();
        return (radiuos);
    }
    public static double CalculatePerimeter(double radiuos)
    {
        return (2 * Math.PI * radiuos);
    }
    public static double CalculateArea (double radiuos)
    {
        return (Math.PI * Math.pow(radiuos, 2));
    }
    public static void PrintData (double perimeter, double area)
    {
        System.out.printf("Perimetro: %f\n", perimeter);
        System.out.printf("Area: %f\n", area);
    }
}
