package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_If {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		int num1 = sc.nextInt();
		if(num1 < 0) {
			System.out.println("������");
		} else if(num1 == 0) {
			System.out.println("0�̴�");
		} else {
			System.out.println("�����");
		}
		
		
		// Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�
		// ����� �ƴ� ��� �߿��� 0�̸� ��0�̴١�
		// 0�� �ƴϸ� �������١��� ����ϼ���.

		// ex.
		// ���� : -9
		// ������
	}

}
