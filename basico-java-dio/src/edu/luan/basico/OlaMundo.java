package edu.luan.basico;

public class OlaMundo {
	
	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		return primeiroNome + " " + segundoNome;
	}
	public static String nomeCompleto2(String primeiroNome, String segundoNome) {
		return primeiroNome.concat(" " + segundoNome);
	}
	public static String nomeCompleto3(String primeiroNome, String segundoNome) {
		return primeiroNome.concat(" ").concat(segundoNome);
	}
		
	public static void main(String[] args) {
		System.out.println("Olá mundo");
		
		String primeiroNome = "Luan";
		String segundoNome ="Cerqueira";
			
		System.out.println(nomeCompleto(primeiroNome, segundoNome));
			
		String nomeCompleto2 = nomeCompleto(primeiroNome, segundoNome);
		System.out.println(nomeCompleto2);

		String nomeCompleto3 = nomeCompleto(primeiroNome, segundoNome);
		System.out.println(nomeCompleto3);
	}
}
