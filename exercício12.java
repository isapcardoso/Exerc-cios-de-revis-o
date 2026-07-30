package pctExercíciosRevisão;

import java.util.Scanner;

public class exercício12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  Scanner receba = new Scanner(System.in);

	double valorProduto, valorFinal;
	int codigo;

	System.out.print("Digite o valor do produto: R$ ");
	valorProduto = receba.nextDouble();

	System.out.println("\nEscolha a forma de pagamento:");
	System.out.println("1 - À vista em Dinheiro ou Pix (15% de desconto)");
    System.out.println("2 - À vista no Cartão de Crédito (10% de desconto)");
	System.out.println("3 - Parcelado em 2x (sem juros)");
	System.out.println("4 - Parcelado em 3x ou mais (10% de juros)");
	System.out.print("Digite o código da opção: ");
	codigo = receba.nextInt();

	if (codigo == 1) {
	valorFinal = valorProduto - (valorProduto * 0.15);
	} else if (codigo == 2) {
	valorFinal = valorProduto - (valorProduto * 0.10);
	} else if (codigo == 3) {
	valorFinal = valorProduto;
	} else if (codigo == 4) {
	valorFinal = valorProduto + (valorProduto * 0.10);
	} else {
	System.out.println("Código inválido!");
	receba.close();
	return;
	}

	System.out.printf("Valor final a pagar: R$ %.2f%n", valorFinal);
    receba.close();
		
	}

}
