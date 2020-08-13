package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		//  Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
		//Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para 
		//o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:  
		//. salário bruto. 
		//a. quanto pagou ao INSS. 
		//b. quanto pagou ao sindicato. 
		//c. o salário líquido. 
		//d. calcule os descontos e o salário líquido, 
		//conforme a tabela abaixo: + Salário Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$ = Salário Liquido : R$ 
		//  Obs.: Salário Bruto - Descontos = Salário Líquido. 
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Calculo de Salário");
		
		System.out.println();
		System.out.print("Entre com o valor da hora: ");
		double  valorHora = scan.nextDouble();
		
		System.out.print("Entre com as Horas Trabalhadas: ");
		double qtdHoras = scan.nextDouble();
		
		System.out.println();
		double salarioBruto = qtdHoras * valorHora;
		System.out.print("Salário Bruto: " + salarioBruto);

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
