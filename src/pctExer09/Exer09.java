package pctExer09;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner (System.in);
		int num;
		
		System.out.println("Digite um numero");
		num= receba.nextInt();
		
		if (num >=10 && num <=50) {
            System.out.println("Dentro do intervalo");
        } else {
            System.out.println("fora do intervalo");
        }
	}

}
