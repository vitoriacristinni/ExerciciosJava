package exercicioproa;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		String nome = sc.next();
		
		System.out.print("Informe seu salário fixo: ");
		double salario = sc.nextDouble();
		
		System.out.print("Informe o total de vendas no mês em $: ");
		double vendas = sc.nextDouble();
		
		double comissao = vendas * 1.5;
		
		double salarioFinal = salario + comissao;
		
		System.out.println("\nVendedor: " + nome);
		System.out.printf("Com o salário fixo:  %.2f" , salario);
		System.out.printf("\nTem o salário final no valor de: %.2f" , salarioFinal);
		
		sc.close();

	}

}