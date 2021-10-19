package Aula_02;

import java.util.*;
/*
 * Alumno: Sánchez Feria Yeltsin
 * Ejercicio 2
 * Detalles del Ejercicio: Busqueda Secuencial
 */

public class Ejercicio2_BusquedaSecuencial {
	public static void main(String[] arg) {
		int n = 0;
		Scanner s = new Scanner(System.in);
		int searched;
		int nums[] = new int[100];

		for (int i = 0; i <= nums.length - 1; i++) {
			nums[i] = n;
			n = n + 3;
			System.out.println(nums[i]);
		}

		System.out.println("El número buscado es? :");
		searched = s.nextInt();
		System.out.println(BusquedaSecuencial(nums, searched));
	}

	private static boolean BusquedaSecuencial(int[] nums, int t) {
		for (int i = 0; i <= nums.length - 1; i++) {
			if (nums[i] == t) {

				return true;
			}
		}
		return false;
	}
}
