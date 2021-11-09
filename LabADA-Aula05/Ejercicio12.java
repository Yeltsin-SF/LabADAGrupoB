package Aula_05;

import java.util.Scanner;

/*
 * Ejercicio 12
 * Alumno: Sánchez Feria Yeltsin
 * Descripción: Revisión de la complejidad del tiempo
 * Pregunta: ¿Cuál es la complejidad temporal del método (twoNumbers)?
 * Respuesta: La complejidad del tiempo es: O(n(log_2(n))) -> Tiempo logarítmico lineal
 */

public class Ejercicio12_TimeComplexity {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = s.nextInt();

		System.out.println("-----------------------------");
		System.out.println("Par de numeros entre 0 y " + ((n - 1)));
		System.out.println("-----------------------------");
		twoNumbers(n);
	}

	//

	public static void twoNumbers(int n) {
		//				 			      __ 			    ____
		for (int i = 0; i < n; i++) {//					|= O(n)  __       		| (1)
			for (int j = 1; j < n; j = j * 2) {// 				   | 			| (2)
				// statement 						   |= O(log_2(n)) 	|= O(n) * O(log_2(n)) (3)
				System.out.println(i + " - " + j); // = O(1)		   | 			|= O(nlog_2(n))
			} // 						      	         __| 			|
		} // 							      __| 		    	    ____|Time complexity = O(nlog(n))
	}//
}

/*
 * (1) This repeats n times (2) and this inner loop n times * log(n) (3) and
 * this statement n times * log(n) Adding them together n + 2 n * log(n)
 * O(nlog(n))
 * 
 */

/*
 * Review
 * 
 * for (i = 0; i < n; i++) // O(n)
 * 
 * 
 * for (i = 0; i < n; i=i+2) // O(n)
 * 
 * 
 * for (i = n; i >= 1; i--) // O(n)
 * 
 * 
 * for (i = 1; i < n; i=i*2) // O(log_2(n))
 * 
 * 
 * for (i = 1; i < n; i=i*3) // O(log_3(n))
 * 
 * 
 * for (i = n; i >= 1; i=i/2) // O(log_2(n))
 * 
 */
