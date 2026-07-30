package pctExercíciosRevisão;

import java.util.Scanner;

public class exercício01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner receba = new Scanner(System.in);
		
		int A, B, C, soma;
		
		 System.out.println("Digite o valor de A");
         A = receba.nextInt();
         
         System.out.println("Digite o valor de B");
         B = receba.nextInt();
         
         System.out.println("Digite o valor de C");
         C = receba.nextInt();
         
         soma = A + B;
         
         System.out.println("A soma entre A e B é: " + soma);

         if (soma < C) {
             System.out.println("A soma é menor que C.");
         } else {
             System.out.println("A soma não é menor que C.");
         }

         receba.close();	
	}

}
