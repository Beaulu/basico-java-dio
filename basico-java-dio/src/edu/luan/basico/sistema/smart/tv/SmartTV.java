package edu.luan.basico.sistema.smart.tv;

public class SmartTV {

	boolean ligada;
	int canal;
	int volume ;
	
	public void ligar(){ ligada = true; }
	public void desligar() { ligada = false; }
	
	public void aumentarVolume(){volume++;}
	public void diminuirVolume(){ 
		if(volume != 0) {
			volume--; 
		}
	}
	public void mudarDeCanal(int novoCanal) {
		this.canal = novoCanal;
	}
	public void aumentarUmCanal() { canal++; }
	public void diminuirUmCanal() {
		if(canal != 0) {
			canal--;
		}
	}
}
