package pruebasjunit.banh.app;

public class Calculadora 
{
	public int sumar(int n1, int n2)
	{
		return n1 + n2;
	}
	
	public int restar(int n1, int n2)
	{
		return n1 - n2;
	}
	
	public double division(double n1, double n2)
	{
		return n1 / n2;
	}
	
	public double divisionByZero(double n1, double n2)
	{
		if(n2 == 0)
		{
			throw new ArithmeticException("No se puede dividir entre 0");
		}
		else
		{
			return n1 / n2;
		}
	}
}