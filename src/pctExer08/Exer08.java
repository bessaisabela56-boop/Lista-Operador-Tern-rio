package pctExer08;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner (System.in);
		String senhaDigitada;
		String resposta;
		
		System.out.println("Digite seu usuário");
		resposta = receba.nextLine();
		
		System.out.println("Digite a senha");
		senhaDigitada = receba.nextLine();
		
		if (resposta.equals("admin") && senhaDigitada.equals("123")) {
		      System.out.println("acesso permitido");
		}else {
			System.out.println("Acesso negado");
		}
		
		
	}

}
