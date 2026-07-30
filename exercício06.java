package pctExercíciosRevisão;

import java.util.Scanner;

public class exercício06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);

        double valor;
        double reajuste;
        double novoValor;

        System.out.print("Digite um valor: R$ ");
        valor = receba.nextDouble();

        reajuste = valor * 0.05; // 5%
        novoValor = valor + reajuste;

        System.out.printf("Valor original: R$ %.2f%n", valor);
        System.out.printf("Valor com reajuste de 5%%: R$ %.2f%n", novoValor);

        receba.close();
	}

}
