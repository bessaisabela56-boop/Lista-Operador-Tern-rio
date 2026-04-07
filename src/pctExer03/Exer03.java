package pctExer03;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		double salarioMedio, credito;

		System.out.println("Digite o seu salario medio");
		salarioMedio = receba.nextDouble();

		if (salarioMedio <= 500) {
			credito = 0;
		} else if (salarioMedio > 500 && salarioMedio <= 1000) {
			credito = salarioMedio * 0.30;
		} else if (salarioMedio > 1000 && salarioMedio < 3000) {
			credito = salarioMedio * 0.40;
		} else {
			credito = salarioMedio * 0.50;
		}
		System.out.println("O seu saldo médio é de " + salarioMedio + "e o seu crédito é de " + credito);

	}
}
