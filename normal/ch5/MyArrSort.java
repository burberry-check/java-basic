package ch5;

import java.util.Arrays;

import ch5.MyIntArray;

public class MyArrSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] score = MyIntArray.randomScore();
		
		Arrays.sort(score);
		
		for(int i=0; i<score.length; i++) {
			System.out.print(score[i] + "\t\t");
		}
	}

}
