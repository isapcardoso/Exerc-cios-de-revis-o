package pctExercíciosRevisão;

import java.util.Scanner;

public class exercício02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um número: ");
        numero = receba.nextInt();
		
        if (numero % 2 == 0) {
            System.out.println("O número é PAR.");
        } else {
            System.out.println("O número é ÍMPAR.");
        }
        
        if (numero > 0) {
            System.out.println("O número é POSITIVO.");
        } else if (numero < 0) {
            System.out.println("O número é NEGATIVO.");
        } else {
            System.out.println("O número é ZERO.");
        }

        receba.close();
	}

}
