package pctExercíciosRevisão;

import java.util.Scanner;

public class exercício13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner receba = new Scanner(System.in);

        String nome;
        int idade;

        System.out.print("Digite o nome da pessoa: ");
        nome = receba.nextLine();

        System.out.print("Digite a idade da pessoa: ");
        idade = receba.nextInt();

        System.out.println("\nNome: " + nome);

        if (idade >= 18) {
            System.out.println("Situação: Maior de idade");
        } else {
            System.out.println("Situação: Menor de idade");
        }

        receba.close();
		
	}

}
