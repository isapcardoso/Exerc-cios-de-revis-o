package pctExercíciosRevisão;

import java.util.Scanner;

public class exercício07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);

        boolean valor1, valor2;

        System.out.print("Digite o primeiro valor (true ou false): ");
        valor1 = receba.nextBoolean();

        System.out.print("Digite o segundo valor (true ou false): ");
        valor2 = receba.nextBoolean();

        if (valor1 == valor2) {
            System.out.println("Os dois valores são iguais.");
        } else {
            System.out.println("Os dois valores são diferentes.");
        }

        receba.close();
	}

}
