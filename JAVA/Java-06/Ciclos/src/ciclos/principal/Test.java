package ciclos.principal;

import ciclos.control.DoSwitch;
import ciclos.forwhiledo.CicloDo;
import ciclos.forwhiledo.UsoFor;
import ciclos.forwhiledo.UsoWhile;

public class Test 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		UsoWhile uw = new UsoWhile();
		UsoFor uf = new UsoFor();
		CicloDo cd = new CicloDo();
		DoSwitch dw = new DoSwitch();
		//uw.cicloW();
		//uw.centinelaW();
		//uw.banderaW();
		//uf.cicloFor();
		//uf.letrasFor();
		//cd.digitosDo();
		dw.controlador();
	}
}
