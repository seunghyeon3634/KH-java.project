package com.kh.day16.setcollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetRun {
	public static void main(String [] args) {
		// Collection�� List, Set, Map ������� ������ �Ѵ�
		// �ӽ� �Ǵ� ���������� ������ ��
		// �ڷᱸ���� Ư���� ���� List, Set, Map�� �����Ͽ� �� �� ����.
		Set<Student> set3 = new HashSet<Student>();
		Student kdw = new Student("������", 35, 100);
		set3.add(new Student("���켺", 55, 70));
		set3.add(new Student("������", 60, 80));
		set3.add(new Student("������", 35, 100));
		System.out.println("�������� ũ�� : " + set3.size());
		set3.add(kdw);
		System.out.println("�������� ũ�� : " + set3.size());
		set3.add(kdw);
		System.out.println("�������� ũ�� : " + set3.size());

		
		System.out.println(kdw.toString());
//		System.out.println(new Student("������", 35, 100).hashCode());
//		System.out.println(new Student("������", 35, 100).hashCode());
//		System.out.println(new Student("������", 35, 100).hashCode());
	}
	
	public void setExample1() {
		Set<String> set = new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		System.out.println("����� �������� �� : " + set.size());
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
	}
		set.add("one");	// �ߺ��� ������� ����.
		System.out.println("=== === === === === ===");
		Iterator<String> iterator2 = set.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
	}
  }
}
