package pctExer06;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);
        double num1, num2, resultado =0;
        char operacao;
       
        System.out.println("Digite o primeiro numero");
        num1 = receba.nextInt();

        System.out.println("Digite o segundo numero");
        num2= receba.nextInt();

        
        System.out.println("Digite a operação");
        operacao= receba.next().charAt(0);
        
        switch (operacao) {
        case '+':
        	resultado= num1 + num2;
        	break;
        case '-':
        	resultado= num1 - num2;
        	break;
        case '%':
        	resultado= num1 % num2;
        case '*':
            resultado= num1 * num2;
        break;
        default:
    		System.out.println("operação invalida");
        
        	
        
    	}
        
        
        System.out.println("Resultado: " + resultado);
        
        
        
        


	}}
