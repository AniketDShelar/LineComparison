package com.bridgelabz.assignmentsday5;
import java.util.*;

public class Vowelconsonent {
	char ch;
	Vowelconsonent(char ch){
		this.ch = ch;
	}
	void checkVowelConsonent(){
	if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
	   ch == 'A'|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'	) {
		System.out.println("It's a Vowel");
	}else {
		System.out.println("It's a Consonent");
	    }
	}
	public static void main(String[] args) {
	System.out.print("Enter alphabet to check = ");
	Scanner character = new Scanner(System.in);
	char ch = character.next().charAt(0);
	Vowelconsonent alphabet = new Vowelconsonent(ch);
	alphabet.checkVowelConsonent();
	}
}

