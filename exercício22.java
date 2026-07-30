package pctExercíciosRevisão;

import java.util.Scanner;

public class exercício22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);

        double tempo, velocidadeMedia, distancia, litrosUsados;

        System.out.print("Digite o tempo gasto na viagem (horas): ");
        tempo = receba.nextDouble();

        System.out.print("Digite a velocidade média (km/h): ");
        velocidadeMedia = receba.nextDouble();

        distancia = tempo * velocidadeMedia;

        litrosUsados = distancia / 12;

        System.out.println("\nTempo gasto na viagem: " + tempo + " horas");
        System.out.println("Velocidade média: " + velocidadeMedia + " km/h");
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.printf("Quantidade de combustível utilizada: %.2f litros%n", litrosUsados);

        receba.close();
		
	}

}
