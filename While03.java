package pctEstruturasDeRepetição;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner receba = new Scanner(System.in);

	        double preco, total = 0;
	        String continuar = "S";

	        while (continuar.equalsIgnoreCase("S")) {
	            System.out.print("Digite o preço do produto: R$ ");
	            preco = receba.nextDouble();

	            total += preco;

	            System.out.print("Deseja adicionar outro produto? (S/N): ");
	            continuar = receba.next();
	        }

	        System.out.println("Valor total dos produtos: R$ " + total);

	        receba.close();
	}

}
