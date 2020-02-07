package semana5;
import java.util.Scanner;


public class Exer5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[][] matrix;
		
		System.out.println("Entre com o tamanho da linha: ");
		int linha = scan.nextInt();
		System.out.println("Entre com o tamanho da coluna: ");
		int coluna = scan.nextInt();
		matrix = new int[linha][coluna];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		
		
		if (matrizSimetrica(matrix) == true) {
			System.out.println("A matriz é simétrica.");
		}
		else {
			System.out.println("A matriz não é simétrica.");
		}

		scan.close();
	}

	public static boolean matrizSimetrica(int[][] a) {
		
		if (a.length != a[0].length ) {
			return false;
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != a[j][i]) {
					return false;
				}
			}
		}
		return true;
	}
}
