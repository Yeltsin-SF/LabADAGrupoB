package Aula_05;

import java.util.Scanner;

/*
 * Ejercicio 14
 * Alumno: Sánchez Feria Yeltsin
 * Descripción: Revisión de la complejidad del tiempo --> Pick Resume
 * Pregunta: ¿Cuál es la complejidad temporal del método (pick_resume)?
 * Respuesta: La complejidad del tiempo es: O(Log2(n))
 */

public class Ejercicio14_Pick_Resume {
	public static void main(String[] args) {
		String resumes;

		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese la cadena completa :");
		resumes = s.nextLine();

		System.out.println("------------------------------------------------------------");
		pick_resume(resumes);
		System.out.println("------------------------------------------------------------");
		

	}
	//resume la palabra ingresada
	public static String pick_resume(String resumes) {
		
		String eliminate = "top";		
		while(resumes.length() > 1) {
			System.out.println(resumes);
			if (eliminate.equals("top")) {				
				resumes = resumes.substring(resumes.length() / 2, resumes.length());//-1
				eliminate = "bottom";
			}			
			else if (eliminate.equals("bottom")) {		
				resumes = resumes.substring(0, resumes.length() / 2);
				eliminate = "top";				
			}			
		}		
		return resumes.substring(0);		
	}
}


/*
	Complejidad:
	
	resumes.length
	----------------
  	n / 2¹	   	
	----------------
  	n / 2²	      
	----------------
  	n / 2³
  	----------------
  	n / 2⁴	   
	----------------
	.
	.
	.
	----------------
  	n / 2^(k)
	

	Assume that i < 1
	Therefore n / 2^k < 1
    		  n / 2^k = 1
     		  n = 2^k
   		  	  k = log_2(n)
		
	complejidad = O(log_2(n))
	
 */