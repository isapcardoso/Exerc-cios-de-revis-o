package pctExercíciosRevisão;

import java.util.Scanner;

public class exercício19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);

        int valor;

        System.out.print("Digite um valor inteiro: ");
        valor = receba.nextInt();

        System.out.println("Tabuada do " + valor + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }

        receba.close();
		
	}

}
