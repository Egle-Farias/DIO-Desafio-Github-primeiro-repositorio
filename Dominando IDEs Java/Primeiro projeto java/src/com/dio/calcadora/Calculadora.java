package com.dio.calcadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
				// TODO Auto-generated method stub

		Scanner  scan = new Scanner(System.in);
		
		double a,b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
				System.out.println("Digiteo segundo valor: ");
		b = scan.nextInt();
		
		double soma = soma(a,b);
		double subtracao = subtracao(a,b);
		double multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);

		System.out.println("Soma" + soma);
		System.out.println("Sub" + subtracao);
		System.out.println("mult" + multiplicacao);
		System.out.println("Div" + divisao);
		
		
	}
	
	public static double soma(double a, double b) {
		return a - b;
	}

	public static double divisao(double a, double b) {
		return a / b;
	}
	
	public static double subtracao(double a, double b) {
		return a * b;
	}
	
	public static double multiplicacao(double a, double b) {
		return a * b;
	}
	
	
}
