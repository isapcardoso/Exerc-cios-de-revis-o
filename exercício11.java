package pctExercíciosRevisão;

import java.util.Scanner;

public class exercício11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);

    String nome;
    double nota1, nota2, nota3, nota4, media;

    System.out.print("Digite o nome do aluno: ");
    nome = receba.nextLine();

    System.out.print("Digite a primeira nota: ");
    nota1 = receba.nextDouble();

    System.out.print("Digite a segunda nota: ");
    nota2 = receba.nextDouble();

    System.out.print("Digite a terceira nota: ");
    nota3 = receba.nextDouble();

    System.out.print("Digite a quarta nota: ");
    nota4 = receba.nextDouble();

    media = (nota1 + nota2 + nota3 + nota4) / 4;

    System.out.println("\nNome do aluno: " + nome);
    System.out.printf("Média: %.2f\n", media);

    if (media >= 7.0) {
    System.out.println("Situação: Aprovado");
    } else {
    System.out.println("Situação: Reprovado");
     }

    receba.close();
		
	}

}
