package com.kh.day04.exercise;

public class Exercise_ForDouble1 {
	public static void main(String[] args) {
		// 2�� ���� 3��, 3�� ���� 4��, 4�� ���� 5���� �ǵ��� �ۼ��Ͻÿ�.
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
			System.out.print(j + " * " + i + " = " + j*i + "\t");
		}
		System.out.println();
	}
}
}