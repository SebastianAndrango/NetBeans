
    package MainPackage;

    import java.util.Scanner;

    public class Circle 
    {
        //datos miembro - atributos de la clase
        private double perimeter, area, radiuos;

        //Funciones miembro - metodos de la clase

        // constructor sin parametros
        public Circle ()
        {
            InitializeData ();
        }

        public Circle (double r)
        {
            radiuos= r;
        }

        public  void InitializeData ()
        {
            radiuos = 0; perimeter = 0; area = 0;
        }

        public  void ReadData ()
        {
            System.out.printf("Ingrese el valor del radio: ");
            Scanner scan = new Scanner (System.in);
            radiuos = scan.nextDouble();       
        }

        public  void CalculatePerimeter ()
        {
            perimeter = 2*Math.PI * radiuos;
        }

        public  double CalculatePerimeter (double r) // sobrecarga de funciones 
        {
            return (2*Math.PI * r);
        }

        public  void CalculateArea ()
        {
            area = Math.PI * Math.pow(radiuos, 2);
        }

        public  double CalculateArea (double r) // sobrecarga de funciones 
        {
            return (Math.PI * Math.pow(r, 2));
        }

        public  void PrintData ()
        {
            System.out.printf("Perimetro: %f\n", perimeter);
            System.out.printf("Area: %f\n", area);
        }

        public  void PrintData (double perimeter, double area)
        {
            System.out.printf("Perimetro: %f\n", perimeter);
            System.out.printf("Area: %f\n", area);
        }
    }
