package com.kh.day07.score;

import java.util.Scanner;

public class ScoreFunction {
	private int kor;
	private int eng;
	private int math;
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== ���� �޴� =====");
		System.out.println("1. ���� �Է�");
		System.out.println("2. ���� ���");
		System.out.println("3. ����");
		System.out.print("���� : ");
		int choice = sc.nextInt();
		return choice;
	}	
		
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== ���� �Է� =====");
		System.out.println("���� : ");
		kor = sc.nextInt();
		System.out.println("���� : ");
		eng = sc.nextInt();
		System.out.println("���� : ");
		math = sc.nextInt();
	}	
		
	public void printScore() {
		System.out.println("===== ���� ��� =====");
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
	}
	
	public void goodByeMsg() {
		System.out.println("Good Bye~~");
	}

	public void exceptionMsg() {
		System.out.println("1 ~ 3������ ���ڸ� �Է����ּ���.");
	}
	
}
