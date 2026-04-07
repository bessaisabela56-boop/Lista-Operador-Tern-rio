package pctExer12;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner receba = new Scanner (System.in);
		int numero;
		
		 System.out.print("Informe um número inteiro: ");
	        numero = receba.nextInt();

	        if (numero % 3 == 0) {
	            System.out.println(numero + " é divisível por 3");
	        }
	        if (numero % 5 == 0) {
	            System.out.println(numero + " é divisível por 5");
	        }
	       
	        if ( numero % 5 != 0 && numero % 3 != 0) {
	            System.out.println(numero + " não é divisível por 5 ou 3");
	        }

	        receba.close();
		
	}

}
