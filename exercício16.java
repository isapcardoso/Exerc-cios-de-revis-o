package pctExercíciosRevisão;

import java.util.Scanner;

public class exercício16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);

        double fahrenheit, celsius;

        System.out.print("Digite a temperatura em Fahrenheit: ");
        fahrenheit = receba.nextDouble();

        celsius = (5 * (fahrenheit - 32)) / 9;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + "°F");
        System.out.printf("Temperatura em Celsius: %.2f°C%n", celsius);

        receba.close();
		
	}

}
