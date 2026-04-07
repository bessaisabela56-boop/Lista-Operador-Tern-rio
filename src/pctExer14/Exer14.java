package pctExer14;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner (System.in);
		double valorUnitario;
        int quantidade;
        double ipi;
        double totalSemImposto;
        double totalComImposto;

       
        System.out.println("Digite o valor unitário do produto:");
        valorUnitario = receba.nextDouble();

        System.out.println("Digite a quantidade:");
        quantidade = receba.nextInt();

        System.out.println("Digite o percentual de IPI (%):");
        ipi = receba.nextDouble();

        
        totalSemImposto = valorUnitario * quantidade;
        totalComImposto = totalSemImposto + (totalSemImposto * ipi / 100);

       
        System.out.println("Total sem imposto: R$ " + totalSemImposto);
        System.out.println("Total com IPI: R$ " + totalComImposto);

        receba.close();
	}

}
