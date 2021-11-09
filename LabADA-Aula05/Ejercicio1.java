package Aula_05;

import java.util.*;

/*
 * Ejercicio 1
 * Alumno: Sánchez Feria Yeltsin
 * Descripcion: Revisión de la complejidad del tiempo
 * Pregunta: ¿Cuál es la complejidad temporal del método (numberListAsc)?
 * Respuesta: La complejidad del tiempo es: O(n) -> Tiempo lineal 
 */

public class Ejercicio1_TimeComplexity {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = s.nextInt();

		System.out.println("---------------------------");
		System.out.println("Numeros enteros del 0 a " + (n-1));
		System.out.println("---------------------------");
		numberListAsc(n);
	}
	
	//muestra la lista de numeros desde 0 hasta n-1 
	
	public static void numberListAsc(int n) {

		for (int i = 0; i < n; i++) {//						|O(n)		|= O(1) * 0(n)
			//statement							|		|= O(n)
			System.out.println(i);	 //	= O(1)				|		|
		}   //									|		|Time complexity = O(n)
	}
}
