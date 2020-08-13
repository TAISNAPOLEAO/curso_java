package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		//  Faça um programa que peça o tamanho de um arquivo para download (em MB) 
		//e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado 
		//de download do arquivo usando este link (em minutos). 
		 
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Calculo o Tempo de Download");
		
		System.out.println();
		System.out.print("Entre com o Tamanho do Arquivo em MB: ");
		double Tamanho = scan.nextDouble();
		
		System.out.print("Entre com a Velocidade do Link de Interent: ");
		double Velocidade = scan.nextDouble();
		
		double Tempo = Tamanho / Velocidade;
		
		System.out.print("O Tempo de Downalod será de: " + Tempo + " Minutos");
		
		
		scan.close();

	}

}
