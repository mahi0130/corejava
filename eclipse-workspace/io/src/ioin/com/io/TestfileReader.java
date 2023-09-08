package ioin.com.io;

import java.io.FileReader;

public class TestfileReader {
	public static void main(String[] args)throws Exception {
		FileReader file = new FileReader("C:\\Users\\hp\\Desktop\\mahi//mahi.txt");
		int k=file.read();
		while(k!=-1) {
			System.out.println((char)k);
			k=file.read();
		}
		file.close();
	}
}
