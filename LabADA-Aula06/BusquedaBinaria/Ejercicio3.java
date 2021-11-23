package Binary_Search;

import java.util.*;

/*
 * Ejercicio 3
 * Autor		: Sánchez Feria Yeltsin
 * Descripcion	: Algoritmo de Búsqueda Binaria
 * Question		: Encuentre el  primer  valor mayor o igual que  x
 */

public class Ejercicio3_First_Mayor {
	public static void main(String[] arg) {
		Scanner s = new Scanner(System.in);
		int numEvaluado, position;
		int[] nums = {5,10,15,20,25,30,35,40,45,50};

		numEvaluado = 42;
		position = busquedaBinaria(nums, numEvaluado);
		
		System.out.println("El primer número mayor o igual es : " + nums[position]);
	}
	//devuelve la posición del siguiente número mayor que se pone en la búsqueda o el mismo
	private static int busquedaBinaria(int[] nums, int numEvaluado) {
		System.out.println("El número evaluado es : " + numEvaluado);
		int alta, baja, media = 0;
		baja = 0; //L
		alta = (nums.length - 1); //R
		while (baja <= alta) {
			media = (baja + ((alta - baja) / 2));
			if (nums[media] == numEvaluado) {
				return media;
			} else if (nums[media] < numEvaluado) {
				baja = media + 1;

			} else {
				alta = media - 1;
			}
		}
		return media;
	}

}
