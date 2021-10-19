package Aula_02;

import java.util.*;;

/*
 * Alumno: Sánchez Feria Yeltsin 
 * Ejercicio 1
 * Detalles del Ejercicio: Counting Divisors
 */
public class Ejercicio1_CountDivisors {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, x, count = 0;
		System.out.print("Ingrese la cantidad de números a evaluar :");
		n = s.nextInt();
		System.out.print("Ingrese el número dividor :");
		x = s.nextInt();
		System.out.println("Ingrese los números");
		System.out.println("-----");
		for (int i = 0; i <= n - 1; i++) {
			int numero = s.nextInt();
			if (numero % x == 0)
				count++;
		}
		System.out.print(x + "es divisor de " + count + " numeros");
	}
}
