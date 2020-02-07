package semana5;

public class Exer7 {
	
	
	public static void main(String[] args) {
		
	cumprimenta();
	cumprimenta();
	cumprimenta();
	cumprimenta();
	cumprimenta();
	
	}
	
	public static void cumprimenta() {

		int aleat = (int) Math.round(Math.random()*2);
		switch (aleat) {
		case 0:
			System.out.println("Bom dia!");
			aleat = (int) Math.round(Math.random()*2);
			break;
		case 1: System.out.println("Vai pela sombra!");
		aleat = (int) Math.round(Math.random()*2);
		break;
		case 2: System.out.println("Boa tarde!");
		aleat = (int) Math.round(Math.random()*2);
		break;
		default: System.out.println("Bocó!");
		break;
		}
		
		
	}

}
