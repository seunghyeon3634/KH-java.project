package com.kh.day07.oop;

public class Rectangle {	// Ŭ���� ����, ���������� public
	// �ʵ�
	public int width;		// �ʺ�, ���� , ���������� public
	public int height;		// ����, ���� , ���������� public
	
	// �޼ҵ�
	// ������ -> ��ü ����, ��ü �ʱ�ȭ(�ʵ� �ʱ�ȭ)
	public Rectangle() {} 	// ������, ���������� public�̰� ��ȯ�� ����!
	
	// �Ű����� �ִ� ������(���ް��� ���� �� �ִ� ������)
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// ��ȯ���� �ִ� �޼ҵ�
	// getArea�� ȣ���� ������ ���� ������(�����Ѵ�)
	public int getArea() {
		int area = width*height;
		return area;
	}
}
