package Queues;

import java.util.*;

/*
 * Ejercicio 3
 * Autor		: Sánchez Feria Yeltsin
 * Descripcion	: Caps Lock
 * Details		: You are sending  a  message  to a friend  with a  special  keyboard.  
 * 				  The keyboard only  accepts lowercase  letters,  and stores  them  in a  buffer.
				  When the  @ key is  pressed,  it  toggles the  CapsLock key:  all  letters 
				  in the  buffer have their  case flipped,  as  well  as  all  subsequent  keypresses.
 				  When the  $  key is  pressed,  the  entire  buffer is  flushed.
 */

public class Ejercicio3_Caps_Lock {
	public static void main(String[] args) {
		String txt = "abc$d@ef$@g$";
		System.out.println("input : " + txt);
		System.out.println(capsLock("ouput : " + txt));
	}

	public static String capsLock(String txt) {
		Queue<Character> queue = enQueue(txt);
		
		String message = "";
		String buffer = "";
		
		boolean toUpperCase = false;
		
		while(!queue.isEmpty()) {
			Character letter = queue.poll();
			if(letter == '$') {
				if(toUpperCase) {
					buffer = buffer.toUpperCase();
				} 
				message += buffer;
				buffer = "";
				
			} else if(letter == '@') { 
				toUpperCase = !toUpperCase;
			} else {
				buffer += letter;
			}
		}
		return message;
	}

	public static Queue<Character> enQueue(String txt) {
		Queue<Character> queue = new LinkedList<Character>();
		for(Character c : txt.toCharArray()) {
			queue.add(c);
		}
		return queue;
	}
}
