package semana5;
import java.util.Scanner;

public class Exer2 {

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
				matrix[i][j] = (int) Math.round((Math.random()*18)-9);
			}
		}
		
		//impressão
		
		for (int i = 0; i < matrix.length; i++) {
			System.out.println();
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}
		System.out.println();
		System.out.println(somaDiagSec(matrix));
		
		scan.close();
	}
	
	public static int somaDiagSec(int[][] mat) {
		int soma = 0;
		
			for (int i = 0; i < mat.length; i++) {
				soma += mat[i][mat[i].length-i-1];
			}
			
		return soma;
	}

}
