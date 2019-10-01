
package MainPackage;

import java.util.Scanner;

public class Program 
{
    static double perimeter, area, radiuos;
    
   // Funciones miembro - métodos de la clase
   // Las funciones miembro acceden directamente a los datos miembro de la
   // clase, sin necesidad de utilizar parámetros 
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
        radiuos = 0; perimeter = 0; area = 0;
    }
    public static void ReadData ()
    {
        System.out.printf("Ingrese el valor del radio: ");
        Scanner scan = new Scanner (System.in);
        radiuos = scan.nextDouble();
              
    }
    public static void CalculatePerimeter ()
    {
         perimeter = 2*Math.PI * radiuos;
    }
    public static void CalculateArea ()
    {
        area = Math.PI * Math.pow(radiuos, 2);
    }
    public static void PrintData ()
    {
        System.out.printf("Perimetro: %f\n", perimeter);
        System.out.printf("Area: %f\n", area);
    }
}
