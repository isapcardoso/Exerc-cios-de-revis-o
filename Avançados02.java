package pctEstruturasDeRepetição;

import java.util.Random;
import java.util.Scanner;

public class Avançados02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        Random aleatorio = new Random();
        int numeroSecreto = aleatorio.nextInt(100);

        int tentativa;

        while (true) {

            System.out.print("Digite um número entre 0 e 99: ");
            tentativa = sc.nextInt();

            if (tentativa == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número.");
                break;
            } else if (tentativa < numeroSecreto) {
                System.out.println("MAIOR");
            } else {
                System.out.println("MENOR");
            }
        }

        sc.close();
    }
}