package Aula_05;

import java.util.Scanner;

/*
 * Ejercicio 7
 * Alumno: Sánchez Feria Yeltsin
 * Descripción: Revisión de la complejidad del tiempo
 * Pregunta: ¿Cuál es la complejidad temporal del método (porDos)?
 * Respuesta: La complejidad del tiempo es: O(log_2(n)) -> Tiempo logarítmico  
 */

public class Ejercicio7_TimeComplexity {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese n:");
		n = s.nextInt();

		System.out.println("-----------------------------");
		System.out.println("(2^k) < n");
		System.out.println("-----------------------------");
		porDos(n);
	}

	//multiplicacion de n por 2

	public static void porDos(int n) {	  							
		
		for (int i = 1; i < n; i = i*2) {//		|O(2^(n))	|= O(1) * 0(2^(n))
			//statement							|			|= O(2^(n))
			System.out.println(i);	 //	= O(1)	|			|= O(log_2(n))
		}   //									|			|Time complexity = O(log_2(n))					
	}
}	

/*	
 
  	i       
	------------------------
	1       
	1 * 2 = 2
	2 * 2 = 2^2
	2 * 2^2 = 2^3
	.    
	.    
	.    
	2^k
	
	Assume i >= n
	Therefore i = 2^k
    	2^k >= n
    	2^k = n
   		  k = log_2(n)
		
	complexity = O(log_2(n))
	
_______________________________	
	
	examples:
	
	n = 8       
	i       
	------------------------
	1
	2
	4
	8 ❌ 
	It is repeated 3 times


	n = 10
	i       
	------------------------
	1
	2
	4
	8 
	16 ❌ 
	It is repeated 4 times

	log_2(8) = 3
	log_2(10) = 3.322
	So we must apply the ceil to log_2(n)

*/


