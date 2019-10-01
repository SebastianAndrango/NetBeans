
package MainPackage;

import java.util.Scanner;


public class Program 
{

   
    public static void main(String[] args) 
    {
        double Perimetro, Largo, Ancho, Area ; 
        Perimetro = Initialize ();
        Area = Initialize ();
        Largo = Initialize ();
        Ancho = Initialize ();
        Largo = ReadLargo ();
        Ancho = ReadAncho ();
        Perimetro = CalculatePerimeter (Largo,Ancho);
        Area = CalculateArea (Largo, Ancho);
        PrintData (Perimetro, Area);
    }
    
    public static double Initialize ()
    {
        return (0);
    }
    public static double ReadLargo ()
    {
        double Largo; 
        System.out.printf("Ingrese el valor del Largo: ");
        Scanner scan = new Scanner (System.in);
        Largo = scan.nextDouble();
        return (Largo);
    }
    public static double ReadAncho ()
    {
        double Ancho; 
        System.out.printf("Ingrese el valor del Ancho: ");
        Scanner scan = new Scanner (System.in);
        Ancho = scan.nextDouble();
        return (Ancho);
    }
    
    public static double CalculatePerimeter(double Largo, double Ancho)
    {
        return (2 * (Largo + Ancho));
    }
    public static double CalculateArea (double Largo, double Ancho)
    {
        return (Largo * Ancho);
    }
    public static void PrintData (double Perimetro, double Area)
    {
        System.out.printf("Perimetro: %f\n", Perimetro);
        System.out.printf("Area: %f\n",Area);
    }
}
