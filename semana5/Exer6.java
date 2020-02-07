package semana5;
import java.util.Scanner;

public class Exer6 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[][] matrix = new double[4][6];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = scan.nextDouble();
			}
		}
		
		switch (somarVendas(matrix)) {
		case 0: System.out.println("Maior venda foi da filial AQUI! ");
			break;
		case 1: System.out.println("Maior venda foi da filial LÁ! ");
			break;
		case 2: System.out.println("Maior venda foi da filial ACOLÁ! ");
			break;
		case 3: System.out.println("Maior venda foi da filial POR AÍ! ");
			break;
		default:
			break;
		}
		
		scan.close();
	}
	
	public static int somarVendas(double[][] vendas) {
		double soma = 0;
		double maior = 0;
		int loja = 0;
		for (int i = 0; i < vendas.length; i++) {
			for (int j = 0; j < vendas[i].length; j++) {
				soma += vendas[i][j];
			}
			if (soma > maior) {
				maior = soma;
				loja = i;
			}
			soma = 0;
		}
		return loja;
	}

}
