package Binary_Search;

import java.util.*;

/*
 * Ejercicio 4
 * Autor		: Sánchez Feria Yeltsin
 * Descripcion	: Algoritmo de Búsqueda Binaria
 * Question		: Encuentre el menor elemento del array ordenado rotado (desplazado)
 			      compare un elemento del medio con el primer o el último elemento
 */

public class Ejercicio4_Smaller_Element {
	public static void main(String[] arg) {
		Scanner s = new Scanner(System.in);

		int[] nums = {2, 3, 6, 7, 9, 15, 19};
		int menor = busquedaBinaria(nums);
		System.out.println("El menor elemento del arreglo es : " + menor  );
		
	}
	//devuelve la posición del menor elemento del array
	private static int busquedaBinaria(int[] nums) {
		int alta, baja, media = -1 , menor = nums[0];
		baja = 0; //L
		alta = (nums.length - 1); //R
		while (baja < alta) {
			media = (baja + ((alta - baja) / 2));
			if (nums[media] < menor) {
				alta = media - 1;
			} else if (nums[media] > menor) {
				baja = media + 1;

			}
		}
		return nums[media];
	}
}
