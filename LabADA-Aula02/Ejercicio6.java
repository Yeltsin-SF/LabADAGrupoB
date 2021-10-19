package Aula_01;

import java.util.*;

/*
 * Alumno: Sánchez Feria Yeltsin
 * Ejercicio 6
 * Detalles del Ejercicio: Modificar el programa anterior para definir el número de espacios entre el marco y las palabras.
 */

public class Ejercicio6_marco_n_espacios {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String palabras;
		int n;

		System.out.println("Ingrese el número de espacios : ");
		n = s.nextInt();

		System.out.println("Ingrese las palabras por favor : ");
		palabras = s.next();

		char[] arrayChar = palabras.toCharArray();
		int tam = arrayChar.length;

		for (int i = 0; i < tam - (tam / 3); i++) {
			System.out.print("**");
		}

		System.out.println();

		for (int i = 0; i < n; i++) {

			System.out.print("*");
			for (int j = 0; j < n; j++) {
				System.out.print("  ");
			}

			System.out.println("*");
		}

		System.out.print("*");

		System.out.println();

		System.out.print("*");

		System.out.print(" " + palabras + " ");

		System.out.println("*");

		for (int i = 0; i < n; i++) {

			System.out.print("*");
			for (int j = 0; j < n; j++) {
				System.out.print("  ");
			}

			System.out.println("*");
		}
		for (int i = 0; i < tam - (tam / 3); i++) {
			System.out.print("**");
		}

	}
}
