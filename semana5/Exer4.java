package semana5;

import java.util.Scanner;

public class Exer4 {

	static float[][] matrix;
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o tamanho da linha: ");
		int linha = scan.nextInt();
		System.out.println("Entre com o tamanho da coluna: ");
		int coluna = scan.nextInt();

		matrix = new float[linha][coluna];
		
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
		
		float[][] res = matrizTransp(matrix);
		for (int i = 0; i < matrix.length; i++) {
			System.out.println();
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(res[i][j] + " ");
			}
		}
		
		scan.close();
	}
	
	public static float[][] matrizTransp(float[][] m1) {
		float[][] resp = new float[m1[0].length][m1.length];
		
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				resp[j][i] = m1[i][j];
			}
		}
		return resp;
	}

}
