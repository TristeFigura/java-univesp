package semana5;
import java.util.Scanner;

public class Exer9_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
			Exer9[] esfera = new Exer9[5];
			
			for (int i = 0; i < esfera.length; i++) {
				System.out.println("Entre com o raio da " + (1+i) + "º esfera");
				double raio = scan.nextDouble();
				esfera[i] = new	Exer9(raio);
			}
			
			for (int i = 0; i < esfera.length; i++) {
				System.out.println(esfera[i]);
			}
			
			
		scan.close();
		
	}

}
