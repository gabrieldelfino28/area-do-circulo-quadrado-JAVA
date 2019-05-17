package view;

import model.Circulo;
import model.Quadrado;

public class Execucao {
	public static void main(String args[]){
		Quadrado quad = new Quadrado();
		Circulo circ = new Circulo();
		
		quad.setLado(50);
		System.out.println("Area do quadrado é: " + quad.area());
		
		circ.setRaio(50);
		System.out.println("Area do circulo é: " + circ.area());
	}
}
