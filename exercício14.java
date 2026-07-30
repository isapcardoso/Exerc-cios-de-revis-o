package pctExercíciosRevisão;

import java.util.Scanner;

public class exercício14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);

        int A, B, auxiliar;

        System.out.print("Digite o valor de A: ");
        A = receba.nextInt();

        System.out.print("Digite o valor de B: ");
        B = receba.nextInt();

        System.out.println("\nAntes da troca:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        auxiliar = A;
        A = B;
        B = auxiliar;

        System.out.println("\nDepois da troca:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        receba.close();
		
	}

}
