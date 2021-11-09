package Aula_05;

import java.util.Scanner;

/*
 * Ejercicio 2
 * Alumno: Sánchez Feria Yeltsin
 * Descripción: Revisión de la complejidad del tiempo
 * Pregunta: ¿Cuál es la complejidad temporal del método (numberListDesc)?
 * Respuesta: La complejidad del tiempo es: O(n) -> Tiempo lineal
 */

public class Ejercicio2_TimeComplexity {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = s.nextInt();

		System.out.println("---------------------------");
		System.out.println("Numeros enteros desde " + n + " hasta 1");
		System.out.println("---------------------------");
		numberListDesc(n);
	}
	
	//muestra la lista de numeros desde 1 hasta n
	
	public static void numberListDesc(int n) {
		
		for (int i = n; i > 0; i--) {//			|O(n)		|= O(1) * 0(n)
			//statement				|		|= O(n)			
			System.out.println(i);	 //	= O(1)	|		|
		}   //						|		|Time complexity = O(n)
	}
}
