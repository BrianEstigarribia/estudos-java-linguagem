package br.com.estudos.java.array;

public class ExecutaReferencia {

	public static void passarPorReferencia(String fruta[]){
		fruta[0] = "Mudou";
	}
	
	public static void main(String[] args) {
		String frutaArray[] = {"Ma��", "Laranja"};
		System.out.println("Antes da Fun��o: "+frutaArray[0]);
		
		passarPorReferencia(frutaArray);
		System.out.println("Depos da fun��o: "+frutaArray[0]);
		
	}

}
