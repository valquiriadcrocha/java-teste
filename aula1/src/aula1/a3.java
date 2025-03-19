package aula1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class a3 {
	
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		double distanciaTotal;
		double combustivelGasto;
		double totalCombustivel;
		
		System.out.println("Digite a distância que o automóvel percorreu");
		distanciaTotal = leitor.nextDouble();
		
		System.out.println("Digite o total de combustível gasto pelo automóvel");
		combustivelGasto = leitor.nextDouble();
		
		totalCombustivel = distanciaTotal / combustivelGasto ;
		
		System.out.println("O comsumo médio de combustível que o automóvel usou é " + formatador.format(totalCombustivel));
		
		
	}
        }
