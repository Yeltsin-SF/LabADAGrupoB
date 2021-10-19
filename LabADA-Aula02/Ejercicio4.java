package Aula_02;

import java.util.Scanner;
/*
 * Alumno: Sánchez Feria
 * Ejercicio 4
 * Detalles del Ejercicio: Busqueda Secuencial
 */
import java.util.Timer;

public class Ejercicio4_BusquedaSecuencial {

	public static void main(String[] arg) {
		int n = 10;
		while (n <= 100000000) {
			int[] array = crearArray(n);
			System.out.println("\ncantidad de elementos en el array " + n);
			timer(array, n - 1);
			n = n * 10;

		}
	}

	private static boolean BusquedaSecuencial(int[] array, int t) {
		for (int i = 0; i <= array.length - 1; i++) {
			if (array[i] == t) {

				return true;
			}
		}
		return false;
	}

	private static int[] crearArray(int n) {
		int x = 0;
		int[] array = new int[n];
		for (int i = 0; i <= array.length - 1; i++) {
			array[i] = x;
			x = x + 1;
		}

		return array;
	}

	private static void timer(int array[], int searched) {
		double inicio = System.nanoTime();
		System.out.println("¿ Se encuentra " + searched + " ? " + BusquedaSecuencial(array, searched));
		double fin = System.nanoTime();
		System.out.println("Se demoro: " + (fin - inicio) + " nanosegundos");
	}

}
