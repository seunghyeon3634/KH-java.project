package com.kh.day09.point;

public class ColorPointEx {
	public static void main(String [] args) {
	//	ColorPoint cp = new ColorPoint();
		// The constructor ColorPoint() is undefined
		//cp.set(3.4);       // Point�� set() ȣ��
		//cp.setColor("red"); // ColorPoint�� setColor
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		// blue cannot be resolved to a variable
		cp.showColorPoint(); // �÷��� ��ǥ ���
	}
}
