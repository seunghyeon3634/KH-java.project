package com.kh.day07.oop;

public class Circle { // Ŭ���� ����(class Circle), Ŭ���� ���� ���� public
	// �ʵ�
	public int radius; // ���� ������ public
	public String name; // ���� ������ public
	
	
	// �޼ҵ�
	// Ŭ������� �̸��� ���� �޼ҵ�
	// -> ������
	// 2. ��ü ����
	// 3. �ʵ� �ʱ�ȭ (�ʱ�ȭ�� �����ڿ���
	public Circle() {	// ���� ������ public
		this.radius = 1;
		this.name = "��";
	}
	// ��ȯ���� �ִ� �޼ҵ�(��ȯ���� ����, return)
	public double getArea() { // ���� ������ public
		double area = 3.14*radius*radius;
		return area;
		//return 3.14*radius*radius; // ���� ���̴� ������ ����� �Ƚ������ ����
	}
}
