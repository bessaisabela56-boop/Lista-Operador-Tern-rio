package pctExer01;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);
		int num;
		System.out.println("Digite um numero");
		num=receba.nextInt();
		
		if( num % 2==0 || num % 10==0 || num % 5==0) {
	    	System.out.println("o numero é divisel por 2, 5 ou 10");
	    }else {
	    	System.out.println("o numero não é divisel por 2, 5 e nem por 10");
	    }
		
		
		
		
	}

}
