package com.patterns;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 7;
        for (int i = 0; i < rows; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }

	}

}
