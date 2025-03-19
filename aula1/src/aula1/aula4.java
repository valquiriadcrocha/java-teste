package aula1;

import java.util.Scanner;

public class aula4 {
	
	public static void main(String[] args ) {
		Scanner leitor = new Scanner(System.in);
		
		String nomeVendedor;
		float salarioFixo;
		float totalVendas;
		float comissao;
		float salarioComComissao;
		
		System.out.println("Digite o seu nome");
		nomeVendedor = leitor.nextLine();
		
		System.out.println("Digite seu salário fixo");
		salarioFixo = leitor.nextFloat();
		
		System.out.println("Digite seu total de vendas do mês em reais");
		totalVendas = leitor.nextFloat();
		
		comissao = totalVendas * 0.15f;
		
		salarioComComissao = salarioFixo = comissao;
		
		System.out.println("Seu nome é" + nomeVendedor + ", seu salário fixo é" + salarioFixo +" e seu salário no fim do mês é" + salarioComComissao);
		
		
		}
	
	}


