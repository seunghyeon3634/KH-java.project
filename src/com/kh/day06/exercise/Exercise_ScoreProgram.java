package com.kh.day06.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram { 
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		while(true) {
			System.out.println("===== ���� �޴� =====");
			System.out.println("1. �����Է�");
			System.out.println("2. �������");
			System.out.println("3. ����");
			System.out.print("���� : ");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("���� �Է�");
				System.out.println("���� : ");
				kor = sc.nextInt();
				System.out.println("���� : ");
				eng = sc.nextInt();
				System.out.println("���� : ");
				math = sc.nextInt();		
			}
			else if(choice == 2) {
				System.out.println("���� ���");
				System.out.println("���� : " + kor);
				System.out.println("���� : " + eng);
				System.out.println("���� : " + math);
				System.out.println("���� : " + (kor + eng + math));	
				System.out.println("��� : " + (kor + eng + math)/3);
			}
			else if(choice == 3) {
				System.out.println("Good Bye~");
				break;
			}
			else {
				System.out.println("1~3������ ���ڸ� �Է��ϼ���!!");
			}
		}

		/*
		 * ====== ���� �޴� =======
		 * 1. �����Է�
		 * 2. �������
		 * 3. ����
		 * ���� : 1
		 * 
		 * ====== ���� �Է� =======
		 * ���� : 50
		 * ���� : 40
		 * ���� : 30
		 * 
		 * 
		 * ====== ���� �޴� =======
		 * 1. �����Է�
		 * 2. �������
		 * 3. ����
		 * ���� : 2
		 * 
		 * ====== ���� ��� ======
		 * ���� : 50
		 * ���� : 40
		 * ���� : 30
		 * 
		 * ���� : 120
		 * ��� : 40.00
		 * 
		 * ====== ���� �޴� =======
		 * 1. �����Է�
		 * 2. �������
		 * 3. ����
		 * ���� : 3 
		 * 
		 * Good Bye~
		 * 
		 */

	}
}
