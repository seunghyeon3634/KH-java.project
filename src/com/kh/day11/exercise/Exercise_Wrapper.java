package com.kh.day11.exercise;

public class Exercise_Wrapper {
	public void parserExample() {
		String strNum = "221123";
		String strNum2 = "230502";
		// �� ���� ����ؼ� ����Ͻÿ�
		// ��� : 1819
		int result = Integer.parseInt(strNum2) - Integer.parseInt(strNum);
		System.out.println("��� : " + result);
	}
	
	public void dataParsingExample() {
		String strData = "221213";
		String strData2 = "23.502";
		String strData3 = "SPRING";
		// strData�� byte, short, int, long���� ��ȯ�Ͻÿ�
		byte bNum = Byte.parseByte(strData);
		short sNum = Short.parseShort(strData);
		int iNum = Integer.parseInt(strData);
		long lNum = Long.parseLong(strData);
		// strData2�� float, double�� ��ȯ�Ͻÿ�.
		float fNum = Float.parseFloat(strData2);
		double dNum = Double.parseDouble(strData2);
		// strData3f�� char�� ��ȯ�Ͻÿ�.
		char word = strData3.charAt(0);
	}
}
