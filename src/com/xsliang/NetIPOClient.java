package com.xsliang;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class NetIPOClient {
	public static void main(String[] args) {
		int count = 0;
		try {
			Socket socket = new Socket("127.0.0.1", 18088);
			DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
			outputStream.writeUTF("client say nihao");
			while (socket.isConnected()) {
				DataInputStream inputStream = new DataInputStream(socket.getInputStream());
				System.out.println("socket client revevice:" + inputStream.readUTF());
				Thread.sleep(5000);
				outputStream.writeUTF("client say nihao" + count++);
			}
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
