package pctExer13;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner (System.in);
		int num1, num2, num3;
		
		System.out.println("Digite o primeiro lado:");
        num1 = receba.nextInt();

        System.out.println("Digite o segundo lado:");
        num2 = receba.nextInt();

        System.out.println("Digite o terceiro lado:");
        num3 = receba.nextInt();

        
        if (num1 == num2 && num2 == num3) {
            System.out.println("Triângulo Equilátero");
        } else if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Triângulo Isósceles");
        } else {
            System.out.println("Triângulo Escaleno");
        }

        receba.close();
	
	
	
	}

}
