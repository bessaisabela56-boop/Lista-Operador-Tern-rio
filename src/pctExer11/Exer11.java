package pctExer11;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner (System.in);
		int opcao;
		
		System.out.println("Menu de Opções");
        System.out.println("1 - Ver saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sair");
        System.out.print("Escolha uma opção: ");
        opcao = receba.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Opção selecionada: Ver saldo.");
                break;
            case 2:
                System.out.println("Opção selecionada: Depositar.");
                break;
            case 3:
                System.out.println("Encerrando o programadd");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        receba.close();
	}

}
