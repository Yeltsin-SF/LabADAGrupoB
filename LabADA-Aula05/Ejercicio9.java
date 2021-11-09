package Aula_05;

import java.util.Scanner;

/*
 * Ejercicio 9
 * Alumno: Sánchez Feria Yeltsin
 * Descripción: Revisión de la complejidad del tiempo
 * Pregunta: ¿Cuál es la complejidad temporal del método (rootMethod)?
 * Respuesta: La complejidad del tiempo es: O(sqrt(n)) -> Tiempo de raiz cuadrada     
 */

public class Ejercicio9_TimeComplexity {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = s.nextInt();

		System.out.println("----------------------------------");
		System.out.println("Lista de numeros desde el 0 hasta sqrt(" + (n-1) + ")");
		System.out.println("----------------------------------");
		rootMethod(n);
	}

	//

	public static void rootMethod(int n) {
		
		for (int i = 0; i * i < n; i++) {//					|O(sqrt(n))		|= O(1) * 0(sqrt(n))
			//statement							|			|= O(sqrt(n))
			System.out.println(i);	 //	= O(1)				|			|
		}   //									|			|Time complexity = O(sqrt(n))					
	}
}	

/*	
 
	Condition       	i * i < n
	To finish       	i * i >= n
	We assume that     	i^2 = n
                    	i = sqrt(n)
		
	complexity = O(sqrt(n))
 
 */
