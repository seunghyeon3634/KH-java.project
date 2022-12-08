package com.kh.day07.score;

import java.util.Scanner;

public class ScoreFunction {
	private int kor;
	private int eng;
	private int math;
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}	
		
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 성적 입력 =====");
		System.out.println("국어 : ");
		kor = sc.nextInt();
		System.out.println("영어 : ");
		eng = sc.nextInt();
		System.out.println("수학 : ");
		math = sc.nextInt();
	}	
		
	public void printScore() {
		System.out.println("===== 성적 출력 =====");
		System.out.println("국어 : " + kor);
		System.out.println("국어 : " + eng);
		System.out.println("국어 : " + math);
	}
	
	public void goodByeMsg() {
		System.out.println("Good Bye~~");
	}

	public void exceptionMsg() {
		System.out.println("1 ~ 3사이의 숫자를 입력해주세요.");
	}
	
}
