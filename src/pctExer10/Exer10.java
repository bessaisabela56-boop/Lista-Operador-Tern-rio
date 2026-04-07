package pctExer10;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner (System.in);
		int num;
		 
		System.out.println("Digite o seu IMC");
		int num1= receba.nextInt();
		
		
		if (num1 < 18) {
		System.out.println("Você esta Magro");
		}else if (num1 >=18 && num1 <=25){
			System.out.println("Você esta normal");
		}else {
			System.out.println("Você esta acima do peso");
			}
	}

}
