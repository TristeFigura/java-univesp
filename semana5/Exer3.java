package semana5;

import java.util.Scanner;

public class Exer3 {

	static int[][] matrix;
	static int[][] matrix2;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o tamanho da linha: ");
		int linha = scan.nextInt();
		System.out.println("Entre com o tamanho da coluna: ");
		int coluna = scan.nextInt();

		matrix = new int[linha][coluna];
		matrix2 = new int[linha][coluna];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) Math.round((Math.random()*18)-9);
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix2[i][j] = (int) Math.round((Math.random()*18)-9);
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
				
		//impressão
				
				for (int i = 0; i < matrix2.length; i++) {
					System.out.println();
					for (int j = 0; j < matrix2[i].length; j++) {
						System.out.print(matrix2[i][j] + " ");
					}
				}
				
				for (int i = 0; i < matrix.length; i++) {
					for (int j = 0; j < matrix[i].length; j++) {
						
					}
				}
				
				System.out.println();
				somaMatriz(matrix, matrix2);
			
				int[][] somaMat = somaMatriz(matrix, matrix2);
				System.out.println();
				System.out.print("Soma das matrizes: ");
				
				for (int i = 0; i < matrix.length; i++) {
					System.out.println();
					for (int j = 0; j < matrix[i].length; j++) {
						if (matrix.length == matrix2.length && matrix[i].length == matrix2[i].length) {
							System.out.print(somaMat[i][j] + " ");
						}
						else {
							System.out.println("Não é possível somar "
									+ "uma matriz com a quantidade diferente"
									+ "de elementos.");
						}
					}
				}
				
				scan.close();

	}
	
	public static int[][] somaMatriz(int[][] a, int [][] b) {
		if (a.length != b.length || a[0].length != b[0].length) {
			return null;
		}
		else {
			int[][] soma = new int[a.length][a[0].length];
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					soma[i][j] = a[i][j] + b[i][j];
				}
			}
			return soma;
		}
	}

}
