package exercicioproa;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        
	        int ant, suc, um;
	        
	        System.out.print("Digite um número: ");
	        
	       um = in.nextInt();
	        
	        in.nextLine();
	        
	        ant = um - 1;
	        suc = um + 1;
	        
	        System.out.println("O número antecessor é: " + ant);
	        System.out.println("O número sucessor é: " + suc);
	        
	        in.close();
	}
	}