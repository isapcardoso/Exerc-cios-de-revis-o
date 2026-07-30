package pctExercíciosRevisão;

import java.util.Scanner;

public class exercício21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);

        double valorHoraAula;
        int quantidadeAulas;
        double salarioBruto;
        double descontoINSS;
        double salarioLiquido;
        double aliquota;
        double parcelaDeduzir;

    System.out.print("Digite o valor da hora aula: R$ ");
    valorHoraAula = receba.nextDouble();

    System.out.print("Digite o número de aulas no mês: ");
    quantidadeAulas = receba.nextInt();

    salarioBruto = valorHoraAula * quantidadeAulas;

    if (salarioBruto <= 1621.00) {
        aliquota = 0.075;
        parcelaDeduzir = 0;
    } 
    else if (salarioBruto <= 2902.84) {
        aliquota = 0.09;
        parcelaDeduzir = 24.32;
    } 
    else if (salarioBruto <= 4354.27) {
        aliquota = 0.12;
        parcelaDeduzir = 111.40;
    } 
    else if (salarioBruto <= 8475.55) {
        aliquota = 0.14;
        parcelaDeduzir = 198.49;
    } 
    else {
        aliquota = 0.14;
        parcelaDeduzir = 198.49;
    }

    descontoINSS = (salarioBruto * aliquota) - parcelaDeduzir;

    salarioLiquido = salarioBruto - descontoINSS;

    System.out.printf("\nSalário Bruto: R$ %.2f%n", salarioBruto);
    System.out.printf("Desconto INSS: R$ %.2f%n", descontoINSS);
    System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

    receba.close();
		
	}

}
