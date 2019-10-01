
package MainPackage;

import java.util.Scanner;


public class Rectangle 
{
    private double Largo, Ancho, Area, Perimetro;
    
    public Rectangle ()
    {
        InitializeData ();
    }
    public Rectangle (double l, double a)
    {
        Largo = l;
        Ancho = a;      
    }
    public void InitializeData ()
    {
        Largo = 0; Ancho = 0; Area = 0; Perimetro = 0;
    }
    public  void ReadData ()
    {
        System.out.printf("Ingrese el valor del largo: ");
        Scanner scan = new Scanner (System.in);
        Largo = scan.nextDouble();
        System.out.printf("Ingrese el valor del ancho: ");
        Ancho = scan.nextDouble();
              
    }
    public  void CalculatePerimeter ()
    {
        Perimetro = 2 * (Largo + Ancho);
    }
    
    public  double CalculatePerimeter (double l, double a) // sobrecarga de funciones 
    {
        return (2 * (l + a));
    }
    
    public  void CalculateArea ()
    {
        Area = Largo * Ancho ; 
    }
    
    public  double CalculateArea (double l, double a) // sobrecarga de funciones 
    {
        return (l * a);
    }
    
    public  void PrintData ()
    {
        System.out.printf("Perimetro: %f\n", Perimetro);
        System.out.printf("Area: %f\n", Area);
    }
    
    public  void PrintData (double perimeter, double area)
    {
        System.out.printf("Perimetro: %f\n", perimeter);
        System.out.printf("Area: %f\n", area);
    }
    
    
}
