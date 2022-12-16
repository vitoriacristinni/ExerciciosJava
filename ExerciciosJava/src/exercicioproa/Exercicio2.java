package exercicioproa;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int num = sc.nextInt();
		
		if(num % 10 == 0 && num % 5 == 0 && num % 2 == 0) {
			System.out.println("Este número é divisível por 10, 5, 2!");
		}else if(num % 5 == 0 ) {
			System.out.println("Este número é divisível por 5!");
		}else if(num % 2 == 0) {
			System.out.println("Este número é divisível por 2!");
		}else {
			System.out.println("Este número não é divisível por nenhum deles!");
		}
		
		sc.close();
	}

}
