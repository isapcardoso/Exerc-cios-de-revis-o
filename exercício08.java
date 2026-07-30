package pctExercíciosRevisão;

import java.util.Scanner;

public class exercício08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner receba = new Scanner(System.in);

        int A, B, C;

    System.out.print("Digite o primeiro valor: ");
    A = receba.nextInt();

    System.out.print("Digite o segundo valor: ");
    B = receba.nextInt();

    System.out.print("Digite o terceiro valor: ");
    C = receba.nextInt();

    if (A > B && A > C) {
       if (B > C) {
            System.out.println(A + " " + B + " " + C);
       } else {
            System.out.println(A + " " + C + " " + B);
        }
    } else if (B > A && B > C) {
        if (A > C) {
            System.out.println(B + " " + A + " " + C);
        } else {
            System.out.println(B + " " + C + " " + A);
        }
    } else {
        if (A > B) {
            System.out.println(C + " " + A + " " + B);
        } else {
            System.out.println(C + " " + B + " " + A);
        }
    }

    receba.close();	
	}

}
