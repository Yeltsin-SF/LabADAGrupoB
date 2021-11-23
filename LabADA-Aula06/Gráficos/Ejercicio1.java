package Graphs;

/*
 * Ejercicio 1
 * Autor		: Sánchez Feria Yeltsin
 * Descripcion	: Graphs
 */

public class Ejercicio1a_Deapth_First_Search_Recursive {
	public static void main(String[] args) {
		GraphLink<Integer> g = new GraphLink<Integer>();

		g.insertVertex(1);
		g.insertVertex(2);
		g.insertVertex(3);
		g.insertVertex(12);
		g.insertVertex(19);
		g.insertVertex(5);
		g.insertVertex(20);
		
		System.out.println("----------------------------");
		g.insertEdge(1, 2);
		g.insertEdge(3, 2);
		g.insertEdge(12, 20);
		g.insertEdge(2, 2);
		g.insertEdge(12, 19);
		System.out.println(g);
		
		System.out.println("----------------------------");

		System.out.println("probando DFS Recursivo: ");

		g.DFS(19);
	}
}
