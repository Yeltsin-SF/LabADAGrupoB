package Aula_05;

import java.util.Scanner;

/*
 * Ejercicio 4
 * Alumno: Sánchez Feria Yeltsin
 * Descripción: Revisión de la complejidad del tiempo
 * Pregunta: ¿Cuál es la complejidad temporal del método (twoNumbers)?
 * Respuesta: La complejidad del tiempo es: O(n²) --> Tiempo cuadrático 
 */

public class Ejercicio4_TimeComplexity {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = s.nextInt();

		System.out.println("-----------------------------");
		System.out.println("Par de numeros entre 0 y " + ((n-1)));
		System.out.println("-----------------------------");
		twoNumbers(n);
	}

	//muestra los pares de numeros que se pueden formar con los numeros entre 0 y n-1

	public static void twoNumbers(int n) {
		//							  __				    ____
		for (int i = 0; i < n; i++) {//				    |= O(n)   __			|
			for (int j = 0; j < n; j++) {//					|			|
			//statement							|= O(1) * 0(n)		|= O(n) * 0(n)
			System.out.println(i + " - " + j);	//= O(1)		|= O(n)			|= O(n²)
			}//						      	      __|			|
		}   //							  __|				    ____|Time complexity = O(n²)
	}//																	
}	
