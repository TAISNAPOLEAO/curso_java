package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		// Faça um Programa que converta metros para centímetros
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com o valor de Metros Para Converter: ");
		double metros = scan.nextDouble();
		
		double converte = metros * 100;
		
		System.out.println(metros + " Metros convertidos em Centrimetros é: " + converte);
		
		scan.close();
		

	}

}
