package pctExercíciosRevisão;

import java.util.Scanner;

public class exercício10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);

        double nota1, nota2, nota3, media;

    System.out.print("Digite a primeira nota: ");
    nota1 = receba.nextDouble();

    System.out.print("Digite a segunda nota: ");
    nota2 = receba.nextDouble();

    System.out.print("Digite a terceira nota: ");
    nota3 = receba.nextDouble();

    media = (nota1 + nota2 + nota3) / 3;

    System.out.printf("A média das notas é: %.2f\n", media);

    receba.close();
		
	}

}
