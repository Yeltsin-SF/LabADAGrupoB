package Aula_05;

import java.util.Scanner;

/*
 * Ejercicio 5
 * Alumno: Sánchez Feria Yeltsin
 * Descripción: Revisión de la complejidad del tiempo
 * Pregunta: ¿Cuál es la complejidad temporal del método (twoNumbers)?
 * Respuesta: La complejidad del tiempo es: O(n²) -> Tiempo cuadrático 
 */

public class Ejercicio5_TimeComplexity {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = s.nextInt();

		System.out.println("-----------------------------");
		System.out.println("Resultado ");
		System.out.println("-----------------------------");
		twoNumbers(n);
	}

	//muestra pares de numeros 

	public static void twoNumbers(int n) {
		//						      __					    ____
		for (int i = 0; i < n; i++) {//				|= O(n)	  	      __			|
			for (int j = 0; j < i; j++) {//						|= O(1)*0((n+1)/2)	|= O(n) * 0(n)
			//statement								|= O(n/2)		|
			System.out.println(i + " - " + j);	//= O(1)			|= O(n)			|= O(n²)
			}//								      __|			|
		}   //						      __|					    ____|Time complexity = O(n²)
	}//																	
}	

/*	Tracing the values of the variables
	i   j      nº of times
	------------------------
	0   0 ❌     0
	------------------------
	1   0 ✔️     1
  		1 ❌     
	------------------------
	2   0 ✔️     2
		1 ✔️  
		2 ❌ 
	------------------------
	.    
	.    
	.    
	------------------------
	n             n

	1 + 2 + 3 + ... + n = n * (n + 1) / 2    
	O(n²)
 
 */
