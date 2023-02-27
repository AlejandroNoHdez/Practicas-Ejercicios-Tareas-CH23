package tiposDeDatosYVariables;

public class Ejercicios 
{
	public static void main(String[] args) 
	{
        //Declara 3 variables de tipo entero y utiliza el operador * y %
            int z = 5;
            int x = 2;
            int y = 3;
            int v = z * x % y;
            System.out.println(v);
            
        //Declara dos variables de tipo boolean y utiliza el operador ==
            boolean a = true;
            boolean b = false;
            boolean c = a == b;
            System.out.println(c);
            
        //Declara dos variables de tipo Double y utiliza el operador <
            double s = 5.5;
            double d = 6.6;
            if(s < d) 
            {
                System.out.println("Es menor el primer valor");
            }
            else 
            {
                System.out.println("Es menor el segundo valor");
                System.out.println();
            }
            
          //Conversion de fahrenheit a kelvin y celsius
            double fahrenheit = 50;
            double kelvin = (fahrenheit - 32) * 5/9 + 273.15;
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.println("\nFahrenheit: " + fahrenheit);
            System.out.println("Kelvin: " + kelvin);
            System.out.println("Celsius: " + celsius);
            
            //Verificar si un numero es par o impar
            int num = 5;
            
            if(num % 2 == 0) {
                System.out.println("El numero es par");
            }else {
                System.out.println("El numero es impar");
            }
	}
}
