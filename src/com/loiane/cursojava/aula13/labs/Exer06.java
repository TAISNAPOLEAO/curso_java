package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		// Fa�a um Programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea. 
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Entre com o Raio de um Circulo: " );
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("O calculo da area do circulo �: " + area);
				
		
		
		
		scan.close();

	}

}
