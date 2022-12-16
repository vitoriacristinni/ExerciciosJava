package exercicioproa;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int calorias = 0;
		
		System.out.println("Escolha seu prato: \n1-Vegetariano 2-Peixe 3-Frango 4-Carne");
		int prato = sc.nextInt();
		
		switch(prato){
		case 1:
			calorias += 180;
			break;
		case 2:
			calorias += 230;
			break;
		case 3:
			calorias += 250;
			break;
		case 4:
			calorias += 350;
			break;
		default:
			System.out.println("Opção Inválida");
		}
		
		System.out.println("Escolha a sobremesa: \n1-Abacaxi 2-Sorvete Diet 3-Mousse Diet 4-Mousse de Chocolate");
		int sobremesa = sc.nextInt();
		
		switch(sobremesa){
		case 1:
			calorias += 75;
			break;
		case 2:
			calorias += 110;
			break;
		case 3:
			calorias += 170;
			break;
		case 4:
			calorias += 200;
			break;
		default:
			System.out.println("Opção Inválida");
		}

		System.out.println("Escolha uma bebida: \n1-Chá 2-Suco de Laranja 3-Suco de Melão 4-Refrigerante Diet");
		int suco = sc.nextInt();
		
		switch(suco){
		case 1:
			calorias += 20;
			break;
		case 2:
			calorias += 70;
			break;
		case 3:
			calorias += 100;
			break;
		case 4:
			calorias += 65;
			break;
		default:
			System.out.println("Opção Inválida");
		}
		
		System.out.println("\nTotal de calorias da refeição: " + calorias);
		
		sc.close();
	}

}