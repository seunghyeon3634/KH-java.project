package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_While {
	public void exercise1() {
	// while���� �̿��Ͽ� 1 ~ 100 ������ Ȧ���� ���� ����Ͻÿ�.
	int i = 1;
	int sum = 0;
	while(i < 100) {
		sum = sum + i;
		//i++;
		//i = i + 2;
		i += 2; // ���մ��Կ����ڷ� ǥ��
		//i = i + 4; -> i += 4;
		//i = i * 2; -> i *= 2;
	}
	System.out.println("�հ� : " + sum);
}	
	
	public void exercise2() {
	// ������ �ϳ� �Է¹޾Ƽ� �� ���� 1 ~ 9 ������ ���� ����
	// �� ���� �������� ����ϼ���.
	// ��, ������ ���� ������ "1 ~ 9������ ����� �Է��Ͽ��� �մϴ�"�� ����ϼ���.
	Scanner sc = new Scanner(System.in);
	System.out.print("���� �ϳ� �Է����ּ��� : ");
	int num = sc.nextInt();
	if((num >= 1) && (num <= 9)) {
		int i = 1;
		while(i <= 9) {
			System.out.println(num + " * " + i + " = " + num*i);
			i++;	// !!!�߿�!!!
		}
	}else {
		System.out.println("1 ~ 9������ ����� �Է��Ͽ��� �մϴ�.");
}
}
	public void exercise3() {
	// while���� �̿��Ͽ� -1�� �Էµ� ������ ������ �Է¹ް� -1�� �ԷµǸ� �Է��� ���� ���� ����Ͻÿ�.
	// ���� �ϳ� �Է� : 3
	// ���� �ϳ� �Է� : 4
	// ���� �ϳ� �Է� : 7
	// ���� �ϳ� �Է� : -1
	// �Է��Ͻ� ���� ���� : 14
	Scanner sc = new Scanner(System.in);
	//System.out.print("���� �ϳ� �Է� :  "); 
	//int input = sc.nextInt();
	int input = 0;
	int sum = 0;
	while (input != -1) { // num�� -1�� �ƴϸ� true -> -1�� �ԷµǱ� ������ ����!
		System.out.println("���� �ϳ� �Է� : ");
		input = sc.nextInt();
		sum = sum + input; // i = i + 2 -> i += 2,
	
	}
	System.out.println("�Է��Ͻ� ���� ���� : " + sum);
	
}
}
