package semana5;

public class Exer10 {
	
	 double real;
	 double imaginaria;
	 
	 public static void main(String[] args) {
		 
		 
		 
		
	 }
	 
	 static Exer10 soma(Exer10 c1, Exer10 c2) {
		 Exer10 resp = new Exer10();
		 
		 resp.real = c1.real + c2.real;
		 resp.imaginaria = c1.imaginaria + c2.imaginaria;
		 
		 return resp;
	 }
	 
	 static Exer10 subtrai(Exer10 c1, Exer10 c2) {
		 Exer10 resp = new Exer10();
		 
		 resp.real = c1.real - c2.real;
		 resp.imaginaria = c1.imaginaria - c2.imaginaria;
		 
		 return resp;
	 }
	 
	
}
