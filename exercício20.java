package pctExercíciosRevisão;

import java.util.Scanner;

public class exercício20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);

        int A, B, quociente, resto;

        System.out.print("Digite o valor de A: ");
        A = receba.nextInt();

        System.out.print("Digite o valor de B: ");
        B = receba.nextInt();

        quociente = A / B;
        resto = A % B;

        System.out.println("Quociente da divisão: " + quociente);
        System.out.println("Resto da divisão: " + resto);

        receba.close();
		
	}

}
