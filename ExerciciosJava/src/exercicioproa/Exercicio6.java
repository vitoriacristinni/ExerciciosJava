package exercicioproa;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        
	        int ant, suc, um;
	        
	        System.out.print("Digite um n�mero: ");
	        
	       um = in.nextInt();
	        
	        in.nextLine();
	        
	        ant = um - 1;
	        suc = um + 1;
	        
	        System.out.println("O n�mero antecessor �: " + ant);
	        System.out.println("O n�mero sucessor �: " + suc);
	        
	        in.close();
	}
	}