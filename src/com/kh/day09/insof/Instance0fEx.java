package com.kh.day09.insof;

public class Instance0fEx {
	static void print(Person p) {
		//Person p = new Student();
//		if(p instanceof Person)
//			System.out.println("Person�Դϴ�!");
		if(p instanceof Student)
			System.out.println("Student�Դϴ�!");
		if(p instanceof Researcher)
			System.out.println("Researcher�Դϴ�!");
		if(p instanceof Professor) {
			System.out.println("Professor�Դϴ�!");
		}
	}
	
	public static void main(String [] args) {
		print(new Person());
		// Person p = new Student();
		//The method print(Person) in the type Instance0fEx is not applicable for the arguments (Student)
		print(new Student());
		print(new Researcher());
		print(new Professor());
	}
}
