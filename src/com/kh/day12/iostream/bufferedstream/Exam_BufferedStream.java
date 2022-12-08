package com.kh.day12.iostream.bufferedstream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exam_BufferedStream {
	public static void main(String [] args) {
		// ���� ũ�⸦ 5�� �ϰ�, ǥ�� ��� ��Ʈ��(System.out)�� ������
		// ���� ��� ��Ʈ���� �����϶�!
		// C:\Temp\text2.txt ������ ����� ���� �ؽ�Ʈ�� �о�
		// ���� ��� ��Ʈ���� ���� ����϶�!!
		// ���� �Է¿�
		FileReader fir = null;	
		int readChar;
		try {
			fir = new FileReader("C:\\Temp\\kh.txt");
			// �ܼ� ��¿�
			BufferedOutputStream bout 
			= new BufferedOutputStream(System.out, 5);
			while((readChar = fir.read()) != -1) {
				bout.write(readChar);
			}
			new Scanner(System.in).nextLine();
			//bout.flush();
			bout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fir.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
