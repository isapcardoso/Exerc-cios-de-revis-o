package pctExercíciosRevisão;

import java.util.Scanner;

public class exercício03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);
		
		int A, B, C;
		
		 System.out.print("Digite o valor de A: ");
	        A = receba.nextInt();

	        System.out.print("Digite o valor de B: ");
	        B = receba.nextInt();

	        if (A == B) {
	            C = A + B;
	        } else {
	            C = A * B;
	        }

	        System.out.println("O valor de C é: " + C);

	        receba.close();
	}

}
