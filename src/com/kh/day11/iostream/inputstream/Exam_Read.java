package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String [] args) {
		// Cannot instantiate the type InputStream
		InputStream is = null;
		
		//Unhandled exception type FileNotFoundException
		// -> �ݵ�� try ~ catch ����� �ϴ� Exception
		try {	
			is = new FileInputStream("src/iostream/inputStream.txt");
			// Unhandled exception type IOException
			int readByte;
			while(true) {
				readByte = is.read();
				// ������ �׸� �о�!!
				if (readByte == -1) break;
				// Unreachable code
				System.out.println((char)readByte);
			}
		} catch (FileNotFoundException e) {
			//	TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}