package Aula_01;

import java.util.*;

/*
 * Alumno: Sánchez Feria Yeltsin
 * Ejercicio 1
 * Detalles del Ejercicio: Leer n números en un array y retornar la suma de los mismos
 */

public class Ejercicio1_suma_numeros {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		System.out.println("Suma de Números\n");

		System.out.println("Cuántos números desea sumar? : ");
		int n = s.nextInt();
		int i = 0;
		int num;

		System.out.println("Ingresar los números\n");
		while (i < n) {
			num = s.nextInt();
			numeros.add(num);
			i++;
		}

		System.out.println("La suma de los números ingresados es: " + sumarArray(numeros));
	}

	public static int sumarArray(ArrayList<Integer> array) {

		int suma = 0;

		for (int i = 0; i <= array.size() - 1; i++) {
			suma += array.get(i);
		}
		return suma;
	}
}
