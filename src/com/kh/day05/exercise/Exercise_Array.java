package com.kh.day05.exercise;

public class Exercise_Array {
	public void exercise1() {
		// 길이가 100인 배열을 선언하고 1부터 100까지의 값을
		// 순서대로 넣어 그 값을 출력하는 코드를 작성하시오.
		int [] nums = new int[100];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i;
			System.out.print(nums[i] + " ");
		}
	}	
	
	public void exercise2() {
		// 길이가 5인 String 배열을 선언하고 
		// "딸기", "복숭아", "키위", "사과", "바나나"로
		// 초기화 한 후, for문을 활용해서 바나나가 있으면 바나나를 출력해보세요!

	}

	public void exercise6() {
		int [] nums = {1, 2, 3, 4, 5}; // 할당과 초기화 동시에
		for(int num : nums) {
			System.out.print(nums + " ");
	}
}
	public void exercise7() {
		String [] fruits = {"딸기", "복숭아", "포도", "체리", "망고"};
		for(String fruit : fruits) {
			System.out.println(fruit + " ");
		}
	}
}
	
