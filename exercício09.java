package pctExercíciosRevisão;

import java.util.Scanner;

public class exercício09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);

        double peso, altura, imc;

   System.out.print("Digite seu peso (kg): ");
   peso = receba.nextDouble();

   System.out.print("Digite sua altura (m): ");
   altura = receba.nextDouble();

   imc = peso / (altura * altura);

   System.out.printf("Seu IMC é: %.2f\n", imc);

   if (imc < 18.5) {
   System.out.println("Condição: Abaixo do peso");
   } else if (imc >= 18.5 && imc <= 24.9) {
   System.out.println("Condição: Peso ideal (parabéns)");
   } else if (imc >= 25.0 && imc <= 29.9) {
   System.out.println("Condição: Levemente acima do peso");
   } else if (imc >= 30.0 && imc <= 34.9) {
   System.out.println("Condição: Obesidade grau I");
   } else if (imc >= 35.0 && imc <= 39.9) {
   System.out.println("Condição: Obesidade grau II (severa)");
   } else {
   System.out.println("Condição: Obesidade grau III (mórbida)");
   }

    receba.close();	
	}

}
