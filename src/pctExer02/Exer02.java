package pctExer02;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);
		double peso, altura;
		double result;

		System.out.println("Digite seu peso");
		peso = receba.nextDouble();
		System.out.println("Digite sua altura");
		altura = receba.nextDouble();

		System.out.println("Calculo do IMC");
		result = peso / (altura * altura);
		System.out.println("REsultado " +result );
		if (result < 18.5) {
			System.out.println("Seu IMC esta abaixo do normal");
		} else if (result >= 18.5 && result <= 25) {
			System.out.println("Seu IMC esta normal");
		} else if (result >= 25 && result <= 30) {
			System.out.println("Seu IMC indica sobrepeso");
		} else if (result >= 25 && result <= 40) {
			System.out.println("Seu IMC indica obesidade");
		} else {
			System.out.println("Seu IMC indica obesidade mórbida");

		}

	}

}
