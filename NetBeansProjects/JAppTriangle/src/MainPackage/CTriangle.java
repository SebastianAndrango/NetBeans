/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.util.Scanner;


public class CTriangle 
{
    //datos miembro - atributos de la clase 
    private double mA, mB, mC, mPerimeter, mSemiperimeter, mArea;
    
    public CTriangle ()
    {
        InitializeData ();
    }
    
    public  void InitializeData ()
    {
        mA = 0; mB = 0; mC = 0; mPerimeter = 0; mSemiperimeter = 0; mArea = 0;
    }

    public  void ReadData ()
    {
        Scanner scan = new Scanner (System.in);
        System.out.printf("Ingrese el valor del lado a: ");
        mA= scan.nextDouble();
           
        System.out.printf("Ingrese el valor del lado b: ");
        mB= scan.nextDouble();      
            
        System.out.printf("Ingrese el valor del lado c: ");
        mC= scan.nextDouble();  
    }

    public  void CalculatePerimeter ()
    {
        mPerimeter = mA + mB + mC; 
    }

    public  double CalculatePerimeter (double a, double b, double c) // sobrecarga de funciones 
    {
        return (a+b+c);
    }
        
    public  void CalculateSemiperimeter1 ()
    {
        mSemiperimeter = (mA + mB + mC) / 2.0 ; 
    }
        
    public  double CalculateSemiperimeter2 ()
    {
        return ((mA + mB + mC) / 2.0) ; 
    }
        
    public void CalculateArea()
    {
        double s= CalculateSemiperimeter2();
        mArea = Math.sqrt(s*(s-mA)*(s-mB)*(s-mC)) ;
    }

    public  void PrintData ()
    {
        System.out.printf("Perimetro: %f\n", mPerimeter);
        System.out.printf("Semi Perimetro: %f\n", mSemiperimeter);
        System.out.printf("Area: %f\n", mArea);
    }

    public  void PrintData (double perimeter, double area)
    {
        System.out.printf("Perimetro: %f\n", perimeter);
        System.out.printf("Area: %f\n", area);
    }
    
    public boolean CheckTriangle()
    {
        if ((mA + mB > mC)&& (mA + mC > mB) && (mB + mC > mA))  
        {
            return (true);
        }
        else 
        {
            return (false);
        }
    }
}
