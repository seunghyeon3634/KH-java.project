package com.kh.day04.exercise;

public class Exercise_PrintSample {
	public static void main(String [] args) {
		// System.out.println���� ���� + ���ڿ� -> ���ڿ�
		System.out.println(1 + "1");
		
		// ���� + ���� -> ����
		System.out.println('1' + '1'); // '11'
		
		// ���� + ���� + ���ڿ� + ���� -> ���������δ� ���ڿ�
		System.out.println(10 + 20 + "Hello" +10);
		
		// print�� ���Ͽ� �˾ƺ���
		// print, print -> �ٹٲ��� ����
		System.out.print("���� �Է� : "); // �ٷ� ���� �Է¹���.
		System.out.println("���� �Է� : "); // �ٹٲٰ� �Է¹���
		System.out.printf("���� �Է� : %d \n",1); 
		System.out.printf("���ڿ� ��� : %s ", "Hello World");
	}

}
