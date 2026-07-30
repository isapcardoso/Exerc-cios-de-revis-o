package pctEstruturasDeRepetição;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner receba = new Scanner(System.in);

	        double cotacao, dolar, reais;
	        String continuar = "S";

	        System.out.print("Digite a cotação do dólar: ");
	        cotacao = receba.nextDouble();

	        while (continuar.equalsIgnoreCase("S")) {
	            System.out.print("Digite o valor em dólares: ");
	            dolar = receba.nextDouble();

	            reais = dolar * cotacao;

	            System.out.println("Valor em reais: R$ " + reais);

	            System.out.print("Deseja continuar? (S/N)");
	            continuar = receba.next();
	        }

	       
	}

}
