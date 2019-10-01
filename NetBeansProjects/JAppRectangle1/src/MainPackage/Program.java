
package MainPackage;

import java.util.Scanner;

public class Program 
{
     static double Perimetro, Area, Largo, Ancho;
    
    public static void main(String[] args) 
    {
        Perimetro = 0; Area = 0; Largo = 0; Ancho =0;
        System.out.printf("Ingrese el valor del largo: ");
        Scanner scan = new Scanner (System.in);
        Largo = scan.nextDouble();
        System.out.printf("Ingrese el valor del ancho: ");
        Ancho = scan.nextDouble();
        Perimetro = 2 * (Largo + Ancho);
        Area = Largo * Ancho;
        System.out.printf("Perimetro: %f\n", Perimetro);
        System.out.printf("Area: %f\n", Area);
    }
    
}
