package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		// Fa�a um Programa que calcule a �rea de um quadrado, em seguida mostre o dobro desta �rea para o usu�rio. 
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Calculo da Area do Quadrado ");
		
		System.out.print("Entre com o valor da area: ");
		double lado = scan.nextDouble();
		
		double area = Math.pow(lado, 2);
		
		System.out.println("Calculo da Area do Quadrado: " + area);
		
		System.out.println("O dobro da Area do Quadrado �: " + area * 2);
		
		
		
		
		scan.close();

	}

}
