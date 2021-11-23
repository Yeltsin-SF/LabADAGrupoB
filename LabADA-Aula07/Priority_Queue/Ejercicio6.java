package Priority_Queue;

import java.util.*;

/*
 * Ejercicio 6
 * Autor		: Sánchez Feria Yeltsin
 * Descripcion	: Merge k sorted lists
 * Details		: You are given  an array of k  linked lists  lists,each  linked list  is sorted  in ascending  order .
				  Merge  all  the  linked	lists  into one  sorted  linked list  and return  it .
 * Date	  		: 15/11/2021
 */

public class Ejercicio6_Merge_k_Sorted_List {
	public static void main(String args[]) {

		int[][] matriz = { { 1, 4, 5 }, { 1, 3, 4 }, { 2, 6 } };
		System.out.println("Input : ");	
		print(matriz);	
		
		mergeKsortedList(matriz);

	}

	//Devuelve la lista final de prioridad en función a los datos de la matriz inicial 
	
	public static void mergeKsortedList(int[][] matriz) {
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		int x = matriz.length;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				pQueue.add(matriz[i][j]);
			}
		}
			
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		while(!pQueue.isEmpty()) {
			
			newList.add(pQueue.poll());
			
			if(!pQueue.isEmpty()) {
							
			}		
		}		
		System.out.println("\nOuput : " + newList);
	}
	
	//imprime la matriz de listas
	
	public static void print(int [][] matriz){
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(" " + matriz[i][j]);
			}
		}
		System.out.println();
	}
}
