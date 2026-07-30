package pctExercíciosRevisão;

import java.util.Scanner;

public class exercício04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);

        int numero, antecessor, sucessor;

        System.out.print("Digite um número inteiro: ");
        numero = receba.nextInt();

        antecessor = numero - 1;
        sucessor = numero + 1;

        System.out.println("Número: " + numero);
        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);

        receba.close();
	}

}
