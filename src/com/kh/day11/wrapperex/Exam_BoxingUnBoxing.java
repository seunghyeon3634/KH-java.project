package com.kh.day11.wrapperex;

public class Exam_BoxingUnBoxing {
	public static void main(String [] args) {
		Integer num = Integer.valueOf(0);
		// Boxing
		Integer su = 100;
		
		int soo = num.intValue();
		// UnBoxing(�ڵ� ��ڽ�)
		soo = num;
		
		int n = 10;
		Integer intObject = n;
		System.out.println("intObject : " + intObject);
		
		int m = intObject + 10;
		System.out.println("m = " + m);
	}
}
