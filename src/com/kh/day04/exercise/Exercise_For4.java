package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_For4 {
	public static void main(String [] args) {
		// ������ �ϳ� �Է¹޾Ƽ� �� ���� 1 ~ 9 ������ ���� ����
		// �� ���� �������� ����ϼ���.
		// ��, ������ ���� ������ "1 ~ 9������ ����� �Է��Ͽ��� �մϴ�"�� ����ϼ���
	Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		
		if((num1 > 0) && (num1 < 10)) {
			for (int i = 1; i < 10; i++) {
				System.out.println(num1 + " * " + i + " = " + num1 * i);
			}
		}else {
			System.out.println("1 ~ 9 ������ ����� �Է��Ͽ��� �մϴ�");
		}
	
		
	}
	

}
