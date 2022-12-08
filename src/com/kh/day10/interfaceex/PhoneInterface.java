package com.kh.day10.interfaceex;

public interface PhoneInterface {
	//1. Illegal modifier for the interface field PhoneInterface.name
	// only public, static & final are permitted
	public String name = "";
	//name = "Hello World"; // X, ������̶� �ٲ��� ����.
	public static final int Time_out = 10000;
	public void sendCall();
	public abstract void receiveCall();
	// 2. Abstract methods do not specify a body
	abstract void printLogo();
	void displayNumber();
	public default void showLogo() {	// ����Ʈ �޼ҵ�
		// ���� ȣȯ���� ���ؼ� �ۼ��Ѵ�.
		// ��, ���� ȣȯ���� �����ϰ� �������̽��� ������ ���� �ۼ�
		System.out.println("** LG **");
	}
}
