package exercicioproa;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int qtdNum = 0;
		int qtdNum2 = 0;
		int qtdNum3 = 0;

		for (int i = 1; i <= 20; i++) {
			System.out.print("Informe o " + i + "� n�mero: ");
			int num = sc.nextInt();

			if (num >= 0 && num <= 100) {
				qtdNum += 1;
			}else if(num >= 101 && num <= 200) {
				qtdNum2 += 1;
			}else if(num > 200) {
				qtdNum3 += 1;
			}
		}

		System.out.println("\nQuantidade de n�meros digitados que est�o entre 0 e 100: " + qtdNum);
		System.out.println("\nQuantidade de n�meros digitados que est�o entre 101 e 200: " + qtdNum2);
		System.out.println("\nQuantidade de n�meros digitados que s�o maiores que 200: " + qtdNum3);

		sc.close();
	}

}