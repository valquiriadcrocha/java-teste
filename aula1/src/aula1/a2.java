package aula1;

import java.util.Scanner;



public class a2 {
	public static void main(String[]arg) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro Número:");
		int n1= scan.nextInt();
		System.out.println("Digite o Segundo Número:");
		int n2= scan.nextInt();
		
		int soma = n1+n2;
		
		int subtracao = n1-n2;
		
		int multiplicação = n1*n2;
		
		int divisão = n1/n2;
		
		System.out.println("Sua Soma é = " + soma);
		System.out.println("Sua Subtração é:" + subtracao);
		System.out.println("Sua MultiplicaçãO é:" + multiplicação);
		System.out.println("Sua Divisão é:" + divisão);
		
		
	}

}
