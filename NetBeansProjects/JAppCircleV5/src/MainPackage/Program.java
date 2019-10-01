
package MainPackage;


public class Program 
{
    static Circle ObjCircle= new Circle ();
    static Circle ObjCircle1= new Circle (7);
    
    public static void main(String[] args) 
    {
        ObjCircle.InitializeData();
        ObjCircle.ReadData();
        ObjCircle.CalculatePerimeter();
        ObjCircle.CalculateArea();
        ObjCircle.PrintData();
        
        ObjCircle1.CalculatePerimeter();
        ObjCircle1.CalculateArea();
        ObjCircle1.PrintData();
   
        double r, perimetro, area;
        r= 2;
        perimetro = ObjCircle.CalculatePerimeter(r);
        area= ObjCircle.CalculateArea(r);
        ObjCircle.PrintData(perimetro, area);
    }
    
}
