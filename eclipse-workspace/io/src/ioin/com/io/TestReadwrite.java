package ioin.com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class TestReadwrite {
	public static void main(String[] args)throws Exception {
		FileReader read = new FileReader("C:\\Users\\hp\\Desktop\\mahi\\mahi.txt");
		BufferedReader in = new BufferedReader(read);
		FileWriter Write = new FileWriter ("C:\\Users\\hp\\Desktop\\mahi\\shiv.txt",true);
		PrintWriter out = new PrintWriter(Write);
		String line = in.readLine();
		while(line!=null) {
			out.println(line);
			line = in.readLine();
		}
		out.close();
		in.close();
		Write.close();
		read.close();
		
	}
}
