package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		// Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. 
		//Calcule e mostre o total do seu sal�rio no referido m�s. 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Calculo do Sal�rio Mensal");
		
		System.out.print("Entre com o valor da Hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.print("Entre com a quantidade de Horas trabalhadas: ");
		double  horaTrabalhada = scan.nextInt();
		
		double salario = valorHora * horaTrabalhada;
		
		System.out.println("O salario mensal �: " + salario);
		
		
		scan.close();
	}

}
