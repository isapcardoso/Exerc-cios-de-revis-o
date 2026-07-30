package pctEstruturasDeRepetição;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner receba = new Scanner(System.in);

	        int numero = -1;

	        while (numero != 0) {
	            System.out.print("Digite um número (0 para sair): ");
	            numero = receba.nextInt();

	            System.out.println("Número digitado: " + numero);
	        }

	        System.out.println("Programa encerrado.");
	        receba.close();
	    }
	}


