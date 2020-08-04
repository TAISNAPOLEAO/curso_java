package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		// Faça um Programa que peça dois números e imprima a soma
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com Numero 1: ");
		int num1 = scan.nextInt();
		
		System.out.print("Entre com o Numero 2: ");
		int num2 = scan.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println("A Soma dos Numeros" + " " + num1 + "  e " + num2 + "  é: " + soma);

	}

}
