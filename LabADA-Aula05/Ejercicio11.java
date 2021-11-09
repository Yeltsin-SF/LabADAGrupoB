package Aula_05;

import java.util.Scanner;

/*
 * Ejercicio 11
 * Alumno: Sánchez Feria Yeltsin
 * Descripción: Revisión de la complejidad del tiempo
 * Pregunta: ¿Cuál es la complejidad temporal del método (logarithmicMethod)?
 * Respuesta: La complejidad del tiempo es: O(log_2(log_2(n))) -> Tiempo logarítmico 
 */

public class Ejercicio11_TimeComplexity {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = s.nextInt();

		System.out.println("-----------------------------");
		System.out.println("Resultado");
		System.out.println("-----------------------------");
		logarithmicMethod(n);
	}

	//

	public static void logarithmicMethod(int n) {	  							
		int p = 0;//							       _			     ___	
		for (int i = 1; i < n; i = i*2) {//					|O(log_2(n))			|	
			p++;//								|				|
			System.out.println(" i = " + i + ", p = " + p);	 //	= O(1)	|				|
		}   //								       _|				|			
			//							       _				|
		for (int j = 1; j < p; j = j*2) {//					|p = O(log_2(n))		|Time complexity = O(log_2((log_2(n)))	
			p++;//								|				|
			System.out.println(" j = " + j + ", p = " + p);	 //	= O(1)	|O(log_2(p))			|		
		}   //								       _|			      __|					
	}
}	

/*	

	So, we have log(p) and p = log(n)
	replacing log (log(n))
	O(log (log(n)))

 */


