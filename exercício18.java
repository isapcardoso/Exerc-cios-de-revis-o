package pctExercíciosRevisão;

import java.util.Scanner;

public class exercício18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número: ");
        numero = receba.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        receba.close();
		
	}

}
