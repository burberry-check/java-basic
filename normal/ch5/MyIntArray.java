package ch5;

import java.util.Arrays;

public class MyIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = MyIntArray.randomScore();
		int avg = 0;
		int total = 0;
		for(int i=0; i<score.length; i++) {
			total += score[i];
		}
		avg = (int)Math.round(total / score.length);
		
		int min = score[0];
		int max = min;
		for(int i=1; i<score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.printf("MAX = %d, MIN = %d, AVG = %d%n%n", max, min, avg);
		
		// 배열 복사
		int[] arrOneTwoThree = {1,2,3};
		int[] arrFourFiveSix = {4,5,6};
		int[] arrSevenEightNine = {7,8,9};
		int[] arrTen = {10};
		int[] arrOneToTen = new int[10];
		// 1, 2, 3, 0, 0, 0, 0, 0, 0, 0
		System.arraycopy(arrOneTwoThree, 0, arrOneToTen, 0, arrOneTwoThree.length);
		MyIntArray.printArray(arrOneToTen);
		System.out.println();
		
		// 1, 2, 3, 4, 5, 6, 0, 0, 0, 0
		System.arraycopy(arrFourFiveSix, 0, arrOneToTen, 3, arrFourFiveSix.length);
		MyIntArray.printArray(arrOneToTen);
		System.out.println();
		
		// 1, 2, 3, 4, 5, 6, 0, 0, 0, 10
		System.arraycopy(arrTen, 0, arrOneToTen, 9, arrTen.length);
		MyIntArray.printArray(arrOneToTen);
		System.out.println();
		
		// 1,2,3,4,5,6,7,8,9,10
		System.arraycopy(arrSevenEightNine, 0, arrOneToTen, 6, arrSevenEightNine.length);
		MyIntArray.printArray(arrOneToTen);
	}
	
	public static void printArray(int[] arr) {
		for (int i  : arr) {
			System.out.printf("%d, ", i);
		}
	}
	
	public static int[] randomScore() {
		int[] score = new int[10];
		
		for(int i=0; i<score.length; i++) {
			score[i] = (int)(Math.random() * 100);
			System.out.print(score[i] + "\t\t");
		}
		System.out.println();
		return score;
	}

}
