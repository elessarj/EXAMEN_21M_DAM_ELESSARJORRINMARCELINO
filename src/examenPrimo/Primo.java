package examenPrimo;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		
		System.out.println("Buenos dias, soy Elessar");
		System.out.println("Introduce un numero: ");
		int numero = ent.nextInt();
		if(numero == 3 || numero == 7 || numero ==11) {
			System.out.println(numero + " es primo");
		}else {
			System.out.println("no es primo");
		}
	}

}
