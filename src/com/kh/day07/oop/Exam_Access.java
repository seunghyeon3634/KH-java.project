package com.kh.day07.oop;

class Sample {
	public int a;
	private int b;
	int c;
}

public class Exam_Access {
	public static void main(String [] args) {
		Sample aClass = new Sample();
		aClass.a = 10; // ���ٰ����ϴ�. public�̴ϱ�
		//aClass.b = 10; // is not visible, �Ұ����ϴ� private�̴ϱ�
		aClass.c = 10; // ���ٰ����ϴ�. default�ϱ�
	}
}
