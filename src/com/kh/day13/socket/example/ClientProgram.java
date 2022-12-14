package com.kh.day13.socket.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientProgram {
	public static void main(String[] args) {
		Socket socket = null;
		// ������ ���� �� ����ؾ� �ϴ� ��Ʈ����?
		// 1. IO��Ʈ��
		// 2. �Է½�Ʈ��
		// 3. ��½�Ʈ��!!!!!!!
		InputStream is = null;
		OutputStream os = null;
		try {
			// Unhandled exception type IOException
			System.out.println("�����û");
			socket = new Socket("127.0.0.1", 4885);
			System.out.println("���Ἲ��!!");
			//////////////������ ������/////////////
			byte [] buf = null;
			String message = "";
			os = socket.getOutputStream();
			message = "Hello Server";
			buf = message.getBytes();
			os.write(buf);
			os.flush();
			System.out.println("������ ���� �Ϸ�");
			////////////////////////////////
			
			////////// ������ �ޱ� /////////
			is = socket.getInputStream();
			buf = new byte[100];
			int readByteNo = is.read(buf);
			message = new String(buf, 0, readByteNo);
			System.out.println("������ �ޱ� ���� : " + message);
			////////////////////////////////////////////////////
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
