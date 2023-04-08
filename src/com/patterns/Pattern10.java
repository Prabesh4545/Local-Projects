package com.patterns;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
            char letter = 'a';
            for (int j = 0; j < 6; j++) {
                System.out.print(letter);
                letter++;
                if (letter > 'f') {
                    letter = 'a';
                }
            }
            System.out.println();
		}

	}

}
