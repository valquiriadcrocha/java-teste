package aula1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class aula5 {
	public static void main(String[]args) {
	Scanner leitor = new Scanner(System.in);
    DecimalFormat formatador = new DecimalFormat("0.00");
  
 String nomeAluno;
 float nota1;
 float nota2;
 float nota3;
 float mediaFinal;
 
 
 System.out.println("Digite qual é o seu nome");
 nomeAluno = leitor.nextLine();
 
 System.out.println("Digite a nota da sua primeira prova");
 nota1 = leitor.nextFloat();
 
  System.out.println("Digite a nota da sua segunda prova");
  nota2 = leitor.nextFloat();
  
  System.out.println("Digite a nota da sua terceira prova");
     nota3 = leitor.nextFloat();
     
    
     mediaFinal = (nota1 + nota2 + nota3) / 3;
     
   //
   System.out.println("Seu nome é " + nomeAluno + " e sua média final é " + formatador.format(mediaFinal));
	}
	
}
