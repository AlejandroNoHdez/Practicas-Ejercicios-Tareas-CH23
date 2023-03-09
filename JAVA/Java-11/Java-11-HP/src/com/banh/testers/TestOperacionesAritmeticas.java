package com.banh.testers;

import com.banh.clases.*;

public class TestOperacionesAritmeticas 
{
	public static void main(String[] args) 
	{
		Suma s = new Suma(5,2);
		OperacionesAritmeticas ss = new Suma(10, 3);
		Mensajes sss = new Suma();
		
		System.out.println(s.sumar());
		System.out.println(ss.sumar());
		
		s.mensaje();
		sss.mensaje();
	}
}