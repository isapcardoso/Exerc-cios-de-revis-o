package pctExercíciosRevisão;

import java.util.Scanner;

public class exercício05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);

        double salarioMinimo = 1621.00;
        double salarioUsuario;
        double quantidadeSalarios;

        System.out.print("Digite o seu salário: R$ ");
        salarioUsuario = receba.nextDouble();

        quantidadeSalarios = salarioUsuario / salarioMinimo;

        System.out.println("Você ganha " + quantidadeSalarios + " salários mínimos.");

        receba.close();
	}

}
