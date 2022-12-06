package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_If {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int num1 = sc.nextInt();
		if(num1 < 0) {
			System.out.println("음수다");
		} else if(num1 == 0) {
			System.out.println("0이다");
		} else {
			System.out.println("양수다");
		}
		
		
		// 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“
		// 양수가 아닌 경우 중에서 0이면 “0이다“
		// 0이 아니면 “음수다”를 출력하세요.

		// ex.
		// 정수 : -9
		// 음수다
	}

}
