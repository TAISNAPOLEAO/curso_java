package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		//  Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. 
		//Calcule e mostre o total do seu sal�rio no referido m�s, sabendo-se que s�o descontados 11% para 
		//o Imposto de Renda, 8% para o INSS e 5% para o sindicato, fa�a um programa que nos d�:  
		//. sal�rio bruto. 
		//a. quanto pagou ao INSS. 
		//b. quanto pagou ao sindicato. 
		//c. o sal�rio l�quido. 
		//d. calcule os descontos e o sal�rio l�quido, 
		//conforme a tabela abaixo: + Sal�rio Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$ = Sal�rio Liquido : R$ 
		//� Obs.: Sal�rio Bruto - Descontos = Sal�rio L�quido. 
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Calculo de Sal�rio");
		
		System.out.println();
		System.out.print("Entre com o valor da hora: ");
		double  valorHora = scan.nextDouble();
		
		System.out.print("Entre com as Horas Trabalhadas: ");
		double qtdHoras = scan.nextDouble();
		
		System.out.println();
		double salarioBruto = qtdHoras * valorHora;
		System.out.print("Sal�rio Bruto: " + salarioBruto);

		System.out.println();
		System.out.println();
		double IR = (salarioBruto * 11) / 100; 
		System.out.print("Desconto do IR: " + IR);
		
		System.out.println();
		double INSS = (salarioBruto * 8) / 100;
		System.out.print("Desconto do INSS: " + INSS);
		
		System.out.println();
		double sindicato = (salarioBruto * 5) / 100;
		System.out.print("Desconto do Sindicato: " + sindicato);
		
		System.out.println();
		System.out.println();
		double TotalDescontos = IR + INSS + sindicato;
		System.out.print("Total de Descontos: " + TotalDescontos);
		
		System.out.println();
		double salarioLiquido = salarioBruto - TotalDescontos;
		System.out.print("Salario Liquido: " + salarioLiquido);
		
		
		
		
		scan.close();

	}

}
