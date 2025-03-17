package aula1;

import java.util.Scanner;

public class a1 {
	public static void main(String[]arg) {
		Scanner enterScanner = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Digite o primeiro numero da soma");
		a= enterScanner.nextInt();
		System.out.println("Digite o segundo numero da soma");
		b = enterScanner.nextInt();
		int c;
		c = a + b;
		
		System.out.println("O resultado da soma foi de: " +c);
		
	}
}
