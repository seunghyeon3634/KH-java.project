package com.kh.day07.student;

public class StudentRun {
	public static void main(String [] args) {
		StudentFunction sFunc = new StudentFunction();
		End :
			while(true) {
				int input = sFunc.printMenu();
				switch(input) {
					case 1 : 
						sFunc.intputScore();
						break;
					case 2 : 
						sFunc.printScore();
						break;
					case 3 : break End;
					default : break;
			}
		}
	}
}
