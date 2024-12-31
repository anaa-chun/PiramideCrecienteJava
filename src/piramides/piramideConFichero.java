package piramides;

import java.io.*;
import java.util.Scanner;

public class piramideConFichero {

	public static Scanner sr = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduzca un número: ");
		int n = sr.nextInt();

		try {
			String nombreArchivo = "piramide.txt";
			BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo));

			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*"); 
					bw.write("*"); 
				}
				
				System.out.println(""); 
				bw.write("\n"); 
			}

			bw.close();
			System.out.println("Archivo creado con el nombre " + nombreArchivo);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
