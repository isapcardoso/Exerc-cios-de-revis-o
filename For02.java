package pctEstruturasDeRepetição;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);

        int num1, num2;
        int resultado = 0;

        System.out.print("Digite o primeiro número: ");
        num1 = receba.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = receba.nextInt();

        for (int i = 1; i <= num1; i++) {
            resultado += num2;
        }

        System.out.println("Resultado = " + resultado);

        receba.close();
	}

}
