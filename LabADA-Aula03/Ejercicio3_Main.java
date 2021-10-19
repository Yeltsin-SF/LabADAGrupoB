package Aula_03;

/*
 * Alumno: Sánchez Feria Yeltsin
 * Ejercicio 3
 * Detalles del Ejercicio: Gale Shapley Algorithm - Aceptación diferida
 */

public class Ejercicio3_Main {
	public static void main(String[] args) {
		
		System.out.println("Gale Shapley Algorithm\n");
		//lista de hombres
		String[] hombres = {"Andy", "Beto", "Carlo", "Denis"};
		//lista de mujeres
		String[] mujeres = {"Wendy", "Xena", "Yvonne", "Zoe"};

		//preferencia de los hombres
		String[][] phombres = {{"Xena", "Wendy", "Yvonne", "Zoe"}, 
				{"Yvonne", "Zoe", "Xena", "Wendy"}, 
				{"Yvonne", "Xena", "Zoe", "Wendy"}, 
				{"Wendy", "Zoe", "Yvonne", "Xena"}};
		//preferencia de las mujeres                     
		String[][] pmujeres = {{"Carlo", "Denis", "Beto", "Andy"}, 
				{"Carlo", "Beto", "Andy", "Denis"}, 
				{"Andy", "Beto", "Carlo", "Denis"},
				{"Denis", "Carlo", "Beto", "Andy"}}; 

		E003_AceptacionDiferida p2 = new E003_AceptacionDiferida(hombres, mujeres, phombres, pmujeres);                        
	}
}
