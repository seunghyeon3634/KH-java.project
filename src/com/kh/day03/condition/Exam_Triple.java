package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_Triple {
	public static void main(String [] args) {
		/*
		 * �̰͵� �ּ�
		 * ���׿�����
		 * �׸��� 3��
		 * (���ǽ�) ? ���� �� : ������ ��
		 * - ���ǽ��� �ݵ�� true or false�� ��ȯ
		 * - ��/�������� �ַ� ���
		 */
		//(num1 > num2) ? "��" : "����";
		// ������ �Է¹޾� ¦������ Ȧ������ �Ǻ��ϴ�
		// ���α׷��� �ۼ��Ͻÿ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		
		// ¦�� �Ǻ�
		String result = (input % 2 ==0) ? "¦��" : "Ȧ��";
		// �Ǻ� �� ���
		System.out.println(input + "��/�� " + result + "�Դϴ�.");
		
		// ���� �ϳ� �Է� : 34
		
		
		// �̰͵� �ּ�
	}

}
