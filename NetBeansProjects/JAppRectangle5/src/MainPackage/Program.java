
package MainPackage;


public class Program 
{
    static Rectangle ObjRectangle = new Rectangle ();
    static Rectangle ObjRectangle1 = new Rectangle (4,5);
    public static void main(String[] args) 
    {
        ObjRectangle.InitializeData();
        ObjRectangle.ReadData();
        ObjRectangle.CalculatePerimeter();
        ObjRectangle.CalculateArea();
        ObjRectangle.PrintData();
        
        ObjRectangle1.CalculatePerimeter();
        ObjRectangle1.CalculateArea();
        ObjRectangle1.PrintData();
        
        double l, a, perimetro, area;
        l= 2;
        a= 3;
        
        perimetro= ObjRectangle.CalculatePerimeter(l, a);
        area= ObjRectangle1.CalculateArea(l, a);
        ObjRectangle1.PrintData(perimetro, area);
        
    }
    
}
