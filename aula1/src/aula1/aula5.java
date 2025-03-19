package aula1;

import java.util.Scanner;
public class aula5 {
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
     
     //para colocar a média final em uma variável só 
     mediaFinal = (nota1 + nota2 + nota3) / 3;
     
   //o formatador é para formatar o número decimal com apenas duas casas depois da vírgula  
   System.out.println("Seu nome é " + nomeAluno + " e sua média final é " + formatador.format(mediaFinal));
}
