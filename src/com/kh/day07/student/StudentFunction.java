package com.kh.day07.student;

import java.util.Scanner;

public class StudentFunction {
	// int kor;
	// int eng;
	// int math;
	Student student;
	
	public StudentFunction() {
		student = new Student();
	}
	/**
	 * �л����� ���α׷� �޴� ���
	 * @return choice
	 */
	// �ȳ�Ÿ��
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== �л� ���� ���� ���α׷� ======");
		System.out.println("1. �л� ���� �Է�");
		System.out.println("2. �л� ���� ���");
		System.out.println("3. ���α׷� ����");
		System.out.print("���� : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	/**
	 * �л� ���� �Է�
	 */
	public void intputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== �л� ���� �Է� ======");
		System.out.println("�л� �̸� �Է� : ");
		String name = sc.next();
		System.out.println("�������� �Է� : ");
		int kor = sc.nextInt();
		System.out.println("�������� �Է� : ");
		int eng = sc.nextInt();
		System.out.println("�������� �Է� : ");
		int math = sc.nextInt();
		//student = new Student(name, kor, eng, math);
		student.setName(name);
		student.setKor(kor);
		student.setEng(eng);
		student.setMath(math);
	}
	/**
	 * �л� ���� ���
	 */
	public void printScore() {
		System.out.println("====== �л� ���� �Է� ======");
		System.out.println(student.getName() + "�л��� ����");
		System.out.println("���� ���� : " + student.getKor());
		System.out.println("���� ���� : " + student.getEng());
		System.out.println("���� ���� : " + student.getMath());
		System.out.println("============================");
	}
	
	public void goodByeMsg() {}
	
	public void exceptionMsg() {}
	
}
