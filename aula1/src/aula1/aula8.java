package aula1;

import java.util.Scanner;


public class aula8 {
	
	 public static void main(String[] args) {
	        Scanner leitor = new Scanner(System.in);
	       
	        
	      
	      float temperaturaC;
	      float temperaturaF;
	      
	        System.out.println("Digite qual é a temperatura em graus Celsius");
	        temperaturaC = leitor.nextFloat();
	        
	        temperaturaF = (9*temperaturaC + 160)/5;
	        
	        System.out.println("A temperatura em graus Farenheit é " + temperaturaF);
	        
	       
	       
	  }
}
