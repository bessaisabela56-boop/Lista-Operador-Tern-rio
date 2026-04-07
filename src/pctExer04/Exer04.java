package pctExer04;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		int option;
		int kcal = 0;
		int quantidade;

		System.out.println("TABELA NUTRICIONAL");
		System.out.println("1- Vegetariano (180kcal)");
		System.out.println("2- Peixe (230kcal)");
		System.out.println("3- Frango (250kcal)");
		System.out.println("4- Carne (350kcal)");
		System.out.println("Escolha um Prato:");
		option = receba.nextInt();
		
		switch(option) {
        case 1:
        	kcal +=180;
        	break;
        case 2:
        	kcal +=230;
        	break;
        case 3:
        	kcal +=250;
        	break;
        case 4:
        	kcal +=350;
        	break;
        default:
    		System.out.println("opcao invalida");
    	}
		
	
		System.out.println("Sobremesas:");
		System.out.println("1- Abacaxi (75kcal)");
		System.out.println("2- Sorvete diet (110kcal)");
		System.out.println("3- Mouse diet (170kcal)");
		System.out.println("4- Mouse diet (200kcal)");
		System.out.println("Escolha sua sobremesa:");
		option = receba.nextInt();
		
		switch(option) {
        case 1:
        	kcal +=75;
        	break;
        case 2:
        	kcal +=110;
        	break;
        case 3:
        	kcal +=170;
        	break;
        case 4:
        	kcal +=200;
        	break;
        default:
    		System.out.println("opcao invalida");
    	}
		
		System.out.println("1- Chá (20kcal)");
		System.out.println("2- Suco de Laranja (70kcal)");
		System.out.println("3- Suco de melão (100kcal)");
		System.out.println("4- Refrigerante diet (65 kcal)");
		System.out.println("Escolha a sua Bebida");
		option = receba.nextInt();
		switch(option) {
        case 1:
        	kcal +=20;
        	break;
        case 2:
        	kcal +=70;
        	break;
        case 3:
        	kcal +=100;
        	break;
        case 4:
        	kcal +=65;
        	break;
        default:
    		System.out.println("opcao invalida");
    	}
		
		
		
		System.out.println("O total de calorias da sua compra é de: " + kcal);
		
		
		
	}

}
