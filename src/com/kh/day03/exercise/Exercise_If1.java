package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_If1 {
	public static void main(String [] args) {
		// indent ���� : ctrl + shift +f (�鿩����)
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		int input = sc.nextInt();
		String result = "";
		if(input == 0 ) {
			result = "0";
		} else if(input * 2 > -1 ) {
			result = "���� ����";
		} else {
			result = "���� ����";
		}
		System.out.println(input + "��/�� " + result + "�Դϴ�.");
	}
	// �����ϳ��� �Է¹޾Ƽ� ���� ��������, 0����, ���� ��������
	// �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.

}
