package com.capg.Lab8.Multithreading;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDataThread extends Thread {
	
	InputStream is = null;
	OutputStream os = null;
	public CopyDataThread(InputStream is, OutputStream os) {
		this.is = is;
		this.os = os;
	}

	public void run() {
			
			int read, count = 0;
			try {
				while((read=is.read())>0) {
					count++;
					if(count == 10) {
						os.write(read);
						System.out.println("10 characters are copied");
						Thread.sleep(5000);
					}
					else {
						os.write(read);
					}
					
				}
				os.flush();
			} catch (IOException | InterruptedException e1) {
				
				e1.printStackTrace();
			}
		
	}
}