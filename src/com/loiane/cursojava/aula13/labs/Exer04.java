package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		// Fa�a um Programa que pe�a as 4 notas bimestrais e mostre a m�dia
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com a Nota 1: ");
		double Nota1 = scan.nextDouble();
		
		System.out.print("Entre com a Nota 2: ");
		double Nota2 = scan.nextDouble();
		
		System.out.print("Entre com a Nota 3: ");
		double Nota3 = scan.nextDouble();
		
		System.out.print("Entre com a Nota 4: ");
		double Nota4 = scan.nextDouble();
		
		double Media = (Nota1 + Nota2 + Nota3 + Nota4) / 4;
		
		System.out.print("A m�dia �: " + Media);
		

	}

}
