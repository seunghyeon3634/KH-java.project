package com.kh.day02.operator;

public class Exam_Comparison {
	public static void main(String [] args) {
		System.out.println("�񱳿����� ����");
		// 1 < 2, 3 < 2, 1 == 2, 1 != 1
		// true, false, false, true
		// �񱳿����� : �� ���� ���ϴ� ������, ���迬����
		// �񱳿����ڴ� ������ �����ϸ� true, �ƴϸ� false�� ��ȯ��.
		int num1 = 50;
		int num2 = 30;
		boolean result = num1 < num2;
		System.out.println("(num1 < num2)�� ��� : " + result);
		result = (num1 > num2);
		System.out.println("(num1 > num2)�� ��� : " + result);
		result = (num1 == num2);
		System.out.println("(num1 == num2)�� ��� : " + result);
		result = (num1 != num2);
		System.out.println("(num1 != num2)�� ��� : " + result);
		
		// ¦Ȧ �Ǻ� ���α׷�
		// ¦���� �����ΰ�?
		int num = 2;
		result = (num % 2 == 0); // /(������)�� ����� ��, %(��ⷯ��)�� ����� ������
		System.out.println("¦���ΰ���? : " + result);
	}

}
