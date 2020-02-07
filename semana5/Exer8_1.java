package semana5;

public class Exer8_1 {
	
	public static void main(String[] args) {
		
		int[] arranjo = new int[3];
		
		Exer8 simples = new Exer8();
		simples.inicializaArray(arranjo, 3);
		
		for (int i = 0; i < arranjo.length; i++) {
			System.out.println(arranjo[i] + " ");
		}
		
		if (simples.estaNoArray(arranjo, 3)) {
			System.out.println("O valor está contido no array.");
		}
		else {
			System.out.println("O valor NÃO está contido no array.");
		}
	
		
	}
	

	
}
