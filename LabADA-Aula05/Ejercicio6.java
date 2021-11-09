package Aula_05;

import java.util.Scanner;

/*
 * Ejercicio 6
 * Alumno: Sánchez Feria Yeltsin
 * Descripción: Revisión de la complejidad del tiempo
 * Pregunta: ¿Cuál es la complejidad temporal del método (triangularNumber)?
 * Respuesta: La complejidad del tiempo es: O(sqrt(n)) -> Tiempo de raíz cuadrática      
 */

public class Ejercicio6_TimeComplexity {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = s.nextInt();

		System.out.println("-----------------------------");
		System.out.println("Numeros triangulares ");
		System.out.println("-----------------------------");
		triangularNumber(n);
	}

	//muestra los numeros triangulares

	public static void triangularNumber(int n) {
		int p = 0; 				  							
		for (int i = 1; p <= n; i++) {				
			p = p + i;				 	
			System.out.println(p);	 	
		}   							
	}
}	

/*	
  i       p
 ------------------------
  1       0 + 1 = 1
  2       1 + 2
  3       1 + 2 + 3
  4       1 + 2 + 3 + 4
  .    
  .    
  .    
  k       1 + 2 + 3 + 4 + ... + k
 
 Assume k > n
 p = k * (k + 1) / 2
               p > n
 k * (k + 1) / 2 > n
 k^2 > n
 k > sqrt(n)
 O(n^(1/2))
 
 */
