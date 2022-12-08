package com.kh.day04.loop;

public class Exam_ForDouble {

	public static void main(String[] args) {
		for(int j = 2 ; j < 10; j++) {
			for(int i = 1; i < 10; i++) {
				System.out.print(j + " * " + i + " = " + j*i);
				System.out.print('\t');
			}   System.out.println();
		}	
	}
}
