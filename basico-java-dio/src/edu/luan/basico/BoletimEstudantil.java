package edu.luan.basico;

public class BoletimEstudantil {

	public static void main(String[] args) {
		int mediaFinal = 10;
		if(mediaFinal < 6){
			System.out.println("REPROVADO");
		}else if (mediaFinal == 6) {
				System.out.println("PROVA MINERVA");
		}else {
					System.out.println("APROVADO");
		}
		
		int numero = 5;
		System.out.println(- numero );
		numero += 5;
		System.out.println(numero );
		
	}
}
