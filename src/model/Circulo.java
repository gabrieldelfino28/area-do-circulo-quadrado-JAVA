package model;

public class Circulo extends Figura{
	private double raio;

	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		double pi = 3.1415;
		return pi * raio * raio;
	}
	
}
