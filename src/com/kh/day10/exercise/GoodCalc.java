package com.kh.day10.exercise;

// The type GoodCalc must implement
// the inherited abstract method Calculator.add(int, int)
public class GoodCalc extends Calculator{
	public static void main(String [] args) {
		GoodCalc calc = new GoodCalc();
		int [] a = {1,2,3,4,7};
		System.out.println("Че : " + calc.add(1, 2));
		System.out.println("Тї : " + calc.substract(5, 3));
		System.out.println("ЦђБе : " + calc.average(a));
	}

	@Override
	public int add(int a, int b) {
		int result = a + b;
		return result;
	}

	@Override
	public int substract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int [] a) {
		//{1, 2, 3} -> {1,2,3,4,5}
		int sum = a[0] + a[1] + a[2];
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		double avg = sum/(double)a.length;
		return avg;
		
	}
	
}
