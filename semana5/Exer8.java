package semana5;

public class Exer8 {

	
	void inicializaArray(int[] a, int valor) {
		for (int i = 0; i < a.length; i++) {
			a[i] = valor;
		}
	}
	
	boolean estaNoArray(int[] a, int valor) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == valor) {
				return true;
			}
		}
		return false;
	}
}
