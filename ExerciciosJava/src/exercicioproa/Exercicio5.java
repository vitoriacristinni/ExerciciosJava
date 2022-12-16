package exercicioproa;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe sua idade: ");
		int idade = sc.nextInt();
		
		if(idade >= 18 && idade <= 65) {
			System.out.println("Voto obrigatório");
		}else if(idade >= 16 || idade > 65) {
			System.out.println("Seu voto é opcional");
		}else {
			System.out.println("Seu voto não é obrigatório");
		}
		
		sc.close();

	}

}
