package com.kh.day05.exercise;

public class Exercise_Array {
	public void exercise1() {
		// ���̰� 100�� �迭�� �����ϰ� 1���� 100������ ����
		// ������� �־� �� ���� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.
		int [] nums = new int[100];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i;
			System.out.print(nums[i] + " ");
		}
	}	
	
	public void exercise2() {
		// ���̰� 5�� String �迭�� �����ϰ� 
		// "����", "������", "Ű��", "���", "�ٳ���"��
		// �ʱ�ȭ �� ��, for���� Ȱ���ؼ� �ٳ����� ������ �ٳ����� ����غ�����!

	}

	public void exercise6() {
		int [] nums = {1, 2, 3, 4, 5}; // �Ҵ�� �ʱ�ȭ ���ÿ�
		for(int num : nums) {
			System.out.print(nums + " ");
	}
}
	public void exercise7() {
		String [] fruits = {"����", "������", "����", "ü��", "����"};
		for(String fruit : fruits) {
			System.out.println(fruit + " ");
		}
	}
}
	
