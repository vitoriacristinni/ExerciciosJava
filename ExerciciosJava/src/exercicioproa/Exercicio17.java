package exercicioproa;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int qtdMaior = 0;
		int qtdMenor = 0;
		
		for(int i=1; i<=20; i++) {
			System.out.print("Informe a " + i + "º idade: ");
			int idade = sc.nextInt();
			
			if(idade >= 18) {
				qtdMaior += 1;
			}else {
				qtdMenor += 1;
			}
		}
		
		System.out.println("\nQuantidade de pessoas maiores de idade: " + qtdMaior);
		System.out.println("Quantidade de pessoas menores de idade: " + qtdMenor);
		
		sc.close();

	}

}