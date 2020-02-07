package semana5;

public class Exer9 {
	
	private double raio;
	
	

	public Exer9(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double calcularSupEsfera() {	
		return 4*Math.PI*(raio*raio);
	}

	public double calcularVolumeEsfera() {
		return (4*Math.PI*(raio*raio*raio))/3;
	}
	
	@Override
	public String toString() {
		return "Raio: " + raio + "\n" +
				"Superfície da esfera: " + calcularSupEsfera() + "\n" +
				"Volume da esfera: " + calcularVolumeEsfera();
	}
}
