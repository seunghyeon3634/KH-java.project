package com.kh.day09.point;

public class ColorPointEx {
	public static void main(String [] args) {
	//	ColorPoint cp = new ColorPoint();
		// The constructor ColorPoint() is undefined
		//cp.set(3.4);       // Point의 set() 호출
		//cp.setColor("red"); // ColorPoint의 setColor
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		// blue cannot be resolved to a variable
		cp.showColorPoint(); // 컬러와 좌표 출력
	}
}
