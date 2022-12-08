package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Exam_Read {
	public static void main(String[] args) {
		// ����Ʈ ��� ��Ʈ��
		InputStream is = null;
		// ���� ��� ��Ʈ��
		Reader reader = null;
		try {
			// Unhandled exception type FileNotFoundException
			reader = new FileReader("src/iostream/filereader.txt");
			while(true) {
				// Unhandled exception type
				int readData = reader.read();
				if(readData == -1) break;
				System.out.println((char)readData);
			}	
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//�ݵ�� ����Ǿ�� �ϴ� �ڵ� �ۼ�
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
