package Aula_05;

import java.util.*;

/*
 * Ejercicio 10
 * Alumno: Sánchez Feria Yeltsin
 * Descripción: Revisión de la complejidad del tiempo
 * Pregunta: ¿Cuál es la complejidad temporal del método (numberListAsc)?
 * Respuesta: La complejidad del tiempo es: O(n) --> Tiempo lineal 
 */

public class Ejercicio10_TimeComplexity {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = s.nextInt();

		System.out.println("---------------------------");
		System.out.println("Numeros enteros del 0 a " + (n-1) + " n veces");
		System.out.println("---------------------------");
		numberListAsc(n);
	}
	
	//muestra la lista de numeros desde 0 hasta n-1, n veces 
	
	public static void numberListAsc(int n) {
			//						       _			  	    ____		
		for (int i = 0; i < n; i++) {//			|O(n)		|= O(1) * 0(n)				|
			//statement				|		|= O(n)					|= O(n) + O(n)
			System.out.println(i);	 //	= O(1)	|		|					|		
		}   //						|	       _|Time complexity = O(n)			|= O(2n)
			//						       _					|
		for (int i = 0; i < n; i++) {//			|O(n)   	|= O(1) * 0(n)				|= O(n)
			//statement				|		|= O(n)					|
			System.out.println(i);	 //	= O(1)	|		|					|Time complexity = O(n)
		}   //						|	       _|Time complexity = O(n)	     	     ___|
	}
}
