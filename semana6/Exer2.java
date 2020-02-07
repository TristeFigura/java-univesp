package semana6;

public class Exer2 {
	
	public static void main(String[] args) {
		
		String nome = "DomQuixote";
		char[] nome2 = {'D','o','m','Q','u','i','x','o','t','e'};
		
		if (comparaTextos(nome, nome2)) {
			System.out.println("São iguais.");
		}
		else {
			System.out.println("Não são iguais.");
		}
		
	}
	
	
	
	public static boolean comparaTextos(String texto1, char[] texto2) {
		if (texto1.length() != texto2.length) {
			return false;
		}
		
		for (int i = 0; i < texto2.length; i++) {
			if (texto1.charAt(i) != texto2[i]) {
				return false;
			}
		}
		
		return true;
	}

}
