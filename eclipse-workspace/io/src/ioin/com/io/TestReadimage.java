package ioin.com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestReadimage {
	public static void main(String[] args)throws Exception {
		FileInputStream in = new FileInputStream("C:\\Users\\hp\\Desktop\\Image\\01_37.jpg");
		FileOutputStream out = new FileOutputStream("C:\\Users\\hp\\Desktop\\Image\\nicepic.jpg");
		int ch = in.read();
		while (ch!=-1) {
			out.write((char)ch);
			ch=in.read();
		} 
		
		out.close();
		in.close();
	}
}
