package com.kh.day04.exercise;

public class Exercise_For2 {
	public static void main(String [] args) {
		// 1���� 10������ ������ ǥ���ϰ� �յ� ���Ͻÿ�
		// 1+2+3+4+5+6+7+8+9+10=55
		int sum = 0;
		for ( int i = 1; i <= 10; i++) {
			sum = i + sum;
			if (i == 10) {
				System.out.print(i + " = ");
			} else {
				System.out.print(i + " + ");	
			} 
		}
		System.out.println(sum);
	}

}