package Aula_01;

import java.util.*;

/*
 * Alumno: Sánchez Feria Yeltsin
 * Ejercicio 5
 * Detalles del Ejercicio: Leer 3 números y mostrarlos en orden ascendente
 */
public class Ejercicio5_marco_texto {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String palabras;

		System.out.println("Ingrese las palabras por favor : ");

		palabras = s.next();

		char[] arrayChar = palabras.toCharArray();
		int tam = arrayChar.length;

		for (int i = 0; i < tam - (tam / 3); i++) {
			System.out.print("**");
		}

		System.out.println();

		System.out.print("*");

		System.out.print(" " + palabras + " ");

		System.out.println("*");

		for (int i = 0; i < tam - (tam / 3); i++) {
			System.out.print("**");
		}

	}
}
