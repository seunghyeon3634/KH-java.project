package com.kh.day03.condition;

import java.util.Scanner;

public class Exam_Switch {
	public static void main(String [] args) {
		// 1. 입력
		// 2. 수정
		// 3. 조회
		// 4. 삭제
		// 0. 종료
		// 메뉴 번호를 입력하세요 : 3
		// 조회메뉴입니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("0. 종료");
		System.out.println("메뉴 번호를 입력하세요 : ");
		int choice = sc.nextInt();
		switch (choice) {
			case 1 :
				System.out.println("입력메뉴입니다.");
			case 2 :	
				System.out.println("수정메뉴입니다.");
			case 3 :	
				System.out.println("조회메뉴입니다.");
			case 4 :	
				System.out.println("삭제메뉴입니다.");
			case 0 :	
				System.out.println("종료되었습니다.");
		}
		
		
		
		
		
		
		
		
		if(choice == 1) {
			System.out.println("입력메뉴입니다.");
		}else if(choice == 2) {
			System.out.println("수정메뉴입니다.");
		}else if(choice == 3) {
			System.out.println("조회메뉴입니다.");
		}else if(choice == 4) {
			System.out.println("삭제메뉴입니다.");
		}else if(choice == 0) {
			System.out.println("종료되었습니다.");
	}
		
		
	}
}