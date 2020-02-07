package semana5;
import java.util.Scanner;

public class Exer1 {

	
	
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
		
		int[] maior = maiorValor(matrix);
		maiorValor(matrix);
		
		for (int i = 0; i < 2; i++) {
			System.out.println(maior[i]);
		}
		
		
		
	scan.close();
		

	}
	
	public static int[] maiorValor(int[][] mat) {
		int[] max = {0,0};
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] > mat[max[0]][max[1]]) {
					max[0] = i;
					max[1] = j;
				}
			}
		}
		return max;
	}
	
	

}
