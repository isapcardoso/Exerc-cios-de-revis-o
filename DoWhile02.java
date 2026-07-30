package pctEstruturasDeRepetição;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner receba = new Scanner(System.in);

	        int num;
	        int maior = Integer.MIN_VALUE;

	        do {
	            System.out.print("Digite um número (-1 para finalizar): ");
	            num = receba.nextInt();

	            if (num != -1 && num > maior) {
	                maior = num;
	            }

	        } while (num != -1);

	        if (maior != Integer.MIN_VALUE) {
	            System.out.println("Maior número = " + maior);
	        } else {
	            System.out.println("Nenhum número foi digitado.");
	        }

	        receba.close();
	}

}
