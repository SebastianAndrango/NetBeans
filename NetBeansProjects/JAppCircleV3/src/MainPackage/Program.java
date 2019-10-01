
package MainPackage;

import java.util.Scanner;
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double perimeter, area, radiuos;
        radiuos = 0; perimeter = 0; area = 0;
        System.out.printf("Ingrese el valor del radio: ");
        Scanner scan = new Scanner (System.in);
        radiuos = scan.nextDouble();
        perimeter = 2*Math.PI * radiuos;
        area = Math.PI * Math.pow(radiuos, 2);
        System.out.printf("Perimetro: %f\n", perimeter);
        System.out.printf("Area: %f\n", area);
    }
    
}
