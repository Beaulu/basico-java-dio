package edu.luan.basico.sistema.smart.tv;

public class Usuario {

	public static void main(String[] args) {
		SmartTV smartTV = new SmartTV();
		
		System.out.println("A TV está ligada? " + smartTV.ligada);
		System.out.println("A TV está no volume: " + smartTV.volume);
		System.out.println("A TV está no canal: " + smartTV.canal);
	
		smartTV.ligar();
		smartTV.aumentarVolume();
		smartTV.aumentarUmCanal();
		
		System.out.println("A TV está ligada? " + smartTV.ligada);
		System.out.println("A TV está no volume: " + smartTV.volume);
		System.out.println("A TV está no canal: " + smartTV.canal);
		
		smartTV.mudarDeCanal(10);
		System.out.println("A TV está no canal: " + smartTV.canal);
		
		smartTV.diminuirVolume();
		System.out.println("A TV está no volume: " + smartTV.volume);

		smartTV.diminuirVolume();
		System.out.println("A TV está no volume: " + smartTV.volume);
		smartTV.mudarDeCanal(0);
		
		System.out.println("A TV está no canal: " + smartTV.canal);
		smartTV.diminuirUmCanal();
	}
}
