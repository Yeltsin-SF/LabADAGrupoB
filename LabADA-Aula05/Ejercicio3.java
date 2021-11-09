package Aula_05;

import java.util.Scanner;

/*
 * Ejercicio 3
 * Alumno: Sánchez Feria Yeltsin
 * Descripción: Revisión de la complejidad del tiempo
 * Pregunta: ¿Cuál es la complejidad temporal del método (parNumberList)?
 * Respuesta: La complejidad del tiempo es: O(n) -> Tiempo lineal 
 */

public class Ejercicio3_TimeComplexity {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = s.nextInt();

		System.out.println("---------------------------");
		System.out.println("Numeros enteros pares <= " + ((n)));
		System.out.println("---------------------------");
		parNumberList(n);
	}
	
	//muestra los numeros pares menores o iguales a n 

	public static void parNumberList(int n) {

		for (int i = 0; i < n; i = i+2) {//		|O(n/2)		|= O(1) * 0(n/2)
			//statement				|		|= O(n/2)
			System.out.println(i);	 //	= O(1)	|		|= O(n)
		}   //						|		|Time complexity = O(n)
	}
}
