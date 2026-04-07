package pctExer05;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner receba = new Scanner(System.in);
	        int dia;
	        System.out.println("Digite o dia");
	        dia = receba.nextInt();
	        switch(dia) {
	        case 1:
	        case 2:
	        case 3:
	        case 4:
	        case 5:
	        	System.out.println("Hoje é dia útil.");
	        	break;
	        case 6:
	        case 7:
	        	System.out.println("Hoje é fim de semana");
	        	break;
	        	default:
	        		System.out.println("dia invalido");
	}

	}}

