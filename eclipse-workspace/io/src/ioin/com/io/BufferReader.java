package ioin.com.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReader {
	public static void main(String[] args)throws Exception {
		FileReader file = new FileReader("C:\\Users\\hp\\Desktop\\mahi//mahi.txt");
		BufferedReader in = new BufferedReader(file);
		String line = in.readLine();
		while(line!=null) {
			System.out.println(line);
			line=in.readLine();
		}
		in.close();
		file.close();
		
			
			}
}
