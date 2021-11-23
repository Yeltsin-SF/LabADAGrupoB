package Stacks;

import java.util.*;

/*
 * Ejercicio 2
 * Autor		: Sánchez Feria Yeltsin
 * Description	: Staks - Minimum Add to Make Parentheses Valid
 * Details		: Reverse Polish Notation (RPN) Writing "2 3 +" instead of "2 + 3".
 			  	  Given a String S of '(' and ')', compute the minimum number of '(' or ')'
 			  	  that needs to be added so that the resulting parentheses string is valid.
 			  	  Formally a parenthesis string is valid if and only if: 
 			  	  * It is the empty string, or 
 			  	  * It can be written as AB(concateneted with B), where A and B are valid strings, or
 			  	  * It can be written as (A), where A is a valid string.
 */

public class Ejercicio2_MinimunAdd_toMake_Parenthesis_Valid {
	public static void main(String[] args) {

		String prueba1 = "())";
		System.out.println("ouput : " + minAddToMakeValid(prueba1));
		System.out.println("----");
		String prueba2 =  "(((";
		System.out.println("ouput : " + minAddToMakeValid(prueba2));
		System.out.println("----");
		String prueba3 = "(()))("; 
		System.out.println("ouput : " + minAddToMakeValid(prueba3));
		System.out.println("----");
		String prueba4 = "()))(("; 
		System.out.println("ouput : " + minAddToMakeValid(prueba4));
		System.out.println("----");

	}
	
	// Devuelve el número de paréntesis que no cumplen con las caracetrísticas requeridas "()"
	
    public static int minAddToMakeValid(String s) {
    	System.out.println("Input : " + s);
    	
    	Stack<Character> st = new Stack();
    	
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            }
            else if (!st.isEmpty() && s.charAt(i) == ')' && st.peek().equals('(')){
            	st.pop();
            }
            else if (s.charAt(i) == ')') {
            	st.push(s.charAt(i));
            }
        }

        return st.size();
    }
}
