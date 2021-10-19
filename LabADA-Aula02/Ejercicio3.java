package Aula_02;

import java.util.Scanner;

/*
 * Alumno: Sánchez Feria Yeltsin 
 * Ejercicio 3
 * Detalles del Ejercicio: Insertion Algorithm
 */
public class Ejercicio3_InsertionSort {
	public static void main(String[] arg) {
		int n;
		Scanner s = new Scanner(System.in);
		int searched, position;
		System.out.println("Ingrese el valor de n :");
		n = s.nextInt();
		int[] numbersL = new int[n];
		System.out.println("--------------------");
		System.out.println("Ingrese los números :");
		System.out.println("--------------------");
		for (int i = 0; i <= numbersL.length - 1; i++) {
			numbersL[i] = s.nextInt();
		}
		insertionAlgorithm(numbersL);
		System.out.println("----------------------");
		System.out.println("Números ordenados :");
		System.out.println("----------------------");
		for (int i = 0; i < numbersL.length; i++)// muestra el ordenamiento de menor a mayor
			System.out.println(numbersL[i] + " ");
	}

	// metodo de ordenacion por insercion
	public static void insertionAlgorithm(int x[]) {
		int aux, j;
		for (int i = 1; i < x.length; i++) {
			aux = x[i];
			j = (i - 1);
			while (j > -1 && x[j] > aux) {
				x[j + 1] = x[j];
				j = j - 1;
			}
			x[j + 1] = aux;
		}
	}
}
