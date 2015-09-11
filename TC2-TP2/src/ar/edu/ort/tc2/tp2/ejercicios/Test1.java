package ar.edu.ort.tc2.tp2.ejercicios;

import ar.edu.ort.tc2.tp2.clases.*;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asalariado emp1 = new Asalariado(29320000,"Mariano Piedrozzi",225,100);

		System.out.println(emp1.toString());
		System.out.println("Sueldo=" + emp1.calcularSueldo());
	}

}
