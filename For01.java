package pctEstruturasDeRepetição;

import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner receba = new Scanner(System.in);

	        int funcionarios;
	        double salario;
	        double soma = 0;
	        double maior = 0;
	        double menor = 0;

	        System.out.print("Quantidade de funcionários: ");
	        funcionarios = receba.nextInt();

	        for (int i = 1; i <= funcionarios; i++) {

	            System.out.print("Salário do funcionário " + i + ": ");
	            salario = receba.nextDouble();

	            soma += salario;

	            if (i == 1) {
	                maior = salario;
	                menor = salario;
	            } else {
	                if (salario > maior) {
	                    maior = salario;
	                }

	                if (salario < menor) {
	                    menor = salario;
	                }
	            }
	        }

	        double media = soma / funcionarios;

	        System.out.println("\nRelatório");
	        System.out.println("Média salarial: R$ " + media);
	        System.out.println("Maior salário: R$ " + maior);
	        System.out.println("Menor salário: R$ " + menor);

	        receba.close();
	}

}
