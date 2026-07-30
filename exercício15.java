package pctExercíciosRevisão;

import java.util.Scanner;

public class exercício15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner receba = new Scanner(System.in);

	     double ladoA, ladoB, ladoC;

   System.out.print("Digite o primeiro lado do triângulo: ");
   ladoA = receba.nextDouble();

   System.out.print("Digite o segundo lado do triângulo: ");
   ladoB = receba.nextDouble();

   System.out.print("Digite o terceiro lado do triângulo: ");
   ladoC = receba.nextDouble();

   if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {

   if (ladoA == ladoB && ladoB == ladoC) {
   System.out.println("Triângulo Equilátero");
   } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
   System.out.println("Triângulo Isósceles");
   } else {
   System.out.println("Triângulo Escaleno");
   }

   } else {
   System.out.println("Os valores informados não formam um triângulo válido.");
   }

   receba.close();	
	}

}
