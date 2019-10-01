
package MainPackage;


public class Program 
{
    //datos miembro - atributos de la clase 
    private static CTriangle ObjCTriangle = new CTriangle();
    
    public static void main(String[] args) 
    {
        boolean check = false;
        
        ObjCTriangle.ReadData();
        check = ObjCTriangle.CheckTriangle();
        if (check == true)
        {
            ObjCTriangle.CalculatePerimeter();
            ObjCTriangle.CalculateSemiperimeter1();
            ObjCTriangle.CalculateArea();
            ObjCTriangle.PrintData();    
             
        }
        else 
        {
            System.out.println("Error... el triangulo no existe ");
        }
        
        
    }
    
}
