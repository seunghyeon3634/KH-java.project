package com.kh.day10.wrapper;

public class Exam_Wrapper {
	public static void main(String [] args) {
		// Wrapper ��ü�κ��� �⺻ Ÿ�� �� �˾Ƴ���
		// The constructor Integer(int) is deprecated since version 9
		Integer i = Integer.valueOf(1123);
		// ��ü�� ���� ����ϴٰ�
		int e = i.intValue();
		// �⺻������ ��ȯ����
		Integer f = null;
		// Type mismatch: cannot convert from null to int
		//int m = null;
		
		Character c = Character.valueOf('c');
		char che = c.charValue();
		
		Double d = Double.valueOf(3.14);
		double dd = d.doubleValue();
		
		// ���ڿ��� �⺻ ������ Ÿ��(int, boolean, double)
		// ���� ��ȯ
		//Type mismatch: cannot convert from String to int
		int num = Integer.parseInt("123");
		int result = num + 1;
		System.out.println("��ȯ�� �� : " + num);
		boolean isYn = Boolean.parseBoolean("true");
		double fNum = Double.parseDouble("3.14");
		
		// �⺻ ������ Ÿ��(int, double, char)��
		// ���ڿ��� ��ȯ
		String data1 = Integer.toString(123);
		String data2 = Integer.toHexString(123);
		String data3 = Double.toString(3.14);
		String data4 = Character.toString('a');
		String data5 = Boolean.toString(true);
	}
}
