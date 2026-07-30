package pctEstruturasDeRepetição;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int num;
        int soma = 0;
        int contador = 0;
        double media;

        do {
            System.out.print("Digite um número (-1 para finalizar): ");
            num = sc.nextInt();

            if (num != -1) {
                soma += num;
                contador++;
            }

        } while (num != -1);

        if (contador > 0) {
            media = (double) soma / contador;
            System.out.println("Soma = " + soma);
            System.out.println("Média = " + media);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }

        sc.close();

	}

}
