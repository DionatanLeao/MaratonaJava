package com.devdojo.arrays;

/***
 * 
 * @author dionatan
 *
 */

public class Multidimensionais {
	public static void main(String[] args) {
		int[][] dias = new int[2][2];
		dias[0][0] = 30;
		dias[0][1] = 31;
		dias[1][0] = 29;
		dias[1][1] = 28;

		for (int i = 0; i < dias.length; i++) {
			System.out.println(dias[i]);
			for (int j = 0; j < dias[i].length; j++) {
				System.out.println(dias[i][j]);
			}
		}

		System.out.println("----------------------");

		for (int[] ref : dias) {
			for (int dia : ref) {
				System.out.println(dia);
			}
		}

//		int[][] dias2 = new int[3][];
//		dias[0] = new int[2];
//		dias[1] = new int[] { 1, 2, 3 };
//		dias[2] = new int[4];

		System.out.println("----------------------");
		
		int[][] dias2 = {{0,0},{1,2,3},{0,0,0,0}};

		for (int[] arr : dias2) {
			for (int num : arr) {
				System.out.println(num);
			}
		}

	}
}
