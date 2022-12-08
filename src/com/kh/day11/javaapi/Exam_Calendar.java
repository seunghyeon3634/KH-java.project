package com.kh.day11.javaapi;

import java.util.Calendar;

public class Exam_Calendar {
	public static void main(String[] args) {
		Exam_Calendar exCal = new Exam_Calendar();
		Calendar today = Calendar.getInstance();
		exCal.printCalendar("����", today);
		// ���� 2022/12/7/������(11��) ���� 11�� 42�� 33�� 234�и���
		System.out.println();
		Calendar someDate = Calendar.getInstance();
		someDate.clear();
		someDate.set(2022, 10, 23);
		someDate.set(Calendar.HOUR_OF_DAY, 9);
		someDate.set(Calendar.MINUTE, 0);
		exCal.printCalendar("������", someDate);
		System.out.println();
		// ������ ����غ�����!
		Calendar endDate = Calendar.getInstance();
		endDate.clear();
		endDate.set(2023, 4, 2);
		endDate.set(Calendar.HOUR_OF_DAY, 17);
		endDate.set(Calendar.MINUTE, 50);
		exCal.printCalendar("������", endDate);
 	}	
	
	public void printCalendar(String msg, Calendar cal) {	
		//Calendar today = Calendar.getInstance();
		int year 		= cal.get(Calendar.YEAR);
		int month 		= cal.get(Calendar.MONTH)+1;
		int day 		= cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek 	= cal.get(Calendar.DAY_OF_WEEK);	//���� ǥ��
		int hourOfDay 	= cal.get(Calendar.HOUR_OF_DAY);	//24�ð� ǥ��	
		int ampm 		= cal.get(Calendar.AM_PM);
		int hour 		= cal.get(Calendar.HOUR);
		int minute 		= cal.get(Calendar.MINUTE);
		int second 		= cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND); // �и�������
		// ���� 2022/12/7/������(11��) ���� 11�� 42�� 33�� 234�и���
		System.out.println(msg + " " + year + "/" + month + "/" + day + "/");
		switch(dayOfWeek) {
			case Calendar.SUNDAY : 		System.out.println("�Ͽ���"); break;
			case Calendar.MONDAY : 		System.out.println("������"); break;
			case Calendar.TUESDAY : 	System.out.println("ȭ����"); break;
			case Calendar.WEDNESDAY : 	System.out.println("������"); break;
			case Calendar.THURSDAY : 	System.out.println("�����"); break;
			case Calendar.FRIDAY : 		System.out.println("�ݿ���"); break;
			case Calendar.SATURDAY : 	System.out.println("�����"); break;
		}
		System.out.println("(" + hourOfDay + "��)");
		if(ampm == Calendar.AM) System.out.println(" ���� ");
		else System.out.println(" ���� ");
		System.out.println(hour + "�� " + minute + "�� " + second + "�� " + millisecond + "�и���");
	}
}
