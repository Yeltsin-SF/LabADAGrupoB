package Deque;

import java.util.*;

/*
 * Ejercicio 4
 * Autor		: Sánchez Feria Yeltsin
 * Descripcion	: Deque - Backspace
 * Details		: You are sending  a  message  to a friend  with a  special  keyboard. 
 			  	  The keyboard  only  accepts  lowercase  letters.
 			  	  When the  # button is  pressed,  the  last  letter  is deleted  from the  message
 			  	  Given  some  keypresses:  output the  resulting  message.
 */

public class Ejercicio4_Backspace {

	public static void main(String[] args) {
		String txt = "abc#de##f#ghi#jklmn#op#";
		
		backSpace(txt);
	}
	
	//Imprime el mensaje final, quitando los caracteres correspondientes, dependiendo
	//de la cantidad de # y el lugar donde se coloquen
	
	public static void backSpace(String txt) {
		System.out.println("input : " + txt);
		
		Deque<Character> q = new LinkedList<Character>();
		
		for (int i = 0; i < txt.length(); ++i) {
			if (txt.charAt(i) != '#')
				q.addFirst(txt.charAt(i));
			else if (!q.isEmpty())
				q.removeFirst();
		}
		
		String message = "";

		while (!q.isEmpty()) {
			message += q.removeFirst();
		}

		//mensaje final
		String answer = "";
		for (int j = message.length() - 1; j >= 0; j--) {
			answer += message.charAt(j);
		}
		System.out.println("Ouput : " + answer);
	}
}
