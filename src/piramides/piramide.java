package piramides;

import java.util.Scanner;

public class piramide {
	
	public static Scanner sr = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduzca un número: ");
		int n = sr.nextInt();

		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
