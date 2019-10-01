
package MainPackage;

import java.util.Scanner;
public class Program 
{
    static double Perimetro, Area, Largo, Ancho;
    
    public static void main(String[] args) 
    {
        InitializeData ();
        ReadData ();
        CalculatePerimeter ();
        CalculateArea ();
        PrintData ();
               
    }
    public static void InitializeData ()
    {
        Perimetro = 0; Area = 0; Largo = 0; Ancho =0;
    }
    public static void ReadData ()
    {
        System.out.printf("Ingrese el valor del largo: ");
        Scanner scan = new Scanner (System.in);
        Largo = scan.nextDouble();
        System.out.printf("Ingrese el valor del ancho: ");
        Ancho = scan.nextDouble();
              
    }
    public static void CalculatePerimeter ()
    {
        Perimetro = 2 * (Largo + Ancho);
    }
    public static void CalculateArea ()
    {
        Area = Largo * Ancho ; 
    }
    public static void PrintData ()
    {
        System.out.printf("Perimetro: %f\n", Perimetro);
        System.out.printf("Area: %f\n", Area);
    }
}
