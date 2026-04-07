package pctExer07;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);
		double compra, desconto;

		System.out.println("Digite o valor de uma compra");
		compra = receba.nextDouble();
		
		if (compra > 100) {
		   desconto= compra * 0.10;
		
		} else {
			desconto= 0.0;
		}
		System.out.println("O seu desconto é de " + desconto);

	}
}
