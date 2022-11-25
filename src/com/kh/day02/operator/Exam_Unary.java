package com.kh.day02.operator;

public class Exam_Unary {
	public static void main(String [] args) {
		// 1 + 2 , 2 X 3 , 4 / 2
		// 단향연산자, 이항연산자
		// a++, a--, b++, b--
		// ++a, --a, ++b, --b
		// a = a + 1, a = a - 1, b = b + 1, b = b -1
		int a = 1;
		//a++;
		System.out.println(a++); // 후위연산(나중연산)
		System.out.println(a);
		System.out.println(++a); // 전위연산(먼저연산)
		
		// b = (--a) + b:
		// c = (a++) + (--b);
		
//		1번 문제                 2번문제
//		a++;                     x--;
//		b = (--a) + b;			 z = x-- + --y;
//		c = (a++) + (--b);       x = 99 + x++ + x;
//		a의 값 : 11				 x의 값 : 296
//		b의 값 : 29				 y의 값 : 95
//		c의 값 : 39              y의 값 : 95
//                               z의 값 : 131		
		
		System.out.println("1번 문제");
		System.out.println("a++;");
		System.out.println("b = (--a) + b;");
		System.out.println("c = (a++) + (--b);");
		// Dulicate local variable a
		int A = 10;
		int b = 20;
		int c = 30;
		
		
		
		
		System.out.println("2번 문제");
		System.out.println("x--;");
		System.out.println("z = x-- + --y;");
		System.out.println("x = 99 + x+= + x;");
		System.out.println("y = y-- + y + ++y;");
		int x = 100;
		int y = 33;
		int z = 0;
		x--;
		z = x-- + --y;
		x = 99 + x++ + x;
		y = y-- + y + ++y;
		System.out.println("x의 값 : " + x);
		System.out.println("y의 값 : " + y);
		System.out.println("z의 값 : " + z);
		
		System.out.println("부정연산자");
		boolean result = true;
		System.out.println("result의 값 : " + result);
		System.out.println("!result의 값 : " + !result);
		
	}

}
