package entities;

public class Temperatura {
	private double graus;
	private int mes;
	
	public Temperatura(double graus, int mes) {
		this.graus = graus;
		this.mes = mes;
	}
	
	public double getGraus() {
		return graus;
	}
	public int getMes() {
		return mes;
	}
}
