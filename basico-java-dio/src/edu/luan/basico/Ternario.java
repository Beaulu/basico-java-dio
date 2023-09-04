package edu.luan.basico;

public class Ternario {

	public static void main(String[] args) {
		
		int a = 5, b = 5;
		if (a == b) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		//Operador ternario
		String resultado ="";
		resultado = a == b ? "True" : "False";
		System.out.println(resultado);
		
		int resultado2 = a == b ? 1 : 0;
		System.out.println(resultado2);
	}
}
